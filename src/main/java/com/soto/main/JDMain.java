package com.soto.main;


import com.soto.pojo.Book;
import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.log4j.Logger;

import java.util.List;

public class JDMain {
    private static Logger logger = Logger.getLogger(JDMain.class);

    public static void main(String[] args) {
        //初始化httpclient
        HttpClient httpClient = new DefaultHttpClient();
        String url = "https://search.jd.com/Search?keyword=java&enc=utf-8&wq=java&pvid=5fe9d3c5a18a4c4f93fd193c64fa9fd0";
        //抓数据
//        List<Book> bookList = URLFecter.URLParser(httpClient, url);
    }

}

