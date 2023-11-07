package com.unfbx.chatgptsteamoutput.controller.request;

import lombok.Data;

import java.util.List;

@Data
public class ChatCompletionRequest {

    private String model;
    private List<Message> messages;

    @Data
    public static class Message {
        private String role;
        private String content;
    }
}
