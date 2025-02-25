package apiMgmt.PayloadMgmt.groupChat;

import apiMgmt.PayloadMgmt.SharedPojos.Avatar;
import lombok.Data;

@Data
class Participant {
    private int __v;
    private String _id;
    private Avatar avatar;
    private String createdAt;
    private String email;
    private boolean isEmailVerified;
    private String loginType;
    private String role;
    private String updatedAt;
    private String username;
}
