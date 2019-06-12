package com.xdy.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xdy.bean.Stu;
import com.xdy.service.StuService;

@Controller
public class StuController {
	
	@Resource
	private StuService st;
	
	@RequestMapping("list")
	public String list(Model model){
		List<Stu> list=st.list();
		model.addAttribute("list", list);
		return "list";
	}
	//添加
	@RequestMapping("toadd.do")
	public String toadd(Model model){
		List clalist=st.clalist();
		model.addAttribute("clalist", clalist);
		return "add";
	}
	@RequestMapping("clalist.do")
	@ResponseBody
	public Object clalist(){
		return st.clalist();
	}
	@RequestMapping("add.do")
	public String add(Stu stu){
		int i=st.add(stu);
		if(i>0){
			return "redirect:list.do";
		}
		return "error";
	}
}	
