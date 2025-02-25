package apiMgmt.PayloadMgmt.groupChat;

import lombok.Data;

import java.util.Map;

@Data
public class DeleteGroupChatResponsePojo {
    private Map<String, Object> data; // Use Map if data might contain key-value pairs
    private String message;
    private int statusCode;
    private boolean success;
}
