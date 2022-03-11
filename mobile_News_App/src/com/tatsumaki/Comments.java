package com.tatsumaki;

public class Comments {
    public String content;
    public String title;
    public final User user;

    public Comments(String content, String title, User user) {
        this.content = content;
        this.title = title;
        this.user = user;
    }
}
