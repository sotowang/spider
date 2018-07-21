package com.soto.util;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import java.io.IOException;

public abstract class HttpUtil {

    public static HttpResponse get(String url) {
        //创建默认的httpclient实例
        CloseableHttpClient httpClient = null;
        //接收响应结果
        CloseableHttpResponse response = null;


        httpClient = HttpClients.createDefault();
//            创建httpget
        HttpGet httpGet = new HttpGet(url);
        //执行get请求
        try {
            response = httpClient.execute(httpGet);
        } catch (IOException e) {
            e.printStackTrace();
        }
        //获取响应实体
        HttpEntity entity = response.getEntity();

        return response;
    }

}



