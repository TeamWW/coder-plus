package com.lucifiere.bootstrap;

import cn.hutool.core.util.ReflectUtil;
import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.lucifiere.common.*;
import com.lucifiere.exporter.Exporter;
import com.lucifiere.extract.Extractor;
import com.lucifiere.extract.Model;
import com.lucifiere.render.View;
import com.lucifiere.render.executor.*;
import com.lucifiere.templates.TemplateContainer;

import java.util.List;
import java.util.Set;
import java.util.function.Supplier;
import java.util.stream.Stream;

/**
 * 启动类，串联组件逻辑，输入外部设置
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

    public void execute(String... templateIds) {
        execute(Lists.newArrayList(templateIds));
    }

    /**
     * 串联组件（基于接口）
     */
    public void execute(List<String> templateIds) {
        GlobalContext context = acquireContext();
        contextCheckBeforeExecute(context);
        processGlobalContextAware(context);
        processContainerAware();
        Extractor extractor = context.extractor();
        Model model = extractor.extract();
        List<View> views = renderViews(model, templateIds);
        Exporter exporter = context.exporter();
        exporter.export(views);
    }

    /**
     * 利用执行器去按序渲染模板 1 -> N
     *
     * @param model 数据
     * @return 模型
     */
    private List<View> renderViews(Model model, List<String> templateIds) {
        RenderWrapper renderHeader = CodeRendersChainManager.getManager().chaining(templateIds);
        ConfigurableRendersExecutor rendersExecutor = new ConfigurableRendersExecutor(renderHeader);
        HandlerRequest req = new HandlerRequest();
        req.setModel(model);
        HandlerResponse resp = new HandlerResponse();
        rendersExecutor.execute(req, resp);
        return resp.getViews();
    }

    private void contextCheckBeforeExecute(GlobalContext context) {
        Preconditions.checkNotNull(context, "上下文信息不能为空！");
        Preconditions.checkNotNull(context, "上下文信息不能为空！");
        Preconditions.checkNotNull(context.workspacePath(), "工作目录不能为空！");
        Preconditions.checkNotNull(context.exporter(), "输出工具不能为空！");
        Preconditions.checkNotNull(context.extractor(), "提取工具不能为空！");
        Preconditions.checkNotNull(context.extractor(), "解析工具不能为空！");
    }

    /**
     * 按需进行全局上下文注入
     */
    public void processGlobalContextAware(GlobalContext context) {
        Stream.of(CLASSES).forEach(component -> {
            if (component instanceof GlobalContextAware globalContextAware) {
                ReflectUtil.invoke(globalContextAware, "setGlobalContext", context);
            }
        });
    }

    public void processContainerAware() {
        TemplateContainer templateContainer = TemplateContainer.init(CLASSES);
        Stream.of(CLASSES).forEach(component -> {
            if (component instanceof TemplateContainerAware templateContainerAware) {
                ReflectUtil.invoke(templateContainerAware, "setTemplateContainer", templateContainer);
            }
        });
    }

    private <T> Supplier<T> requireAndCheck(Supplier<T> supplier) {
        T r = supplier.get();
        Preconditions.checkNotNull(r, "必要参数不能为空！");
        return supplier;
    }

    /**
     * 获取上下文
     *
     * @return 获取上下文
     */
    protected abstract GlobalContext acquireContext();

}