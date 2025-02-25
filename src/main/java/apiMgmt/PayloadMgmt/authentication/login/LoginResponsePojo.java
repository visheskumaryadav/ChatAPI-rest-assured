package apiMgmt.PayloadMgmt.authentication.login;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class LoginResponsePojo {
    private DataPojo data;
    private String message;
    private int statusCode;
    private boolean success;
}
