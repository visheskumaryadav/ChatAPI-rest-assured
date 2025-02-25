package apiMgmt.PayloadMgmt.groupChat;

import lombok.Data;

import java.util.List;

@Data
public class CreateGroupChatRequestPojo {
    private String name; // Represents the "name" field
    private List<String> participants; // Represents the "participants" array
}
