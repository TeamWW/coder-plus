package com.lucifiere.bootstrap;

import cn.hutool.core.util.ReflectUtil;
import com.google.common.base.Preconditions;
import com.google.common.collect.Sets;
import com.lucifiere.common.ClassPathScanHandler;
import com.lucifiere.common.Constants;
import com.lucifiere.common.GlobalContext;
import com.lucifiere.common.GlobalContextAware;
import com.lucifiere.exporter.Exporter;
import com.lucifiere.extract.Model;
import com.lucifiere.render.View;
import com.lucifiere.render.executor.ConfigurableRendersExecutor;
import com.lucifiere.render.executor.HandlerRequest;
import com.lucifiere.render.executor.HandlerResponse;
import com.lucifiere.render.executor.RenderWrapper;
import com.lucifiere.resovler.Resolver;
import com.lucifiere.resovler.ResolverReq;

import java.util.List;
import java.util.Set;
import java.util.function.Supplier;
import java.util.stream.Stream;

/**
 * 启动类
 *
 * @author XD.Wang
 * Date 2020-8-2.
 */
public abstract class Bootstrap {

    private static final Set<Class<?>> CLASSES = Sets.newHashSet();

    static {
        ClassPathScanHandler handler = new ClassPathScanHandler();
        Set<Class<?>> allClasses = handler.getPackageAllClasses(Constants.CLASSES_SCAN_PATH, true);
        CLASSES.addAll(allClasses);
    }

    /**
     * 串联组件（基于接口）
     */
    public void execute() {
        GlobalContext context = createGlobalContext();
        Preconditions.checkNotNull(context, "上下文信息不能为空！");
        contextCheckBeforeExecute(context);
        processGlobalContextAware();
        Resolver resolver = context.resolver();
        ResolverReq resolverReq = createResolverReq();
        Model model = resolver.resolve(resolverReq);
        List<View> views = renderViews(model);
        Exporter exporter = context.exporter();
        exporter.export(views);
    }

    /**
     * 利用执行器去按序渲染模板 1 -> N
     *
     * @param model 数据
     * @return 模型
     */
    private List<View> renderViews(Model model) {
        RenderWrapper renderHeader = createRenderChain();
        ConfigurableRendersExecutor rendersExecutor = new ConfigurableRendersExecutor(renderHeader);
        HandlerRequest req = new HandlerRequest();
        req.setModel(model);
        HandlerResponse resp = new HandlerResponse();
        rendersExecutor.execute(req, resp);
        return resp.getViews();
    }

    private void contextCheckBeforeExecute(GlobalContext context) {
        Preconditions.checkNotNull(context, "上下文信息不能为空！");
        Preconditions.checkNotNull(context.workspacePath(), "工作目录不能为空！");
        Preconditions.checkNotNull(context.exporter(), "输出工具不能为空！");
        Preconditions.checkNotNull(context.extractor(), "提取工具不能为空！");
        Preconditions.checkNotNull(context.extractor(), "解析工具不能为空！");
    }

    /**
     * 按需进行全局上下文注入
     */
    public void processGlobalContextAware() {
        Stream.of(CLASSES).forEach(component -> {
            if (component instanceof GlobalContextAware globalContextAware) {
                ReflectUtil.invoke(globalContextAware, "setGlobalContext", component);
            }
        });
    }

    private <T> T requireAndCheck(Supplier<T> supplier) {
        T r = supplier.get();
        Preconditions.checkNotNull(r, "必要参数不能为空！");
        return r;
    }

    /**
     * 组装全局上下文
     *
     * @return 全局上下文
     */
    protected abstract GlobalContext createGlobalContext();

    /**
     * 组装解析器入参
     *
     * @return 全局上下文
     */
    protected abstract ResolverReq createResolverReq();

    /**
     * 组装模板链
     *
     * @return 模板链
     */
    protected abstract RenderWrapper createRenderChain();

}
