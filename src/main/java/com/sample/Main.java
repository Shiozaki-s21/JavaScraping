package com.sample;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.jsoup.Jsoup;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        
        // To get HTML Document form target Web site.
        Document document = Jsoup.connect("https://medium.com/search").data("q","java").get(); 
        // Story title is ushing div named "graf--title"
        Elements elements = document.getElementsByClass("graf--title");
        document.getElements
        for (Element element : elements) {
            // print out each story title
            System.out.println(element.text());
        }
        
    }
}