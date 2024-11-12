package org.design_patterns.structure.bridge;

public abstract class VideoProvider {

    protected final VideoQuality videoQuality;

    protected VideoProvider(VideoQuality videoQuality) {
        this.videoQuality = videoQuality;
    }

    public abstract void playVideo();
}
