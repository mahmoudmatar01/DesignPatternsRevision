package org.design_patterns.creational.prototype;

public class MarketingMaterial {

    private String layout;
    private String color;
    private String content;

    public MarketingMaterial(String layout, String color, String content) {
        this.layout = layout;
        this.color = color;
        this.content = content;
    }

    public MarketingMaterial(MarketingMaterial marketingMaterial) {
        this.layout = marketingMaterial.getLayout();
        this.color = marketingMaterial.getColor();
        this.content = marketingMaterial.getContent();
    }

    public String getLayout() {
        return layout;
    }

    public void setLayout(String layout) {
        this.layout = layout;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "MarketingMaterial{" +
                "layout='" + layout + '\'' +
                ", color='" + color + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
