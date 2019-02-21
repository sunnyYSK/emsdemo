package com.baizhi.emsdemo.service.impl;

import com.baizhi.emsdemo.entity.TUser;
import com.baizhi.emsdemo.dao.TUserDao;
import com.baizhi.emsdemo.service.TUserService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * (TUser)表服务实现类
 *
 * @author makejava
 * @since 2019-02-20 17:04:27
 */
@Service("tUserService")
public class TUserServiceImpl implements TUserService {
    @Resource
    private TUserDao tUserDao;

    /**
     * 通过ID查询单条数据
     */
    @Override
    public TUser getOne(String username,String password) {
        QueryWrapper<TUser> wrapper = new QueryWrapper<>();
        wrapper.eq("username",username).eq("password",password);
        TUser tUser = tUserDao.selectOne(wrapper);
        return tUser;
    }

    /**
     * 新增数据
     */
    @Override
    public void insert(TUser tUser) {
        this.tUserDao.insert(tUser);
    }

}