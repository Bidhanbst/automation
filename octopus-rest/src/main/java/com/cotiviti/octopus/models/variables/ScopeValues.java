package com.cotiviti.octopus.models.variables;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "Environments",
        "Machines",
        "Actions",
        "Roles",
        "Channels",
        "TenantTags",
        "Processes"
})

public class ScopeValues {

    @JsonProperty("Environments")
    private List<com.cotiviti.octopus.models.variables.Environment> environments;
    @JsonProperty("Machines")
    private List<Machine> machines;
    @JsonProperty("Actions")
    private List<Object> actions;
    @JsonProperty("Roles")
    private List<com.cotiviti.octopus.models.variables.Role> roles;
    @JsonProperty("Channels")
    private List<Object> channels;
    @JsonProperty("TenantTags")
    private List<Object> tenantTags;
    @JsonProperty("Processes")
    private List<Object> processes;

    @JsonProperty("Environments")
    public List<com.cotiviti.octopus.models.variables.Environment> getEnvironments() {
        return environments;
    }

    @JsonProperty("Environments")
    public void setEnvironments(List<com.cotiviti.octopus.models.variables.Environment> environments) {
        this.environments = environments;
    }

    @JsonProperty("Machines")
    public List<Machine> getMachines() {
        return machines;
    }

    @JsonProperty("Machines")
    public void setMachines(List<Machine> machines) {
        this.machines = machines;
    }

    @JsonProperty("Actions")
    public List<Object> getActions() {
        return actions;
    }

    @JsonProperty("Actions")
    public void setActions(List<Object> actions) {
        this.actions = actions;
    }

    @JsonProperty("Roles")
    public List<com.cotiviti.octopus.models.variables.Role> getRoles() {
        return roles;
    }

    @JsonProperty("Roles")
    public void setRoles(List<com.cotiviti.octopus.models.variables.Role> roles) {
        this.roles = roles;
    }

    @JsonProperty("Channels")
    public List<Object> getChannels() {
        return channels;
    }

    @JsonProperty("Channels")
    public void setChannels(List<Object> channels) {
        this.channels = channels;
    }

    @JsonProperty("TenantTags")
    public List<Object> getTenantTags() {
        return tenantTags;
    }

    @JsonProperty("TenantTags")
    public void setTenantTags(List<Object> tenantTags) {
        this.tenantTags = tenantTags;
    }

    @JsonProperty("Processes")
    public List<Object> getProcesses() {
        return processes;
    }

    @JsonProperty("Processes")
    public void setProcesses(List<Object> processes) {
        this.processes = processes;
    }

}

