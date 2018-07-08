package com.test.callback;

//电信供应商
public class ChinaTelecom {
	private ServiceProvider sp;//callback接口作为属性

    public void setSp(ServiceProvider sp) {
        this.sp = sp;
    }
    
    /**
     * 初始化
     */
    public void init(){
        System.out.println("Welcome, This is ChinaTelecom! ");
        sp.customHint();//sp自定义的操作
    }
}
