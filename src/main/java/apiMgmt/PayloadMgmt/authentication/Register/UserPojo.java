package apiMgmt.PayloadMgmt.authentication.Register;

import apiMgmt.PayloadMgmt.SharedPojos.Avatar;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class UserPojo {
    private String _id;
    private String email;
    private String role;
    private String username;
    private String loginType;
    @JsonProperty("isEmailVerified")
    private boolean isEmailVerified;
    private String createdAt;
    private String updatedAt;
    private int __v;

//    @JsonProperty("avatar")
    private Avatar avatar;
}
