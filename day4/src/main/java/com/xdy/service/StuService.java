package com.xdy.service;

import java.util.List;

import com.xdy.bean.Stu;

public interface StuService {

	List<Stu> list();

	List clalist();

	int add(Stu stu);

}
