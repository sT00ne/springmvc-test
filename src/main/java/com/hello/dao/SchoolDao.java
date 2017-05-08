package com.hello.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.hello.model.School;
import com.hello.service.MybatisUtil;

public class SchoolDao implements SchoolMapper {

	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int insert(School record) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int insertSelective(School record) {
		// TODO Auto-generated method stub
		return 0;
	}

	public School selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	public int updateByPrimaryKeySelective(School record) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int updateByPrimaryKey(School record) {
		// TODO Auto-generated method stub
		return 0;
	}

	public List<School> getSchoolList() {
		SqlSession session = MybatisUtil.getInstance().openSession();
		try {
			List<School> school = session.selectList("com.hello.dao.SchoolMapper.selectSchoolList");
			return school;
		} catch (Exception ex) {
			System.err.println("Caught IOException: " + ex.getMessage());
			return null;
		} finally {
			session.close();
		}
	}

}
