package com.soto.main;


import com.soto.db.MySql;
import com.soto.pojo.Model;
import com.soto.util.HttpParse;
import org.apache.log4j.Logger;

import java.io.IOException;
import java.util.List;

public class JDMain {
    private static Logger logger = Logger.getLogger(JDMain.class);

    public static void main(String[] args) throws Exception {
        //初始化httpclient
        String url = "https://search.jd.com/Search?keyword=java&enc=utf-8&wq=java&pvid=5fe9d3c5a18a4c4f93fd193c64fa9fd0";
        List<Model> modelList = HttpParse.HttpParser(url);
        for (Model md : modelList) {
            logger.info(md.toString());
        }

        MySql.insert(modelList);

    }

}

