package com.xdy.bean;

public class Stu {
	
	private Integer sid;
	private String sname;
	private Cla cla;
	public Integer getSid() {
		return sid;
	}
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public Cla getCla() {
		return cla;
	}
	public void setCla(Cla cla) {
		this.cla = cla;
	}
	@Override
	public String toString() {
		return "Stu [sid=" + sid + ", sname=" + sname + ", cla=" + cla + "]";
	}
	
}
