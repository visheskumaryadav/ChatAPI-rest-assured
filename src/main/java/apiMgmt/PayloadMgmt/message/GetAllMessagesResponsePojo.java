package apiMgmt.PayloadMgmt.message;

import lombok.Data;

import java.util.List;

@Data
public class GetAllMessagesResponsePojo {
    private List<MessageData> data;
    private String message;
    private int statusCode;
    private boolean success;
}


@Data
class File {
    private String _id;
    private String localPath;
    private String url;
}



