package apiMgmt.PayloadMgmt.groupChat;

import lombok.Data;

import java.util.List;

@Data
public class LeaveGroupResponsePojo {
    private ChatData data;
    private String message;
    private int statusCode;
    private boolean success;
}

@Data
class LastMessage {
    private int __v;
    private String _id;
    private List<Attachment> attachments;
    private String chat;
    private String content;
    private String createdAt;
    private Sender sender;
    private String updatedAt;
}

@Data
class Attachment {
    private String _id;
    private String localPath;
    private String url;
}

@Data
class Sender {
    private String _id;
    private Avatar avatar;
    private String email;
    private String username;
}
