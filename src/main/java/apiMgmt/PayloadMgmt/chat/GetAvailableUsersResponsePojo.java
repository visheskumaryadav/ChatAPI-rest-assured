package apiMgmt.PayloadMgmt.chat;

import apiMgmt.PayloadMgmt.SharedPojos.Avatar;
import lombok.Data;

import java.util.List;

@Data
public class GetAvailableUsersResponsePojo {
    private List<UserData> data;
    private String message;
    private int statusCode;
    private boolean success;
}
@Data
class UserData {
    private int __v;
    private String _id;
    private Avatar avatar;
    private String createdAt;
    private String email;
    private boolean isEmailVerified;
    private String loginType;
    private String password;
    private String role;
    private String updatedAt;
    private String username;
}

