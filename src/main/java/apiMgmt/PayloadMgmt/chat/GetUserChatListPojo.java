package apiMgmt.PayloadMgmt.chat;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.List;

@Data
public class GetUserChatListPojo {
    private List<ChatData> data;
    private String message;
    private int statusCode;
    private boolean success;
}

