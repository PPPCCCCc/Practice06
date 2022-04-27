package com.javaex.ex04;

public class UserApp {

	public static void main(String[] args) {
		
		User[] use = new User[3];
		
		use[0] = new Customer("jws","j1234","정우성",1000);
		use[1] = new Customer("yjs","y2345","이효리",2000);
		use[2] = new Employee("master","m7788","운영자",5000000);
		
		for (int i = 0; i < use.length; i++) {
			use[i].showInfo();
		}

	}

}
