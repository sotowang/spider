package com.soto.util;

import com.soto.pojo.Model;
import org.apache.http.HttpResponse;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class HttpParse {

    public static List<Model> HttpParser(String url) throws IOException {
        List<Model> modelList = new ArrayList<Model>();
        //获取网站响应的html
        HttpResponse response = HttpUtil.get(url);
        int statusCode = response.getStatusLine().getStatusCode();
        if (statusCode == 200) {
            String html = EntityUtils.toString(response.getEntity(), "UTF-8");
            modelList = JDParse.getModel(html);
            EntityUtils.consume(response.getEntity());
        }else {
            EntityUtils.consume(response.getEntity());
        }
        return modelList;
    }

}
