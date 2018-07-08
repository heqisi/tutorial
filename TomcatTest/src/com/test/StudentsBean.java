package com.test;

import java.io.Serializable;

/**
 * http://www.runoob.com/jsp/jsp-javabean.html
 * 
 * @author yuanmaojun
 *
 */
public class StudentsBean implements Serializable {
	private String firstName = null;
	private String lastName = null;
	private int age = 0;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
