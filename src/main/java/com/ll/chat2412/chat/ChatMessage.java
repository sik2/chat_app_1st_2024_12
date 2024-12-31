package com.ll.chat2412.chat;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;

@AllArgsConstructor
@Getter
public class ChatMessage {
    private long id;
    private String authorName;
    private String content;
    private LocalDateTime createDate;

    public ChatMessage(long id, String authorName, String content) {
        this.id = id;
        this.authorName = authorName;
        this.content = content;
        this.createDate = LocalDateTime.now();
    }
}
