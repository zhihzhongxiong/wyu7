package com.test;

import com.homework.Phone;

public class Main {

	public static void main(String[] args) {
		Phone p = new Phone();
		p.setBrand("华为");
		p.setCpu("Hisilicon Kirin 960");
		p.setMemory("32G");
		p.setScreenSize("1920*1080");
		
		System.out.println("品牌：" + p.getBrand());
		System.out.println("处理器：" + p.getCpu());
		System.out.println("内存：" + p.getMemory());
		System.out.println("屏幕：" + p.getScreenSize());
	}

}
