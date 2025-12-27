package com.cotiviti.octopus.models.variables;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "Environment",
        "Role"
})

public class Scope {

    @JsonProperty("Environment")
    private List<String> environment;
    @JsonProperty("Role")
    private List<String> role;

    @JsonProperty("Environment")
    public List<String> getEnvironment() {
        return environment;
    }

    @JsonProperty("Environment")
    public void setEnvironment(List<String> environment) {
        this.environment = environment;
    }

    @JsonProperty("Role")
    public List<String> getRole() {
        return role;
    }

    @JsonProperty("Role")
    public void setRole(List<String> role) {
        this.role = role;
    }

}
