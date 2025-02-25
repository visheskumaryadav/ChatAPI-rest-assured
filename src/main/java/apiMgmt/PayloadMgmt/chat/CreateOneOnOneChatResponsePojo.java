package apiMgmt.PayloadMgmt.chat;
import lombok.Data;

import java.util.List;
@Data
public class CreateOneOnOneChatResponsePojo {
    private ChatData data;
    private String message;
    private int statusCode;
    private boolean success;
}


