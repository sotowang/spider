package com.soto;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

public class HTTPTest {
    public static void main(String[] args) throws IOException {
        get();
    }

    public static void get() throws IOException {
        //创建默认的httpclient实例
        CloseableHttpClient httpClient = null;
        //接收响应结果
        CloseableHttpResponse response = null;


        try {
            httpClient = HttpClients.createDefault();
//            创建httpget
            String url = "https://seassss";
            HttpGet httpGet = new HttpGet(url);
            //执行get请求
            response = httpClient.execute(httpGet);
            //获取响应实体
            HttpEntity entity = response.getEntity();
            //打印响应状态
            System.out.println(response.getStatusLine().getStatusCode());
            if (entity != null) {
                System.out.println("Response Content:  " + EntityUtils.toString(entity,"UTF-8"));
            }

        } catch (IOException e) {
            throw e;
        }finally {
            httpClient.close();
            response.close();
        }
    }






}
