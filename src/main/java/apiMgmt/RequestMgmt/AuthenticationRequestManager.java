package apiMgmt.RequestMgmt;

import apiMgmt.EndpointMgmt.Endpoints;
import apiMgmt.EndpointMgmt.Setup;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.util.Map;

public class AuthenticationRequestManager {
    final private static Setup setup=new Setup();

    public static Response register(Map<String, String> headers,Object payload) {
        return RestAssured.given().log().all()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .headers(headers).body(payload)
                .post(setup.getEndpoint(Endpoints.register));

    }
    public static Response login(Map<String, String> headers,Object payload) {
        return RestAssured.given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .headers(headers).body(payload)
                .post(setup.getEndpoint(Endpoints.login));
    }
    public static Response logout(String accessToken) {
        return RestAssured.given().log().all()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
//                .headers("cookie","accessToken="+accessToken)
                .headers("Authorization","Bearer "+accessToken)
                .post(setup.getEndpoint(Endpoints.logout));
    }
}
