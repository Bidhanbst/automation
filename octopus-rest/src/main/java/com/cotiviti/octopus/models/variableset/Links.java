package com.cotiviti.octopus.models.variableset;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.annotation.processing.Generated;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "Self",
        "Variables",
        "Usages"
})
@Generated("jsonschema2pojo")
public class Links {

    @JsonProperty("Self")
    private String self;
    @JsonProperty("Variables")
    private String variables;
    @JsonProperty("Usages")
    private String usages;

    /**
     * No args constructor for use in serialization
     *
     */
    public Links() {
    }

    /**
     *
     * @param variables
     * @param self
     * @param usages
     */
    public Links(String self, String variables, String usages) {
        super();
        this.self = self;
        this.variables = variables;
        this.usages = usages;
    }

    @JsonProperty("Self")
    public String getSelf() {
        return self;
    }

    @JsonProperty("Self")
    public void setSelf(String self) {
        this.self = self;
    }

    @JsonProperty("Variables")
    public String getVariables() {
        return variables;
    }

    @JsonProperty("Variables")
    public void setVariables(String variables) {
        this.variables = variables;
    }

    @JsonProperty("Usages")
    public String getUsages() {
        return usages;
    }

    @JsonProperty("Usages")
    public void setUsages(String usages) {
        this.usages = usages;
    }

}