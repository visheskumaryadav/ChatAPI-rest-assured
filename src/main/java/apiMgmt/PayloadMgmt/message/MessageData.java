package apiMgmt.PayloadMgmt.message;

import lombok.Data;

import java.util.List;

@Data
class MessageData {
    private int __v;
    private String _id;
    private List<Attachment> attachments;
    private String chat;
    private String content;
    private String createdAt;
    private Sender sender;
    private String updatedAt;
}
