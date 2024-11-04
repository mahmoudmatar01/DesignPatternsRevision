package org.design_patterns.behaviour.memento;

public class DrawingCanvas {

    private String content;
    private String border;
    private String color;

    public DrawingCanvas() {
        this.content = "";
        this.border = "";
        this.color = "";
    }

    public DrawingCanvasState saveCanvas(){
        return new DrawingCanvasState(content,border,color);
    }

    public void restoreCanvas(DrawingCanvasState drawingCanvasState){
        this.border=drawingCanvasState.getBorder();
        this.color=drawingCanvasState.getColor();
        this.content=drawingCanvasState.getContent();
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
