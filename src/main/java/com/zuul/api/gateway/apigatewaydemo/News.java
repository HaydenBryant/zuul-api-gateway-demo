package com.zuul.api.gateway.apigatewaydemo;

public class News {

    private String title;
    private String link;
    private int id;

    public News(String title, String link, int id) {
        this.title = title;
        this.link = link;
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public String getLink() {
        return link;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "News{" +
                "title='" + title + '\'' +
                ", link='" + link + '\'' +
                ", id=" + id +
                '}';
    }
}
