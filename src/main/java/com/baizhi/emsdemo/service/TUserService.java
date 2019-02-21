package com.baizhi.emsdemo.service;

import com.baizhi.emsdemo.entity.TUser;
import java.util.List;
import java.util.Map;

/**
 * (TUser)表服务接口
 *
 * @author makejava
 * @since 2019-02-20 17:04:27
 */
public interface TUserService {

    /**
     * 通过ID查询单条数据
     */
    TUser getOne(String username,String password);

    /**
     * 新增数据
     */
    void insert(TUser tUser);

}