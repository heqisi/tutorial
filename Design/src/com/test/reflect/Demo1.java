package com.test.reflect;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Foo foo=new Foo();
		Class a1=foo.getClass();
		Class a2=Foo.class;
		Class a3=null;
		try {
			a3=Class.forName("com.test.reflect.Foo");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(a1==a2);
		System.out.println(a1==a3);
	}

}

class Foo{}