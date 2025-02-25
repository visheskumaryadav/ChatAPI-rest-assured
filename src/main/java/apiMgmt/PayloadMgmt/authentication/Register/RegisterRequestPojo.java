package apiMgmt.PayloadMgmt.authentication.Register;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RegisterRequestPojo {
    private String email;
    private String password;
    private String role;
    private String username;
}
