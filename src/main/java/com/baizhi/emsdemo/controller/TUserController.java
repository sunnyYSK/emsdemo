package com.baizhi.emsdemo.controller;

import com.baizhi.emsdemo.entity.TUser;
import com.baizhi.emsdemo.service.TUserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * (TUser)表控制层
 *
 * @author makejava
 * @since 2019-02-20 17:04:27
 */
@Controller
@RequestMapping("/tUser")
public class TUserController {
    /**
     * 服务对象
     */
    @Resource
    private TUserService tUserService;

    /**
     * 通过主键查询单条数据
     */
    @RequestMapping("/getOne")
    public String getOne(String username,String password,HttpSession session) {
        TUser one = tUserService.getOne(username, password);
        if (one != null) {
            session.setAttribute("user", one);
            return "redirect:/tStudent/getAll";
        } else {
            return "redirect:/index.jsp";
        }
    }

    /**
     * 添加数据
     */
    @RequestMapping("/insertTUser")
    @ResponseBody
    public boolean insertTUser(TUser tUser){
        try {
            tUserService.insert(tUser);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

}