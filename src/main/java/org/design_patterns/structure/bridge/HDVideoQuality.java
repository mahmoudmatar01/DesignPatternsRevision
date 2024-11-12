package org.design_patterns.structure.bridge;

public class HDVideoQuality implements VideoQuality{
    @Override
    public void renderVideoQuality() {
        System.out.println("rendering video quality : HD .......");
    }
}
