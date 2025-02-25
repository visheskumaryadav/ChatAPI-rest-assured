package TestCases;

import apiMgmt.EndpointMgmt.Endpoints;
import apiMgmt.EndpointMgmt.Setup;
import apiMgmt.PayloadMgmt.authentication.Register.RegisterResponsePojo;
import apiMgmt.PayloadMgmt.authentication.login.LoginResponsePojo;
import apiMgmt.PayloadMgmt.payloadGenerator.Payload;
import apiMgmt.RequestMgmt.AuthenticationRequestManager;
import apiMgmt.Utils.LoggerUtil;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.lang.reflect.Array;
import java.util.*;

public class TestCase1 {


    public static void main(String[] args) throws JsonProcessingException {


        Response response=AuthenticationRequestManager.login(new LinkedHashMap<>(),Payload.getLoginPayload());
        System.out.println("--------------------------Response--------------------");
        response.then().log().all();
        System.out.println("=======================================================");
        ObjectMapper objectMapper=new ObjectMapper();
        LoginResponsePojo registerResponsePojo=objectMapper.readValue(response.body().asString(), new TypeReference<LoginResponsePojo>() {});
        System.out.println(registerResponsePojo.toString());
        response=AuthenticationRequestManager.logout(registerResponsePojo.getData().getAccessToken());
        response.then().log().all();
    }
}