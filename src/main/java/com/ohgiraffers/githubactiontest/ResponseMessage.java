package com.ohgiraffers.githubactiontest;

public class ResponseMessage {

    private String text;
    private String description;

    public ResponseMessage(String text, String description) {
        this.text = text;
        this.description = description;
    }

    public String getText() {
        return text;
    }

    public String getDescription() {
        return description;
    }
}
