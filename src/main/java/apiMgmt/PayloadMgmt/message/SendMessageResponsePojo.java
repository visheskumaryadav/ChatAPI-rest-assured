package apiMgmt.PayloadMgmt.message;

import lombok.Data;

import java.util.List;

@Data
public class SendMessageResponsePojo {
    private MessageData data;
    private String message;
    private int statusCode;
    private boolean success;
}

@Data
class Attachment {
    private String _id;
    private String localPath;
    private String url;
}

