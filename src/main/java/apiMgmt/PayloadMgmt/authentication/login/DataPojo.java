package apiMgmt.PayloadMgmt.authentication.login;

import apiMgmt.PayloadMgmt.authentication.Register.UserPojo;
import lombok.Data;

@Data
public class DataPojo {
    private UserPojo user;
    private String accessToken;
    private String refreshToken;
}
