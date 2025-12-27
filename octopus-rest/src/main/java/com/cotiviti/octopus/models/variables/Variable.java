package com.cotiviti.octopus.models.variables;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "Id",
        "Name",
        "Value",
        "Description",
        "Scope",
        "IsEditable",
        "Prompt",
        "Type",
        "IsSensitive"
})

public class Variable {

    @JsonProperty("Id")
    private String id;
    @JsonProperty("Name")
    private String name;
    @JsonProperty("Value")
    private String value;
    @JsonProperty("Description")
    private String description;
    @JsonProperty("Scope")
    private com.cotiviti.octopus.models.variables.Scope scope;
    @JsonProperty("IsEditable")
    private Boolean isEditable;
    @JsonProperty("Prompt")
    private Object prompt;
    @JsonProperty("Type")
    private String type;
    @JsonProperty("IsSensitive")
    private Boolean isSensitive;

    public Variable(String id, String name, String value, String description, com.cotiviti.octopus.models.variables.Scope scope, Boolean isEditable, Object prompt, String type, Boolean isSensitive) {
        this.id = id;
        this.name = name;
        this.value = value;
        this.description = description;
        this.scope = scope;
        this.isEditable = isEditable;
        this.prompt = prompt;
        this.type = type;
        this.isSensitive = isSensitive;
    }

    public Variable()
    {
        super();
    }

    public Variable(String name, String value) {
        this.name = name;
        this.value = value;
    }

    @JsonProperty("Id")
    public String getId() {
        return id;
    }

    @JsonProperty("Id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("Name")
    public String getName() {
        return name;
    }

    @JsonProperty("Name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("Value")
    public String getValue() {
        return value;
    }

    @JsonProperty("Value")
    public void setValue(String value) {
        this.value = value;
    }

    @JsonProperty("Description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("Description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("Scope")
    public com.cotiviti.octopus.models.variables.Scope getScope() {
        return scope;
    }

    @JsonProperty("Scope")
    public void setScope(com.cotiviti.octopus.models.variables.Scope scope) {
        this.scope = scope;
    }

    @JsonProperty("IsEditable")
    public Boolean getIsEditable() {
        return isEditable;
    }

    @JsonProperty("IsEditable")
    public void setIsEditable(Boolean isEditable) {
        this.isEditable = isEditable;
    }

    @JsonProperty("Prompt")
    public Object getPrompt() {
        return prompt;
    }

    @JsonProperty("Prompt")
    public void setPrompt(Object prompt) {
        this.prompt = prompt;
    }

    @JsonProperty("Type")
    public String getType() {
        return type;
    }

    @JsonProperty("Type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("IsSensitive")
    public Boolean getIsSensitive() {
        return isSensitive;
    }

    @JsonProperty("IsSensitive")
    public void setIsSensitive(Boolean isSensitive) {
        this.isSensitive = isSensitive;
    }

}
