package com.cotiviti.octopus.models.variables;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "Self"
})

public class Links {

    @JsonProperty("Self")
    private String self;

    @JsonProperty("Self")
    public String getSelf() {
        return self;
    }

    @JsonProperty("Self")
    public void setSelf(String self) {
        this.self = self;
    }

}