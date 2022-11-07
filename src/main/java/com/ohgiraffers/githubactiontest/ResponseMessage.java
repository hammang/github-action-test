package com.ohgiraffers.githubactiontest;

public class ResponseMessage {

    private String text;
    private String desciption;

    public ResponseMessage(String text, String description) {
        this.text = text;
        this.desciption = description;
    }

    public String getText() {
        return text;
    }

    public String getDesciption() {
        return desciption;
    }
}
