package com.maku.chatapi.demo;

import java.time.LocalDateTime;

public class Message {
    private LocalDateTime localDateTime;
    private String text;

    Message(LocalDateTime localDateTime, String text) {
        this.localDateTime = localDateTime;
        this.text = text;
    }

    public String getLocalDateTime() {
        return localDateTime.toString();
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
