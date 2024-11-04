package org.design_patterns.behaviour.memento;

public class DrawingCanvasState {

    private String content;
    private String border;
    private String color;

    public DrawingCanvasState(String content, String border, String color) {
        this.content = content;
        this.border = border;
        this.color = color;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getBorder() {
        return border;
    }

    public void setBorder(String border) {
        this.border = border;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
