package com.cn.hx.wwj.web.pooh.module.controller.information.linkage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.cn.hx.wwj.web.pooh.module.controller.base.BaseController;
import com.cn.hx.wwj.web.pooh.module.entity.system.Dictionaries;
import com.cn.hx.wwj.web.pooh.module.service.system.dictionaries.DictionariesManager;
import com.cn.hx.wwj.common.web.util.AppUtil;
import com.cn.hx.wwj.common.page.core.PageData;
import com.cn.hx.wwj.common.web.util.Tools;

/**
 * @author Administrator
 *
 */
/** 
 * 说明：明细表
 * 创建人：FH Q 3 13596 790
 * 创建时间：2016-05-19
 */
@Controller
@RequestMapping(value="/linkage")
public class Linkage extends BaseController{
	
	String menuUrl = "linkage/view.do"; //菜单地址(权限用)
	
	@Resource(name="dictionariesService")
	private DictionariesManager dictionariesService;
	
	/**去新增页面
	 * @param
	 * @throws Exception
	 */
	@RequestMapping(value="/view")
	public ModelAndView goAdd()throws Exception{
		ModelAndView mv = this.getModelAndView();
		mv.setViewName("information/linkage/view");
		return mv;
	}
	
	/**获取连级数据
	 * @return
	 */
	@RequestMapping(value="/getLevels")
	@ResponseBody
	public Object getLevels(){
		Map<String,Object> map = new HashMap<String,Object>();
		String errInfo = "success";
		PageData pd = new PageData();
		try{
			pd = this.getPageData();
			String DICTIONARIES_ID = pd.getString("DICTIONARIES_ID");
			DICTIONARIES_ID = Tools.isEmpty(DICTIONARIES_ID)?"0":DICTIONARIES_ID;
			List<Dictionaries>	varList = dictionariesService.listSubDictByParentId(DICTIONARIES_ID); //用传过来的ID获取此ID下的子列表数据
			List<PageData> pdList = new ArrayList<PageData>();
			for(Dictionaries d :varList){
				PageData pdf = new PageData();
				pdf.put("DICTIONARIES_ID", d.getDICTIONARIES_ID());
				pdf.put("NAME", d.getNAME());
				pdList.add(pdf);
			}
			map.put("list", pdList);	
		} catch(Exception e){
			errInfo = "error";
			logger.error(e.toString(), e);
		}
		map.put("result", errInfo);				//返回结果
		return AppUtil.returnObject(new PageData(), map);
	}

}
