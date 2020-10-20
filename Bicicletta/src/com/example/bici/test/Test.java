package com.example.bici.test;

import  com.example.bici.*;

public class Test {

	public static void main(String[] args) {
		
		BiciDaCorsa bici = new BiciDaCorsa(true, true);
		MountainByke bici2 = new MountainByke(2, 6, true);
		
		System.out.println(bici2.getFreni());
		
		System.out.println(bici.getSellino());
		
		
	}

}
