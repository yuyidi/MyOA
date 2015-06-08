package com.yyd.myoa.service.tag;

import static freemarker.template.ObjectWrapper.DEFAULT_WRAPPER;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.alibaba.fastjson.JSON;
import com.yyd.myoa.dto.Menu;
import com.yyd.myoa.service.SysFunService;

import freemarker.core.Environment;
import freemarker.template.TemplateDirectiveBody;
import freemarker.template.TemplateDirectiveModel;
import freemarker.template.TemplateException;
import freemarker.template.TemplateModel;

@Component
public class SysFunTag implements TemplateDirectiveModel {
	@Autowired
	private SysFunService sysFunSerice;
	
	@Override
	public void execute(Environment env, Map params, TemplateModel[] loopVars,
			TemplateDirectiveBody body) throws TemplateException, IOException {
		List<Menu> menu = sysFunSerice.select();
		env.setVariable("tag_sysfun_list",DEFAULT_WRAPPER.wrap(menu));
		body.render(env.getOut());
	}

}
