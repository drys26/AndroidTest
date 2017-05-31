package com.example.nexusbond.sampleapp.models;


public class YoutubeData {

    private String youtubeTitle;
    private String channelTitle;
    private String thumbnailUrl;

    public YoutubeData(String youtubeTitle, String channelTitle, String thumbnailUrl) {
        this.youtubeTitle = youtubeTitle;
        this.channelTitle = channelTitle;
        this.thumbnailUrl = thumbnailUrl;
    }

    public String getYoutubeTitle() {
        return youtubeTitle;
    }

    public void setYoutubeTitle(String youtubeTitle) {
        this.youtubeTitle = youtubeTitle;
    }

    public String getChannelTitle() {
        return channelTitle;
    }

    public void setChannelTitle(String channelTitle) {
        this.channelTitle = channelTitle;
    }

    public String getThumbnailUrl() {
        return thumbnailUrl;
    }

    public void setThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
    }
}
