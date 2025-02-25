package apiMgmt.PayloadMgmt.chat;

import lombok.Data;
import java.util.Map;

@Data
public class DeleteChatResponsePojo {
    private Map<String, Object> data; // Use Map if data might contain key-value pairs
    private String message;
    private int statusCode;
    private boolean success;
}
