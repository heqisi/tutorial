package com.test.builderPattern;

//汉堡抽象类，扩展食物条目接口
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
继承接口的类要实现接口的所有方法吗

不一定，关键要看子类是否是抽象类。
如果子类是非抽象类，则必须实现接口中的所有方法；
如果子类是抽象类，则可以不实现接口中的所有方法，因为抽象类中允许有抽象方法的存在！
*/