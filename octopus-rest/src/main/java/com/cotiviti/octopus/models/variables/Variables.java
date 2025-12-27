package com.cotiviti.octopus.models.variables;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "Id",
        "OwnerId",
        "Version",
        "Variables",
        "ScopeValues",
        "SpaceId",
        "Links"
})

public class Variables {

    @JsonProperty("Id")
    private String id;
    @JsonProperty("OwnerId")
    private String ownerId;
    @JsonProperty("Version")
    private Integer version;
    @JsonProperty("Variables")
    private List<com.cotiviti.octopus.models.variables.Variable> variables;
    @JsonProperty("ScopeValues")
    private ScopeValues scopeValues;
    @JsonProperty("SpaceId")
    private String spaceId;
    @JsonProperty("Links")
    private com.cotiviti.octopus.models.variables.Links links;


    public Variables()
    {
        super();
    }

    public Variables(String id, String ownerId, Integer version, List<com.cotiviti.octopus.models.variables.Variable> variables, ScopeValues scopeValues, String spaceId, com.cotiviti.octopus.models.variables.Links links) {
        this.id = id;
        this.ownerId = ownerId;
        this.version = version;
        this.variables = variables;
        this.scopeValues = scopeValues;
        this.spaceId = spaceId;
        this.links = links;
    }

    public Variables(List<com.cotiviti.octopus.models.variables.Variable> variables) {
        this.variables = variables;
    }

    @JsonProperty("Id")
    public String getId() {
        return id;
    }

    @JsonProperty("Id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("OwnerId")
    public String getOwnerId() {
        return ownerId;
    }

    @JsonProperty("OwnerId")
    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    @JsonProperty("Version")
    public Integer getVersion() {
        return version;
    }

    @JsonProperty("Version")
    public void setVersion(Integer version) {
        this.version = version;
    }

    @JsonProperty("Variables")
    public List<com.cotiviti.octopus.models.variables.Variable> getVariables() {
        return variables;
    }

    @JsonProperty("Variables")
    public void setVariables(List<com.cotiviti.octopus.models.variables.Variable> variables) {
        this.variables = variables;
    }

    @JsonProperty("ScopeValues")
    public ScopeValues getScopeValues() {
        return scopeValues;
    }

    @JsonProperty("ScopeValues")
    public void setScopeValues(ScopeValues scopeValues) {
        this.scopeValues = scopeValues;
    }

    @JsonProperty("SpaceId")
    public String getSpaceId() {
        return spaceId;
    }

    @JsonProperty("SpaceId")
    public void setSpaceId(String spaceId) {
        this.spaceId = spaceId;
    }

    @JsonProperty("Links")
    public com.cotiviti.octopus.models.variables.Links getLinks() {
        return links;
    }

    @JsonProperty("Links")
    public void setLinks(com.cotiviti.octopus.models.variables.Links links) {
        this.links = links;
    }

}