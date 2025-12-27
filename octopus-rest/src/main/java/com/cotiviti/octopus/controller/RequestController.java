package com.cotiviti.octopus.controller;

import com.cotiviti.octopus.core.Constants;

import com.cotiviti.octopus.models.machines.Item;
import com.cotiviti.octopus.models.machines.MachineInfo;
import com.cotiviti.octopus.models.variables.Scope;
import com.cotiviti.octopus.models.variables.Variable;
import com.cotiviti.octopus.models.variables.Variables;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.cotiviti.octopus.service.RequestService.*;
import static com.cotiviti.octopus.service.RequestService.objectMapper;


public class RequestController {
    static ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
    static Map<String,String> map = new HashMap<String,String>();
    static List<String> list = new ArrayList<String>();

    public static void main(String[] args) throws JSONException, IOException {
//        retreiveAndUpdateJsonValue1();
//        retreiveDeploymentTargets();
    }

    public static void retreiveDeploymentTargets() throws IOException, JSONException {

            String jsonResponse = httpRequest(generatePath("deploymenttargets"),"GET");


        MachineInfo machineInfo = mapJsonToObject(jsonResponse, MachineInfo.class);

        String json = ow.writeValueAsString(machineInfo);

        JSONObject root = new JSONObject(json);
        JSONArray items = root.getJSONArray("Items");

        Item[] items1 = objectMapper.configure(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES, true).readValue(items.toString(), Item[].class);

        for (Item i : items1) map.put(i.getName(),i.getUri());
        System.out.println(map);
    }

    public static void retreiveAndUpdateJsonValue1() throws IOException, InterruptedException, JSONException {

        HttpClient httpClient = HttpClient.newBuilder()
                .version(HttpClient.Version.HTTP_1_1)
                .build();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(Constants.octopusServerURL+"/api/Spaces-1/variables/variableset-Projects-1123"))
                .setHeader("X-Octopus-ApiKey", Constants.apiKey)
                .build();

        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

        JSONObject json = new JSONObject(response.body());

        Variables variables = mapJsonToObject(json.toString(), Variables.class);

        Variable variable = new Variable();
        Scope scope = new Scope();

            variables.setVersion(variables.getVersion());
            variable.setName("Egg");
            variable.setValue("E");
            variable.setIsSensitive(false);
            variable.setType("String");
            variable.setDescription("Added by RestAPI");
            variable.setScope(scope);
            variable.setIsEditable(false);
            variable.setPrompt("");
            variables.getVariables().add(variable);

        String updatedJson = ow.writeValueAsString(variables);

        HttpRequest requestWithUpdatedPayload = HttpRequest.newBuilder()
                .uri(URI.create(Constants.octopusServerURL+"/api/Spaces-1/variables/variableset-Projects-1123"))
                .header("Content-Type", "application/json")
                .PUT(HttpRequest.BodyPublishers.ofString(updatedJson))
                .setHeader("X-Octopus-ApiKey", Constants.apiKey)
                .build();

        HttpResponse<String> updatedResponse = httpClient.send(requestWithUpdatedPayload, HttpResponse.BodyHandlers.ofString());

        System.out.println(updatedResponse);
    }

}

