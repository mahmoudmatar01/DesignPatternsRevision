package org.design_patterns.structure.bridge;

public class SDVideoQuality implements VideoQuality{
    @Override
    public void renderVideoQuality() {
        System.out.println("rendering video quality : SD .......");
    }
}
