package apiMgmt.PayloadMgmt.authentication.Register;


import com.fasterxml.jackson.annotation.*;
import lombok.Data;


@Data()
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RegisterResponsePojo {
    private DataPojo data;
    private String message;
    private int statusCode;
    private boolean success;
}
