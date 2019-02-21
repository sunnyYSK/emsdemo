package com.baizhi.emsdemo.service;

import com.baizhi.emsdemo.entity.TStudent;
import java.util.List;
import java.util.Map;

/**
 * (TStudent)表服务接口
 *
 * @author makejava
 * @since 2019-02-20 16:39:11
 */
public interface TStudentService {

    /**
     * 通过ID查询单条数据
     */
    TStudent getById(Integer id);

    /**
     * 新增数据
     */
    void insert(TStudent tStudent);

    /**
     * 修改数据
     */
    void update(TStudent tStudent);

    /**
     * 通过主键删除数据
     */
    void deleteById(Integer id);

    /**
     * 查询全部数据
     */
    List<TStudent> getAll();

}