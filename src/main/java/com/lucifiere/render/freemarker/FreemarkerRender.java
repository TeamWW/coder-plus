package com.lucifiere.render.freemarker;

import cn.hutool.log.StaticLog;
import com.lucifiere.model.Model;
import com.lucifiere.render.AbstractRender;
import com.lucifiere.utils.GlobalContextHolder;
import freemarker.template.Template;
import freemarker.template.TemplateException;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;

public abstract class FreemarkerRender extends AbstractRender {

    public FreemarkerRender(String templateId) {
        super(templateId);
    }

    @Override
    protected String doRender(Model model) {
        Writer out = new StringWriter();
        try {
            String templateId = template.getTemplateSpec().getId();
            FreemarkerTemplateManager manager = FreemarkerTemplateManager.getManager();
            Template template = manager.getTemplate(templateId);
            template.process(model.extractAttrs(), out);
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
