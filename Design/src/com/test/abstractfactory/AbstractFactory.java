package com.test.abstractfactory;

//Ϊ Color �� Shape ���󴴽�����������ȡ����
public abstract class AbstractFactory {
	public abstract Color getColor(String color);

	public abstract Shape getShape(String shape);
}
