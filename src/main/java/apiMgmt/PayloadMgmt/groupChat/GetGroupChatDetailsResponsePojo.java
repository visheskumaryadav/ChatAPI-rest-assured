package apiMgmt.PayloadMgmt.groupChat;

import lombok.Data;

@Data
public class GetGroupChatDetailsResponsePojo {
    private ChatData data;
    private String message;
    private int statusCode;
    private boolean success;
}

