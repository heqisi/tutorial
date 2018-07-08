package com.test.builderPattern;

//实现包装接口，纸袋包装
public class Wrapper implements Packing {
	 
	   @Override
	   public String pack() {
	      return "Wrapper";
	   }
	}