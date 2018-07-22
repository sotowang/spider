package com.soto.util;

import com.soto.pojo.Model;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class JDParse {
    public static List<Model> getModel(String html) throws IOException {
        List<Model> modelList = new ArrayList<Model>();
        //彩Jsoup解析
        Document document = Jsoup.parse(html);
//        String url = "https://search.jd.com/Search?keyword=java&enc=utf-8&qrst=1&rt=1&stop=1&vt=2&wq=java&page=3&s=58&click=0";
//        Document document = Jsoup.connect(url).
//                userAgent("Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/52.0.2743.116 Safari/537.36")
//        .get();

//        System.out.println(aa);

        //获取html标签内容
        Elements elements = document.select("ul[class=gl-warp clearfix]").select("li[class=gl-item]");
        for (Element element : elements) {
            String modelId = element.attr("data-sku");
            String modelPrice = element.select("div.p-price").select("strong").select("i").text();
            String modelName = element.select("div.p-name").select("em").text();
            String modelDesc = element.select("div.p-name").select("i.promo-words").text();
            String modelCount = element.select("div.p-icons").select("i").text();
            String modelComment = element.select("div.p-commit").select("strong").select("a").text();
            String modelAddr = element.select("div.p-img").select("a").attr("href");
            modelAddr = modelAddr.startsWith("http") ? modelAddr : "http:" + modelAddr;
            String modelShop = element.select("div[data-reputation]").select("a").attr("title");

            String modelImg = element.select("div.p-img").select("a").select("img").attr("src");

            Model model = new Model();
            model.setmodelId(modelId);
            model.setmodelName(modelName);
            model.setmodelPrice(modelPrice);
            model.setModelAddr(modelAddr);
            model.setModelComment(modelComment);
            model.setModelCount(modelCount);
            model.setModelShop(modelShop);
            model.setModelImg(modelImg);
            model.setModelDesc(modelDesc);

            modelList.add(model);
        }
        return modelList;
    }
}
