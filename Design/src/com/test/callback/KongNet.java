package com.test.callback;

//空中网
public class KongNet implements ServiceProvider {

	@Override
    public void customHint() {
        System.out.println("优惠活动开始啦，即日起登陆空中网就有好礼送！ 详情见网站公告。");
    }

    public void init(){
        ChinaTelecom ct=new ChinaTelecom();
        ct.setSp(new KongNet());//告诉ChinaTelecom这是哪家sp
        ct.init();
    }
    
    public static void main(String[] args){
        KongNet sp = new KongNet();
        sp.init();
    }

}
