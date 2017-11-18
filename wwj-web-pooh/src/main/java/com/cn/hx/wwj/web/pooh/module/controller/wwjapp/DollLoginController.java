package com.cn.hx.wwj.web.pooh.module.controller.wwjapp;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cn.hx.wwj.web.pooh.module.entity.system.Doll;
import com.cn.hx.wwj.web.pooh.module.service.system.doll.DollManager;
import com.cn.hx.wwj.web.pooh.module.util.wwjUtil.DollRegUtil;
import com.cn.hx.wwj.web.pooh.module.util.wwjUtil.MyUUID;
import com.cn.hx.wwj.web.pooh.module.util.wwjUtil.RedisUtil;
import com.cn.hx.wwj.web.pooh.module.util.wwjUtil.RespStatus;

import net.sf.json.JSONObject;


/**
 * 网关注册效验接口
 *
 * @author wjy
 * 2017/11/07
 */
@Controller
@RequestMapping(value = "/doll")
public class DollLoginController {
    @Resource(name = "dollService")
    private DollManager dollService;

    @RequestMapping(value = "/login", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    @ResponseBody
    public JSONObject dollLogin(@RequestParam("sn") String sn, @RequestParam("code") String code) {

        try {
            Doll doll = dollService.getDollBySN(sn);
            String localCode = DollRegUtil.getCode(sn);
            if (!localCode.equals(code)) {
                return RespStatus.fail("fail");
            }
            if (doll == null) {
                int a = dollService.regDollBySN(sn);
                if (a != 1) {
                    return RespStatus.fail("fail");
                }
                Doll newDoll = dollService.getDollBySN(sn);
                String dollId = newDoll.getDOLL_ID();
                String sessionID = MyUUID.createSessionId();
                RedisUtil.getRu().set("sessionId:gateway:"+ dollId, sessionID);
                return RespStatus.successs().element("sessionID", sessionID).element("roomID", dollId);
            } else {
                String dollId = doll.getDOLL_ID();
                String sessionID = MyUUID.createSessionId();
                RedisUtil.getRu().set("sessionId:gateway:" + dollId, sessionID);
                return RespStatus.successs().element("sessionID", sessionID).element("roomID", dollId);

            }
        } catch (Exception e) {
            e.printStackTrace();
            return RespStatus.exception();
        }


    }


}
