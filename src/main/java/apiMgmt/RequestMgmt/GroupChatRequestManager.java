package apiMgmt.RequestMgmt;

import apiMgmt.EndpointMgmt.Endpoints;
import apiMgmt.EndpointMgmt.Setup;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.util.List;
import java.util.Map;

public class GroupChatRequestManager {
    final private static Setup setup=new Setup();
    // Create a group chat
    public static Response createGroupChat(Map<String, String> headers, Object payload) {
        return RestAssured.given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .headers(headers)
                .body(payload)
                .post(setup.getEndpoint(Endpoints.createGroupChat));
    }

    // Get group chat details
    public static Response getGroupChatDetails(Map<String, String> headers, List<String> pathParameters) {
        return RestAssured.given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .headers(headers)
                .get(setup.getEndpoint(Endpoints.getGroupChatDetails).replace("{chatId}", pathParameters.get(0)));
    }

    // Delete a group chat
    public static Response deleteGroupChat(Map<String, String> headers, List<String> pathParameters) {
        return RestAssured.given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .headers(headers)
                .delete(setup.getEndpoint(Endpoints.deleteGroupChat).replace("{chatId}", pathParameters.get(0)));
    }

    // Update group chat name
    public static Response updateGroupChatName(Map<String, String> headers, List<String> pathParameters, Object payload) {
        return RestAssured.given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .headers(headers)
                .body(payload)
                .patch(setup.getEndpoint(Endpoints.updateGroupChatName).replace("{chatId}", pathParameters.get(0)));
    }

    // Add participant to a group chat
    public static Response addParticipant(Map<String, String> headers, List<String> pathParameters) {
        return RestAssured.given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .headers(headers)
                .post(setup.getEndpoint(Endpoints.addParticipant)
                        .replace("{chatId}", pathParameters.get(0))
                        .replace("{participantId}", pathParameters.get(1)));
    }

    // Remove participant from a group chat
    public static Response removeParticipant(Map<String, String> headers, List<String> pathParameters) {
        return RestAssured.given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .headers(headers)
                .delete(setup.getEndpoint(Endpoints.removeParticipant)
                        .replace("{chatId}", pathParameters.get(0))
                        .replace("{participantId}", pathParameters.get(1)));
    }

    // Leave a group chat
    public static Response leaveGroupChat(Map<String, String> headers, List<String> pathParameters) {
        return RestAssured.given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .headers(headers)
                .delete(setup.getEndpoint(Endpoints.leaveGroupChat).replace("{chatId}", pathParameters.get(0)));
    }

}
