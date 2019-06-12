package com.xdy.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.xdy.bean.Stu;
import com.xdy.dao.StuDao;

@Service
public class StuServiceImpl implements StuService {
	@Resource
	private StuDao dao;
	@Override
	public List<Stu> list() {
		// TODO Auto-generated method stub
		return dao.list();
	}
	@Override
	public List clalist() {
		// TODO Auto-generated method stub
		return dao.clalist();
	}
	@Override
	public int add(Stu stu) {
		// TODO Auto-generated method stub
		return dao.add(stu);
	}
}
