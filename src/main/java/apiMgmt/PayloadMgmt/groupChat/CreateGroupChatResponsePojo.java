package apiMgmt.PayloadMgmt.groupChat;

import lombok.Data;

import java.util.List;

@Data
public class CreateGroupChatResponsePojo {
    private ChatData data;
    private String message;
    private int statusCode;
    private boolean success;
}

