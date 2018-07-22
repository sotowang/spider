package com.soto.main;


import com.soto.db.MySql;
import com.soto.pojo.Model;
import com.soto.util.HttpParse;
import org.apache.log4j.Logger;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class JDMain {
    private static Logger logger = Logger.getLogger(JDMain.class);

    public static void main(String[] args) throws Exception {
        //初始化httpclient
//        String url = "https://search.jd.com/Search?keyword=java&enc=utf-8&wq=java&pvid=5fe9d3c5a18a4c4f93fd193c64fa9fd0";
        Thread t1 = new Thread() {
            public void run() {
                for (int i = 1; i < 5; i++) {
                    String url = "https://search.jd.com/Search?keyword=python&enc=utf-8&qrst=1&rt=1&stop=1&vt=2&wq=java&page=" + i + "&s=58&click=0";
                    List<Model> modelList = null;
                    try {
                        modelList = HttpParse.HttpParser(url);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    for (Model md : modelList) {
                        logger.info(md.toString());
                    }

                    try {
                        MySql.insert(modelList);
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
            }
        };

        Thread t2 = new Thread() {
            public void run() {
                for (int i = 1; i < 2; i++) {
                    String url = "https://search.jd.com/Search?keyword=java&enc=utf-8&qrst=1&rt=1&stop=1&vt=2&wq=java&page=" + i + "&s=58&click=0";
                    List<Model> modelList = null;
                    try {
                        modelList = HttpParse.HttpParser(url);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    for (Model md : modelList) {
                        logger.info(md.toString());
                    }

                    try {
                        MySql.insert(modelList);
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        t1.start();


//        t2.start();



    }

}

