package apiMgmt.PayloadMgmt.groupChat;

import lombok.Data;

import java.util.List;

@Data
class ChatData {
    private int __v;
    private String _id;
    private String admin;
    private String createdAt;
    private boolean isGroupChat;
    private String name;
    private List<Participant> participants;
    private String updatedAt;
}
