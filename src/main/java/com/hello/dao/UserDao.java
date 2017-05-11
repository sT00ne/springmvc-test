package com.hello.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.hello.model.School;
import com.hello.model.User;
import com.hello.service.MybatisUtil;

public class UserDao implements UserMapper {

	public int deleteByPrimaryKey(Integer id) {
		SqlSession session = MybatisUtil.getInstance().openSession();
		try {
			session.insert("com.hello.dao.UserMapper.deleteByPrimaryKey", id);
			session.commit();
			session.close();
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		} finally {
			session.close();
		}
	}

	public int insert(User record) {
		SqlSession session = MybatisUtil.getInstance().openSession();
		try {
			session.insert("com.hello.dao.UserMapper.insertSelective", record);
			session.commit();
			session.close();
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		} finally {
			session.close();
		}
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
		SqlSession session = MybatisUtil.getInstance().openSession();
		try {
			session.update("com.hello.dao.UserMapper.updateByPrimaryKeySelective", record);
			session.commit();
			session.close();
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		} finally {
			session.close();
		}
	}

	public int updateByPrimaryKey(User record) {
		// TODO Auto-generated method stub
		return 0;
	}

	public List<User> getUserList() {
		SqlSession session = MybatisUtil.getInstance().openSession();
		try {
			List<User> user = session.selectList("com.hello.dao.UserMapper.selectUserlList");
			return user;
		} catch (Exception ex) {
			System.err.println("Caught IOException: " + ex.getMessage());
			return null;
		} finally {
			session.close();
		}

	}

}
