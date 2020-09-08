package com.lucifiere.bootstrap;

import cn.hutool.core.collection.CollectionUtil;
import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;
import com.lucifiere.common.GlobalConfig;
import com.lucifiere.container.GlobalContext;
import com.lucifiere.extract.Extractor;
import com.lucifiere.model.Model;
import com.lucifiere.render.View;
import com.lucifiere.render.executor.CodeRendersChainManager;
import com.lucifiere.render.executor.ConfigurableRendersExecutor;
import com.lucifiere.render.executor.HandlerRequest;
import com.lucifiere.render.executor.HandlerResponse;

import java.util.List;

/**
 * 启动器
 * 根据外部配置串联框架中的各组件，并定义了内容生成的主干逻辑
 *
 * @author XD.Wang
 * Date 2020-8-2.
 */
public abstract class Bootstrap {

    /**
     * 基于模板来生成内容
     *
     * @param templateIds 模板ID
     */
    public void execute(String... templateIds) {
        execute(Lists.newArrayList(templateIds));
    }

    /**
     * 基于模板来生成内容
     *
     * @param templateIds 模板ID
     */
    public void execute(List<String> templateIds) {
        Preconditions.checkArgument(CollectionUtil.isNotEmpty(templateIds), "模板ID不能为空！");
        var config = configureContext();
        contextCheckBeforeExecute(config);
        var context = GlobalContext.create(config);
        var model = context.calByComponent(config.extractor(), Extractor::extract);
        var views = renderViews(model, templateIds);
        context.doWithComponent(config.exporter(), exporter -> exporter.export(views));
    }

    /**
     * 利用执行器去按序渲染模板 1 -> N
     *
     * @param model 数据
     * @return 模型
     */
    private List<View> renderViews(Model model, List<String> templateIds) {
        var renderHeader = CodeRendersChainManager.getManager().chaining(templateIds);
        var rendersExecutor = new ConfigurableRendersExecutor(renderHeader);
        var req = new HandlerRequest();
        req.setModel(model);
        var resp = new HandlerResponse();
        rendersExecutor.execute(req, resp);
        return resp.getViews();
    }

    private void contextCheckBeforeExecute(GlobalConfig config) {
        Preconditions.checkNotNull(config, "上下文信息不能为空！");
        Preconditions.checkNotNull(config.workspacePath(), "工作目录不能为空！");
        Preconditions.checkNotNull(config.exporter(), "输出工具不能为空！");
        Preconditions.checkNotNull(config.extractor(), "提取工具不能为空！");
        Preconditions.checkNotNull(config.resolver(), "解析工具不能为空！");
    }

    /**
     * 获取上下文
     *
     * @return 获取上下文
     */
    protected abstract GlobalConfig configureContext();

}
