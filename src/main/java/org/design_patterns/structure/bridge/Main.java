package org.design_patterns.structure.bridge;

public class Main {
    public static void main(String []args){

        VideoQuality hd = new HDVideoQuality();
        VideoQuality sd = new SDVideoQuality();

        VideoProvider youtube = new YoutubeVideoProvider(hd);
        VideoProvider twitch = new TwitchVideoProvider(sd);

        youtube.playVideo();
        twitch.playVideo();
    }
}
