package com.test.callback;

//���Ź�Ӧ��
public class ChinaTelecom {
	private ServiceProvider sp;//callback�ӿ���Ϊ����

    public void setSp(ServiceProvider sp) {
        this.sp = sp;
    }
    
    /**
     * ��ʼ��
     */
    public void init(){
        System.out.println("Welcome, This is ChinaTelecom! ");
        sp.customHint();//sp�Զ���Ĳ���
    }
}
