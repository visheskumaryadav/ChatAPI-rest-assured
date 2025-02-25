package apiMgmt.RequestMgmt;

import apiMgmt.EndpointMgmt.Endpoints;
import apiMgmt.EndpointMgmt.Setup;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.util.List;
import java.util.Map;

public class ChatRequestManager {
    /*
    Creating setup object for accessing the endpoints
     */
    final private static Setup setup=new Setup();

    // Get user's chat list
    public static Response getUserChatList(Map<String, String> headers) {
        return RestAssured.given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .headers(headers)
                .get(setup.getEndpoint(Endpoints.getUserChatList));
    }

    // Get available users
    public static Response getAvailableUsers(Map<String, String> headers) {
        return RestAssured.given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .headers(headers)
                .get(setup.getEndpoint(Endpoints.getAvailableUsers));
    }

    // Create a one-on-one chat
    public static Response createOneOnOneChat(Map<String, String> headers, List<String> pathParameters) {
        return RestAssured.given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .headers(headers)
                .post(setup.getEndpoint(Endpoints.createOneOnOneChat).replace("{receiverId}", pathParameters.get(0)));
    }

    // Delete a one-on-one chat
    public static Response deleteOneOnOneChat(Map<String, String> headers, List<String> pathParameters) {
        return RestAssured.given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .headers(headers)
                .delete(setup.getEndpoint(Endpoints.deleteOneOnOneChat).replace("{chatId}", pathParameters.get(0)));
    }



}
