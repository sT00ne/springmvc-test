package com.hello.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.hello.model.User;
import com.hello.service.MybatisUtil;

public class UserDao implements UserMapper {

	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int insert(User record) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int insertSelective(User record) {
		// TODO Auto-generated method stub
		return 0;
	}

	public User selectByPrimaryKey(Integer id) {
		SqlSession session = MybatisUtil.getInstance().openSession();
		
		User member = session.selectOne("com.hello.dao.UserMapper.selectByPrimaryKey", id);
		session.close();
			
		return member;
	}

	public int updateByPrimaryKeySelective(User record) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int updateByPrimaryKey(User record) {
		// TODO Auto-generated method stub
		return 0;
	}

}
