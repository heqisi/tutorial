package com.test.builderPattern;

//���������࣬��չʳ����Ŀ�ӿ�
public abstract class Burger implements Item {
	  public String name;
	   @Override
	   public Packing packing() {
	      return new Wrapper();
	   }
	 
	   @Override
	   public abstract float price();
	}
/*
 https://zhidao.baidu.com/question/1500211103325767739.html
�̳нӿڵ���Ҫʵ�ֽӿڵ����з�����

��һ�����ؼ�Ҫ�������Ƿ��ǳ����ࡣ
��������Ƿǳ����࣬�����ʵ�ֽӿ��е����з�����
��������ǳ����࣬����Բ�ʵ�ֽӿ��е����з�������Ϊ�������������г��󷽷��Ĵ��ڣ�
*/