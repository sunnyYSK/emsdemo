package com.baizhi.emsdemo.controller;

import com.baizhi.emsdemo.entity.TStudent;
import com.baizhi.emsdemo.service.TStudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * (TStudent)表控制层
 *
 * @author makejava
 * @since 2019-02-20 16:39:30
 */
@Controller
@RequestMapping("/tStudent")
public class TStudentController {
    /**
     * 服务对象
     */
    @Resource
    private TStudentService tStudentService;

    /**
     * 通过主键查询单条数据
     */
    @RequestMapping("/getOne")
    public String getOne(Integer id,Map map) {
        map.put("up",tStudentService.getById(id));
        return "updateEmp";
    }
    
    /**
     * 添加数据
     */
    @RequestMapping("/insertTStudent")
    @ResponseBody
    public boolean insertTStudent(TStudent tStudent){
        try {
            tStudentService.insert(tStudent);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    /**
     * 修改数据
     */
    @RequestMapping("/updateTStudent")
    @ResponseBody
    public boolean updateTStudent(TStudent tStudent){
        try {
            System.out.println(tStudent);
            tStudentService.update(tStudent);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    /**
     * 通过主键删除数据
     */
    @RequestMapping("/deleteTStudentById")
    @ResponseBody
    public boolean deleteTStudentById(Integer id){
        try {
            tStudentService.deleteById(id);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @RequestMapping("/getAll")
    public String getAll(Map map){
        map.put("ss",tStudentService.getAll());
        return "emplist";
    }
}