package com.cn.hx.wwj.web.pooh.module.controller.system.gateway;

import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import com.cn.hx.wwj.web.pooh.module.controller.base.BaseController;
import com.cn.hx.wwj.common.page.core.Page;
import com.cn.hx.wwj.common.web.util.AppUtil;
import com.cn.hx.wwj.web.pooh.module.util.ObjectExcelView;
import com.cn.hx.wwj.common.page.core.PageData;
import com.cn.hx.wwj.web.pooh.module.util.Jurisdiction;
import com.cn.hx.wwj.common.web.util.Tools;
import com.cn.hx.wwj.web.pooh.module.service.system.gateway.GatewayManager;

/** 
 * 说明：获取在线网关
 * * 创建时间：2017-11-07
 */
@Controller
@RequestMapping(value="/gateway")
public class GatewayController extends BaseController {
	
	String menuUrl = "gateway/list.do"; //菜单地址(权限用)
	@Resource(name="gatewayService")
	private GatewayManager gatewayService;
	

	/**列表
	 * @param page
	 * @throws Exception
	 */
	@RequestMapping(value="/list")
	public ModelAndView list(Page page) throws Exception{
		logBefore(logger, Jurisdiction.getUsername()+"列表Gateway");
		//if(!Jurisdiction.buttonJurisdiction(menuUrl, "cha")){return null;} //校验权限(无权查看时页面会有提示,如果不注释掉这句代码就无法进入列表页面,所以根据情况是否加入本句代码)
		ModelAndView mv = this.getModelAndView();
		PageData pd = new PageData();
		pd = this.getPageData();
		String keywords = pd.getString("keywords");				//关键词检索条件
		if(null != keywords && !"".equals(keywords)){
			pd.put("keywords", keywords.trim());
		}
		page.setPd(pd);
		List<PageData>	varList = gatewayService.list(page);	//列出Gateway列表
		mv.setViewName("system/gateway/gateway_list");
		mv.addObject("varList", varList);
		mv.addObject("pd", pd);
		mv.addObject("QX",Jurisdiction.getHC());	//按钮权限
		return mv;
	}
	
	@InitBinder
	public void initBinder(WebDataBinder binder){
		DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		binder.registerCustomEditor(Date.class, new CustomDateEditor(format,true));
	}
}
