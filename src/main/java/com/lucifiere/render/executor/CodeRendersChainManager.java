package com.lucifiere.render.executor;

import cn.hutool.core.collection.CollectionUtil;
import cn.hutool.core.util.StrUtil;
import com.google.common.base.Preconditions;
import com.lucifiere.container.GlobalContext;
import com.lucifiere.container.GlobalContextAware;
import com.lucifiere.render.freemarker.CodeViewRender;
import com.lucifiere.templates.spec.TemplateSpec;

import java.util.List;
import java.util.stream.Collectors;

/**
 * 责任链管理
 *
 * @author XD.Wang
 * Date 2020/7/25.
 */
public class CodeRendersChainManager implements GlobalContextAware {

    private GlobalContext globalContext;

    private static volatile CodeRendersChainManager MANAGER;

    @Override
    public void setGlobalContext(GlobalContext globalContext) {
        this.globalContext = globalContext;
    }

    public static CodeRendersChainManager getManager() {
        if (MANAGER == null) {
            MANAGER = new CodeRendersChainManager();
        }
        return MANAGER;
    }

    private RenderWrapper chainingNode(List<RenderWrapper> handlers) {
        for (int i = 0; i < handlers.size() - 1; i++) {
            handlers.get(i).nextIs(handlers.get(i + 1));
        }
        return handlers.get(0);
    }

    public RenderWrapper chaining(List<String> templateIds) {
        Preconditions.checkArgument(templateIds != null && templateIds.size() > 0, "必须指定需要渲染的模板");
        var templateSpecs = globalContext.getAllTemplates();
        Preconditions.checkArgument(CollectionUtil.isNotEmpty(templateSpecs), "尚未未注册任何模板！");
        var missingTemplateIds = templateIds.stream()
                .filter(tId -> !templateSpecs.stream().map(TemplateSpec::getId).collect(Collectors.toSet()).contains(tId))
                .collect(Collectors.joining(","));
        Preconditions.checkArgument(StrUtil.isBlank(missingTemplateIds), "模板" + missingTemplateIds + "不存在！");
        return chainingNode(templateIds.stream().map(CodeViewRender::new).map(DefaultRenderWrapper::new).collect(Collectors.toList()));
    }

}
