package com.test;

import com.homework.Phone;

public class Main {

	public static void main(String[] args) {
		Phone p = new Phone();
		p.setBrand("��Ϊ");
		p.setCpu("Hisilicon Kirin 960");
		p.setMemory("32G");
		p.setScreenSize("1920*1080");
		
		System.out.println("Ʒ�ƣ�" + p.getBrand());
		System.out.println("��������" + p.getCpu());
		System.out.println("�ڴ棺" + p.getMemory());
		System.out.println("��Ļ��" + p.getScreenSize());
	}

}
