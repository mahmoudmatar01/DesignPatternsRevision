package org.design_patterns.structure.bridge;

public class TwitchVideoProvider extends VideoProvider {

    protected TwitchVideoProvider(VideoQuality videoQuality) {
        super(videoQuality);
    }

    @Override
    public void playVideo() {
        videoQuality.renderVideoQuality();
        System.out.println("play twitch video");
    }
}
