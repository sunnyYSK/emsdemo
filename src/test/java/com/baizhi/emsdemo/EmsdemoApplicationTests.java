package com.baizhi.emsdemo;

import com.baizhi.emsdemo.dao.TStudentDao;
import com.baizhi.emsdemo.dao.TUserDao;
import com.baizhi.emsdemo.entity.TStudent;
import com.baizhi.emsdemo.entity.TUser;
import com.baizhi.emsdemo.service.TStudentService;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmsdemoApplicationTests {

	@Autowired
	private TStudentDao tStudentDao;

	@Autowired
	private TStudentService tStudentService;

	@Autowired
	private TUserDao tUserDao;


	@Test
	public void contextLoads() {
		List<TStudent> tStudents = tStudentDao.selectList(null);
		for (TStudent tStudent : tStudents) {
			System.out.println(tStudent);
		}
	}

	@Test
	public void contextLoads1() {
		List<TStudent> tStudents = tStudentService.getAll();
		for (TStudent tStudent : tStudents) {
			System.out.println(tStudent);
		}
	}

	@Test
	public void contextLoads2() {
		QueryWrapper<TUser> wrapper = new QueryWrapper<>();
		wrapper.eq("username","123456").eq("password","123456");
		TUser tUser = tUserDao.selectOne(wrapper);
		System.out.println(tUser);
	}

	@Test
	public void contextLoads3() {
		TUser tUser = new TUser();
		tUser.setId("6");
		tUser.setUsername("qwe");
		tUser.setPassword("qwe");
		int insert = tUserDao.insert(tUser);
		System.out.println(insert);
	}
}
