package com.test.practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee e = new Employee();
		e.setId(61662);
		e.setName("Omkar");
		System.out.println(e.hashCode());
		serializeObject(e);
		Employee e2 = (Employee) deserializeObject("emp.ser");
		System.out.println(e2.hashCode());
		System.out.println(e2.getName());

		MySingleton mySingleton = MySingleton.getInstance();
		System.out.println(mySingleton.hashCode());
		serializeObject(mySingleton);
		MySingleton mySingleton2 = (MySingleton) deserializeObject("emp.ser");
		System.out.println(mySingleton2.hashCode());
	}

	private static void serializeObject(Object e) {
		try {
			ObjectOutputStream opt = new ObjectOutputStream(new FileOutputStream("emp.ser"));
			opt.writeObject(e);
			opt.close();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

	private static Object deserializeObject(String filename) {
		try {
			ObjectInputStream intputstream = new ObjectInputStream(new FileInputStream(filename));
			Object e1 = intputstream.readObject();
			intputstream.close();
			return e1;
		} catch (IOException | ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return null;
	}

}
