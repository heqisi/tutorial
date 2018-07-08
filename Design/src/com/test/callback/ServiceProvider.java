package com.test.callback;

/**
 * 与中国电信合作的sp实现此接口即可
 * 这个就是Callback接口
 * @author wanghe
 *
 */
public interface ServiceProvider {
    /**
     * sp可以自定义提示
     */
    public void customHint();
}
