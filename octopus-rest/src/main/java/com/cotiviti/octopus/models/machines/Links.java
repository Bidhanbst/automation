package com.cotiviti.octopus.models.machines;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Links{
    @JsonProperty("Self")
    public String self;
    @JsonProperty("Connection")
    public String connection;
    @JsonProperty("TasksTemplate")
    public String tasksTemplate;
    @JsonProperty("Template")
    public String template;
}
