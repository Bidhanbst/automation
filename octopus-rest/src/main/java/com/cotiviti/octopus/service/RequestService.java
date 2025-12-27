package com.cotiviti.octopus.service;

import com.cotiviti.octopus.core.Constants;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.JSONException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import static com.cotiviti.octopus.service.GetResource.getEnvironmentId;
import static com.cotiviti.octopus.service.GetResource.getSpaceId;


public class RequestService {

    public static ObjectMapper objectMapper = new ObjectMapper().disable(DeserializationFeature.FAIL_ON_IGNORED_PROPERTIES).disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
    GetResource getResource = new GetResource();


    public static String httpRequest(String path, String requestType) throws IOException {

        String jsonResponse = null;
        URL obj = new URL(Constants.octopusServerURL + path);
        HttpURLConnection connection = (HttpURLConnection) obj.openConnection();
        connection.setRequestMethod(requestType);
        connection.setDoOutput(true);
        connection.setRequestProperty("X-Octopus-ApiKey", Constants.apiKey);

        if (connection.getResponseCode() == HttpURLConnection.HTTP_OK) {

            jsonResponse = inputstreamtoStringBuilder(connection).toString();

        }
        else {
            System.out.println(requestType + "request did not work.");
        }

        return jsonResponse;
    }

    public static StringBuilder inputstreamtoStringBuilder(HttpURLConnection httpURLConnection) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
        String inputLine;
        StringBuilder response = new StringBuilder();

        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();

        return response;
    }


    public static  <T> T mapJsonToObject(String jsonString, Class<T> objectClass) throws IOException {

        return objectMapper.configure(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES, true).readValue(jsonString, objectClass);
    }


    public static String generatePath(String resourcePath) throws IOException, JSONException {

        switch (resourcePath){

            case "space":
                return "/api/spaces/all";
            case "environments":
                return "/api/"+getSpaceId()+"/environments/all";
            case "libraryvariableset":
                return "/api/"+getSpaceId()+"/libraryvariablesets?contentType=Variables";
            case "variables":
                return "/api/"+ getSpaceId()+"/variables/variableset-Projects-1123";
            case "deploymenttargets":
                return "/api/"+getSpaceId()+"/environments/"+getEnvironmentId()+"/machines";
            case "machines":
                return "/api/"+getSpaceId()+"/machines";
            default:
                return "/api";
        }
    }

}



