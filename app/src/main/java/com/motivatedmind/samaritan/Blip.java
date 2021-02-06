package com.motivatedmind.samaritan;

public class Blip {
    private String userId;
    private String name;
    private Tag[] tags; //contains all tags for this blip (MAX 5)
    private String title;
    private String content;

    public Blip(Tag[] tags, String userId, String name, String title, String content) {
        this.tags = tags;
        this.userId = userId;
        this.name = name;
        this.title = title;
        this.content = content;
    }

    public Tag[] getTags() {
        return tags;
    }

    public String getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }
}
