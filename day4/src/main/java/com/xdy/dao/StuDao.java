package com.xdy.dao;

import java.util.List;

import com.xdy.bean.Stu;

public interface StuDao {

	List<Stu> list();

	List clalist();

	int add(Stu stu);

}
