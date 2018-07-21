package com.soto.util;

import com.soto.pojo.Model;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.ArrayList;
import java.util.List;

public class JDParse {
    public static List<Model> getModel(String html) {
        List<Model> modelList = new ArrayList<Model>();
        //彩Jsoup解析
        Document document = Jsoup.parse(html);
        //获取html标签内容
        Elements elements = document.select("ul[class=gl-warp clearfix]").select("li[class=gl-item]");
        for (Element element : elements) {
            String bookId = element.attr("data-sku");
            String bookPrice = element.select("div[class=p-price]").select("strong").select("i").text();
            String bookName = element.select("div[class=p-name p-name-type-2]").select("em").text();

            Model model = new Model();
            model.setBookId(bookId);
            model.setBookName(bookName);
            model.setBookPrice(bookPrice);

            modelList.add(model);
        }
        return modelList;
    }
}
