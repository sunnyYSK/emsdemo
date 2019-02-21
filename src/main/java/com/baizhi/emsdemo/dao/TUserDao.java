package com.baizhi.emsdemo.dao;

import com.baizhi.emsdemo.entity.TUser;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (TUser)表数据库访问层
 *
 * @author makejava
 * @since 2019-02-20 17:04:27
 */
public interface TUserDao extends BaseMapper<TUser>{
}