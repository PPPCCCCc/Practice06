package com.javaex.ex05;

public class Depart extends Employee {
	String team;
	 //코드작성
	public Depart() {
		super();
	}
	
	public Depart(String name, int salary,String team) {
		super(name,salary);
		this.team = team;
	}
	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}
	public void showInformation() {
		System.out.println("이름 : "+getName()+" 연봉 : "+getSalary()+" 부서 : "+team);
	}
}
