package com.cotiviti.octopus.service;

import com.cotiviti.octopus.core.Constants;
import com.cotiviti.octopus.models.environments.Environment;
import com.cotiviti.octopus.models.machines.MachineInfo;
import com.cotiviti.octopus.models.spaces.Space;
import com.cotiviti.octopus.models.variables.Scope;
import com.cotiviti.octopus.models.variables.Variable;
import com.cotiviti.octopus.models.variables.Variables;
import com.cotiviti.octopus.models.variableset.Item;
import com.cotiviti.octopus.models.variableset.VariableSetModel;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.*;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static com.cotiviti.octopus.service.RequestService.*;

public class GetResource {

    static ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
    static Map<String,String> map = new HashMap<String,String>();
    static List<String> list = new ArrayList<String>();
    private final Log logger = LogFactory.getLog(getClass());

    public static String getSpaceId() throws IOException, JSONException {

        String jsonResponse = httpRequest(generatePath("space"),"GET");

        Space[] space = mapJsonToObject(jsonResponse, Space[].class);

        String json = ow.writeValueAsString(space);

        List<Space> spaces = objectMapper.readValue(json, new TypeReference<List<Space>>(){});

        for (Space i : spaces) map.put(i.getName(),i.getId());

        return map.get(Constants.spaceName);

    }

    public static String getEnvironmentId() throws IOException, JSONException {

        String jsonResponse = httpRequest(generatePath("environments"),"GET");
        Environment[] environments = mapJsonToObject(jsonResponse, Environment[].class);
        String json = ow.writeValueAsString(environments);

        List<Environment> environmentList = objectMapper.readValue(json, new TypeReference<List<Environment>>(){});

        for (Environment i : environmentList) map.put(i.getName(),i.getId());
        return map.get(Constants.environmentName);

    }

    public static String getMachineId() throws IOException, JSONException {

        String jsonResponse = httpRequest(generatePath("machines"),"GET");
        MachineInfo machineInfo = mapJsonToObject(jsonResponse, MachineInfo.class);
        String json = ow.writeValueAsString(machineInfo);

        JSONObject root = new JSONObject(json);
        JSONArray items1 = root.getJSONArray("Items");

        com.cotiviti.octopus.models.machines.Item[] items = objectMapper.configure(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES, true).readValue(items1.toString(), com.cotiviti.octopus.models.machines.Item[].class);

        for (com.cotiviti.octopus.models.machines.Item i : items) map.put(i.getName(),i.getId());
        for (com.cotiviti.octopus.models.machines.Item i : items) list.add(i.getName());

        return map.get(Constants.machineName);

    }

    public static String getVariableSetID() throws IOException, JSONException {

        String jsonResponse = httpRequest(generatePath("libraryvariableset"), "GET");

        VariableSetModel variableSetModel = mapJsonToObject(jsonResponse, VariableSetModel.class);

        String json = ow.writeValueAsString(variableSetModel);

        JSONObject root = new JSONObject(json);
        JSONArray items1 = root.getJSONArray("Items");

        Item[] items = objectMapper.configure(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES, true).readValue(items1.toString(), Item[].class);

        for (Item i : items) map.put(i.getName(),i.getVariableSetId());
        for (Item i : items) list.add(i.getName());

        return map.get(Constants.libraryVariableSetName);

    }

    public static void retreiveAndUpdateJsonValue() throws IOException, InterruptedException, JSONException {

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
        System.out.println(updatedJson);

        HttpRequest requestWithUpdatedPayload = HttpRequest.newBuilder()
                .uri(URI.create(Constants.octopusServerURL+"/api/Spaces-1/variables/variableset-Projects-1123"))
                .header("Content-Type", "application/json")
                .PUT(HttpRequest.BodyPublishers.ofString(updatedJson))
                .setHeader("X-Octopus-ApiKey", Constants.apiKey)
                .build();

        HttpResponse<String> updatedResponse = httpClient.send(requestWithUpdatedPayload, HttpResponse.BodyHandlers.ofString());

        System.out.println(updatedResponse);


    }

    public static JSONObject jsonObjectFromJsonFile() throws FileNotFoundException, JSONException {

        File jsonFile = new File("src/main/resources/variables.json");

        Scanner scanner = new Scanner(jsonFile);

        String jsonFileContent = "";

        while (scanner.hasNextLine()) {
            jsonFileContent += scanner.nextLine();
        }

        JSONObject jsonFromFile = new JSONObject(jsonFileContent);

        return jsonFromFile;
    }

    public static JSONObject jsonArrayToJsonObject() throws FileNotFoundException, JSONException {

        JSONObject jsonObject = new JSONObject();
        JSONArray jsonArray = jsonObjectFromJsonFile().getJSONArray("Variables");
        jsonObject.put("Variables", jsonArray);
        System.out.println(jsonObject);
        return jsonObject;
    }

    public static void retreiveValueFromKey(String key) throws JSONException, FileNotFoundException {

        JSONArray jsonArray = jsonObjectFromJsonFile().getJSONArray("Variables");

        for (int i = 0; i < jsonArray.length(); i++) {

            JSONObject jsonObject = jsonArray.getJSONObject(i);
            String value = jsonObject.getString(key);
            System.out.println(value);

        }

    }

    public static List<String> getValuesForGivenKey(String key) throws JSONException, FileNotFoundException {
        JSONArray jsonArray = jsonObjectFromJsonFile().getJSONArray("Variables");
        return IntStream.range(0, jsonArray.length())
                .mapToObj(index -> {
                    try {
                        return ((JSONObject)jsonArray.get(index)).optString(key);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    return null;
                })
                .collect(Collectors.toList());
    }



    public static void getValue() throws IOException, JSONException {

        File jsonFile = new File("src/main/resources/variables.json");

        JSONArray jsonArray = jsonObjectFromJsonFile().getJSONArray("Variables");

        JSONArray jsonArray1 = objectMapper.readValue(jsonArray.toString(), JSONArray.class);

        System.out.println(jsonArray1);
    }



}


