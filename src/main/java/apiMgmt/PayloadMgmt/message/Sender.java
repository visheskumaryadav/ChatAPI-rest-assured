package apiMgmt.PayloadMgmt.message;

import lombok.Data;

@Data
class Sender {
    private String _id;
    private Avatar avatar;
    private String email;
    private String username;
}
