package org.design_patterns.creational.builder;

public class NotificationBuilder {

    private String title;
    private String body;

    public String getTitle() {
        return title;
    }

    public NotificationBuilder setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getBody() {
        return body;
    }

    public NotificationBuilder setBody(String body) {
        this.body = body;
        return this;
    }

    public Notification build(){
        return new Notification(this);
    }
}
