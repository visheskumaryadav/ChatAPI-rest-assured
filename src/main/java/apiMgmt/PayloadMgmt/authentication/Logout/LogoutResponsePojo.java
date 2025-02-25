package apiMgmt.PayloadMgmt.authentication.Logout;

import apiMgmt.PayloadMgmt.authentication.login.DataPojo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class LogoutResponsePojo {
    private DataPojo data;
    private String message;
    private int statusCode;
    private boolean success;
}
