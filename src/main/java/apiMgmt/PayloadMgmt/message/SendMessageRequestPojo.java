package apiMgmt.PayloadMgmt.message;

import lombok.Data;

import java.util.List;

@Data
public class SendMessageRequestPojo {
        private List<File> attachments; // Represents binary image files
        private String content;        // Represents the message content
}

