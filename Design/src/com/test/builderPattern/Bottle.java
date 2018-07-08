package com.test.builderPattern;

//实现包装接口，瓶子包装
public class Bottle implements Packing {
	 
	   @Override
	   public String pack() {
	      return "Bottle";
	   }
	}
