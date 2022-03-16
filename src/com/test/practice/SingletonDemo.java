package com.test.practice;

public class SingletonDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MySingleton instance1 = MySingleton.getInstance();
		System.out.println(instance1.hashCode());
		MySingleton instance2 = MySingleton.getInstance();
		System.out.println(instance2.hashCode());

	}

}
