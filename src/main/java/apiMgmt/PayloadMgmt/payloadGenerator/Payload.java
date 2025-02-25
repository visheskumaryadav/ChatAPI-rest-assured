package apiMgmt.PayloadMgmt.payloadGenerator;

import apiMgmt.PayloadMgmt.authentication.Register.RegisterRequestPojo;
import apiMgmt.PayloadMgmt.authentication.Register.RegisterResponsePojo;
import com.jayway.jsonpath.DocumentContext;
import com.jayway.jsonpath.JsonPath;
import net.datafaker.Faker;

import java.io.File;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

public class Payload {
    private static final Faker faker=new Faker();

    private static final String LOGIN_FILE_PATH = "/src/main/java/apiMgmt/Resources/loginDetails.json";
    public static RegisterRequestPojo getRegisterPayload(){
        String username=faker.name().firstName();
        return RegisterRequestPojo.builder()
                .email(username+"@yopmail.com").role("USER").username(username.toLowerCase()).password(username+"@123")
                .build();
    }

    public static Map<String,String> getLoginPayload(RegisterRequestPojo registerRequestPojo){
        Map<String,String> map=new LinkedHashMap<>();
        map.put("password",registerRequestPojo.getPassword());
        map.put("username",registerRequestPojo.getUsername());

        return map;

    }
    public static Map<String,String> getLoginPayload(){
        // fetch login details from the json file and put the details into the map
//        File endpointFile = new File(System.getProperty("user.dir") + LOGIN_FILE_PATH);
//        Map<String,String> map=new LinkedHashMap<>();
//        try {
//            DocumentContext documentContext = JsonPath.parse(endpointFile);
//            String bas = documentContext.read("$.password");
//            map.put("password", documentContext.read("$.password"));
//            map.put("username", documentContext.read("$.username"));
//        }catch (IOException e){
//            e.printStackTrace();
//        }

                Map<String,String> map=new LinkedHashMap<>();
                map.put("password","vishesh@123");
                map.put("username","vishesh");

        return map;

    }

}
