package org.design_patterns.structure.bridge;

public class YoutubeVideoProvider extends VideoProvider {

    protected YoutubeVideoProvider(VideoQuality videoQuality) {
        super(videoQuality);
    }

    @Override
    public void playVideo() {
        videoQuality.renderVideoQuality();
        System.out.println("play youtube video");
    }
}
