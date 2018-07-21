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
            String modelId = element.attr("data-sku");
            String modelPrice = element.select("div[class=p-price]").select("strong").select("i").text();
            String modelName = element.select("div[class=p-name p-name-type-2]").select("em").text();

            Model model = new Model();
            model.setmodelId(modelId);
            model.setmodelName(modelName);
            model.setmodelPrice(modelPrice);

            modelList.add(model);
        }
        return modelList;
    }
}
