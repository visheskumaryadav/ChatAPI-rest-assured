package apiMgmt.EndpointMgmt;

import com.jayway.jsonpath.DocumentContext;
import com.jayway.jsonpath.JsonPath;

import java.io.File;
import java.io.IOException;
import java.util.EnumMap;
import java.util.Map;

public class Setup {
    private static final String ENDPOINT_FILE_PATH = "/src/main/java/apiMgmt/Resources/endpoints.json";
    private final Map<Endpoints, String> endpointPaths = new EnumMap<>(Endpoints.class);

    public Setup() {
        File endpointFile = new File(System.getProperty("user.dir") + ENDPOINT_FILE_PATH);
        try {
            DocumentContext documentContext = JsonPath.parse(endpointFile);

            // Pre-fetch base URL
            String baseUrl = documentContext.read("$.baseUrls.dev");

            // Pre-fetch chat endpoints
            endpointPaths.put(Endpoints.getUserChatList, baseUrl + documentContext.read("$.endpoints.chats.getUserChatList"));
            endpointPaths.put(Endpoints.getAvailableUsers, baseUrl + documentContext.read("$.endpoints.chats.getAvailableUsers"));
            endpointPaths.put(Endpoints.createOneOnOneChat, baseUrl + documentContext.read("$.endpoints.chats.createOneOnOneChat"));
            endpointPaths.put(Endpoints.deleteOneOnOneChat, baseUrl + documentContext.read("$.endpoints.chats.deleteOneOnOneChat"));

            // Pre-fetch group chat endpoints
            endpointPaths.put(Endpoints.createGroupChat, baseUrl + documentContext.read("$.endpoints.groupChats.createGroupChat"));
            endpointPaths.put(Endpoints.getGroupChatDetails, baseUrl + documentContext.read("$.endpoints.groupChats.getGroupChatDetails"));
            endpointPaths.put(Endpoints.deleteGroupChat, baseUrl + documentContext.read("$.endpoints.groupChats.deleteGroupChat"));
            endpointPaths.put(Endpoints.updateGroupChatName, baseUrl + documentContext.read("$.endpoints.groupChats.updateGroupChatName"));
            endpointPaths.put(Endpoints.addParticipant, baseUrl + documentContext.read("$.endpoints.groupChats.addParticipant"));
            endpointPaths.put(Endpoints.removeParticipant, baseUrl + documentContext.read("$.endpoints.groupChats.removeParticipant"));
            endpointPaths.put(Endpoints.leaveGroupChat, baseUrl + documentContext.read("$.endpoints.groupChats.leaveGroupChat"));

            // Pre-fetch message endpoints
            endpointPaths.put(Endpoints.getAllMessages, baseUrl + documentContext.read("$.endpoints.messages.getAllMessages"));
            endpointPaths.put(Endpoints.sendMessage, baseUrl + documentContext.read("$.endpoints.messages.sendMessage"));
            endpointPaths.put(Endpoints.deleteMessage, baseUrl + documentContext.read("$.endpoints.messages.deleteMessage"));

            //Pre-fetch authentication endpoints
            endpointPaths.put(Endpoints.register,baseUrl+ documentContext.read("$.endpoints.authentication.register"));
            endpointPaths.put(Endpoints.login,baseUrl+ documentContext.read("$.endpoints.authentication.login"));
            endpointPaths.put(Endpoints.logout,baseUrl+ documentContext.read("$.endpoints.authentication.logout"));


        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getEndpoint(Endpoints endpoint) {
        return endpointPaths.getOrDefault(endpoint, "Unknown endpoint");
    }
}
