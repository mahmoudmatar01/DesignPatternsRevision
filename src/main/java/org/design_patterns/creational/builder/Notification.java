package org.design_patterns.creational.builder;

public class Notification {

    private final String title;
    private final String body;

    public Notification (NotificationBuilder builder){
        this.title=builder.getTitle();
        this.body=builder.getBody();
    }

    @Override
    public String toString() {
        return "Notification{" +
                "title='" + title + '\'' +
                ", body='" + body + '\'' +
                '}';
    }
}
