package com.soto.main;


import com.soto.util.HttpUtil;
import org.apache.http.HttpResponse;
import org.apache.log4j.Logger;

import java.io.IOException;

public class JDMain {
    private static Logger logger = Logger.getLogger(JDMain.class);

    public static void main(String[] args) throws IOException {
        //初始化httpclient
        String url = "https://search.jd.com/Search?keyword=java&enc=utf-8&wq=java&pvid=5fe9d3c5a18a4c4f93fd193c64fa9fd0";

        HttpResponse response = HttpUtil.get(url);


        System.out.println(response);

        //抓数据
//        List<Model> bookList = HttpFecter.URLParser(httpClient, url);
    }

}

