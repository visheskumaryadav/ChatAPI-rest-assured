package apiMgmt.RequestMgmt;

import apiMgmt.EndpointMgmt.Endpoints;
import apiMgmt.EndpointMgmt.Setup;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.util.List;
import java.util.Map;

public class MessageRequestManager {
    final private static Setup setup=new Setup();

    // Get all messages in a chat
    public static Response getAllMessages(Map<String, String> headers, List<String> pathParameters) {
        return RestAssured.given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .headers(headers)
                .get(setup.getEndpoint(Endpoints.getAllMessages).replace("{chatId}", pathParameters.get(0)));
    }

    // Send a message in a chat
    public static Response sendMessage(Map<String, String> headers, List<String> pathParameters, Object payload) {
        return RestAssured.given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .headers(headers)
                .body(payload)
                .post(setup.getEndpoint(Endpoints.sendMessage).replace("{chatId}", pathParameters.get(0)));
    }

    // Delete a chat message
    public static Response deleteMessage(Map<String, String> headers, List<String> pathParameters) {
        return RestAssured.given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .headers(headers)
                .delete(setup.getEndpoint(Endpoints.deleteMessage)
                        .replace("{chatId}", pathParameters.get(0))
                        .replace("{messageId}", pathParameters.get(1)));
    }
}
