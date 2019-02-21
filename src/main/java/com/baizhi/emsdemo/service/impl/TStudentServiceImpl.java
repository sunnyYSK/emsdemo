package com.baizhi.emsdemo.service.impl;

import com.baizhi.emsdemo.entity.TStudent;
import com.baizhi.emsdemo.dao.TStudentDao;
import com.baizhi.emsdemo.service.TStudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * (TStudent)表服务实现类
 *
 * @author makejava
 * @since 2019-02-20 16:39:11
 */
@Service("tStudentService")
public class TStudentServiceImpl implements TStudentService {
    @Resource
    private TStudentDao tStudentDao;

    /**
     * 通过ID查询单条数据
     */
    @Override
    public TStudent getById(Integer id) {
        return this.tStudentDao.selectById(id);
    }

    /**
     * 新增数据
     */
    @Override
    public void insert(TStudent tStudent) {
        this.tStudentDao.insert(tStudent);
    }

    /**
     * 修改数据
     */
    @Override
    public void update(TStudent tStudent) {
        this.tStudentDao.updateById(tStudent);
    }

    /**
     * 通过主键删除数据
     */
    @Override
    public void deleteById(Integer id) {
        this.tStudentDao.deleteById(id);
    }

    @Override
    public List<TStudent> getAll() {
        return tStudentDao.selectList(null);
    }
}