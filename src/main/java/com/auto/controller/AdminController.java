package com.auto.controller;

import com.auto.entity.AdminInfo;
import com.auto.service.AdminInfoService;
import com.auto.vo.ResultValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/adminCo")
public class AdminController {

    @Autowired
    private AdminInfoService adminInfoService;


    /**
     * 管理员登录方法
     *
     * @param
     * @return
     */
    @RequestMapping(value = "/select")
    public ResultValue select(@RequestParam String adminName, @RequestParam String adminPwd, @RequestParam Integer adminRole) {
        ResultValue rv = new ResultValue();

        try {
            AdminInfo login = this.adminInfoService.adminToLogin(adminName, adminPwd, adminRole);
            if (login != null) {
                rv.setCode(0);

                Map<String, Object> map = new HashMap<>();
                map.put("userMessage", login);
                rv.setMessage("登录成功！");
                rv.setDataMap(map);

                return rv;

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        rv.setCode(1);
        rv.setMessage("登录信息不正确，请重新输入！");
        return rv;
    }


    @PostMapping(value = "/adminLogin")
    public ResultValue adminLogin(@RequestParam String adminName, @RequestParam String adminPwd, @RequestParam Integer adminRole) {
        ResultValue rv = new ResultValue();

        try {
            AdminInfo login = this.adminInfoService.adminToLogin(adminName, adminPwd, adminRole);
            if (login != null) {
                rv.setCode(0);

                Map<String, Object> map = new HashMap<>();
                map.put("userMessage", login);
                rv.setMessage("登录成功！");
                rv.setDataMap(map);

                return rv;

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        rv.setCode(1);
        rv.setMessage("登录信息不正确，请重新输入！");
        return rv;
    }


}
