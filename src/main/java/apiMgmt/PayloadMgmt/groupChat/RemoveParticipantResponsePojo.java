package apiMgmt.PayloadMgmt.groupChat;

import lombok.Data;

@Data
public class RemoveParticipantResponsePojo {
    private ChatData data;
    private String message;
    private int statusCode;
    private boolean success;
}
