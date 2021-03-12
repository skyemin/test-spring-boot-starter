package com.wei.testspringbootstarter.utils;

/**
 * @author skye
 * @version 1.0
 * @description:
 * @date 2021/3/12 14:30
 */
public class HttpClientUtils {
    public static int sendMsg(String url, String accessKeyId, String accessKeySecret, String msg) {
        //TODO 调用指定url进行请求的业务逻辑
        System.out.println("Http请求，url=" + url + ";accessKeyId=" + accessKeyId + ";accessKeySecret=" + accessKeySecret + ";msg=" + msg);
        return 0;
    }
}
