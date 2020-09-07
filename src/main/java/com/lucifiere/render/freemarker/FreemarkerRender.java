package com.lucifiere.render.freemarker;

import cn.hutool.log.StaticLog;
import com.lucifiere.model.Model;
import com.lucifiere.render.AbstractRender;
import freemarker.template.TemplateException;

import java.io.IOException;
import java.io.StringWriter;

public abstract class FreemarkerRender extends AbstractRender {

    private final FreemarkerTemplateManager freemarkerTemplateManager = FreemarkerTemplateManager.getManager();

    public FreemarkerRender(String templateId) {
        super(templateId);
    }

    @Override
    protected String doRender(Model model) {
        var out = new StringWriter();
        try {
            var templateId = template.getTemplateSpec().getId();
            var template = freemarkerTemplateManager.getTemplate(templateId);
            template.process(model, out);
            return out.toString();
        } catch (TemplateException e) {
            StaticLog.error("模板操作执行失败！" + e.getMessage(), e);
            return null;
        } catch (IOException e) {
            StaticLog.error("IO操作失败！" + e.getMessage(), e);
            return null;
        } catch (Exception e) {
            StaticLog.error("执行失败！" + e.getMessage(), e);
            return null;
        } finally {
            try {
                out.close();
            } catch (IOException e) {
                StaticLog.error("IO关闭失败！" + e.getMessage(), e);
            }
        }
    }

}
