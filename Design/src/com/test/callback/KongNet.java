package com.test.callback;

//������
public class KongNet implements ServiceProvider {

	@Override
    public void customHint() {
        System.out.println("�Żݻ��ʼ�����������½���������к����ͣ� �������վ���档");
    }

    public void init(){
        ChinaTelecom ct=new ChinaTelecom();
        ct.setSp(new KongNet());//����ChinaTelecom�����ļ�sp
        ct.init();
    }
    
    public static void main(String[] args){
        KongNet sp = new KongNet();
        sp.init();
    }

}
