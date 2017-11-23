package com.cn.hx.wwj.web.pooh.module.sys.ctrl;


import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cn.hx.wwj.common.page.core.PageData;
import com.cn.hx.wwj.facade.api.appuser.service.AppUserFacade;

@Controller
@RequestMapping("/app/user")
public class AppUserCtrl {

	private static Logger log = LoggerFactory.getLogger(AppUserCtrl.class);
	
	@Autowired
	private AppUserFacade appUserFacade;


	
	@RequestMapping("/findByUsername")
	@ResponseBody
	public PageData findByUsername(Model model,HttpServletRequest request) throws Exception {
		PageData pw=new PageData();
		pw.put("USERNAME","API");
		pw=appUserFacade.findByUsername(pw);
		return pw;
	}
}
