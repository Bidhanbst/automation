package com.cotiviti.octopus.models.machines;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class Item {
    @JsonProperty("Id")
    public String id;
    @JsonProperty("EnvironmentIds")
    public ArrayList<String> environmentIds;
    @JsonProperty("Roles")
    public ArrayList<String> roles;
    @JsonProperty("TenantedDeploymentParticipation")
    public String tenantedDeploymentParticipation;
    @JsonProperty("TenantIds")
    public ArrayList<String> tenantIds;
    @JsonProperty("TenantTags")
    public ArrayList<String> tenantTags;
    @JsonProperty("SpaceId")
    public String spaceId;
    @JsonProperty("Name")
    public String name;
    @JsonProperty("Thumbprint")
    public String thumbprint;
    @JsonProperty("Uri")
    public String uri;
    @JsonProperty("IsDisabled")
    public boolean isDisabled;
    @JsonProperty("MachinePolicyId")
    public String machinePolicyId;
    @JsonProperty("Status")
    public String status;
    @JsonProperty("HealthStatus")
    public String healthStatus;
    @JsonProperty("HasLatestCalamari")
    public boolean hasLatestCalamari;
    @JsonProperty("StatusSummary")
    public String statusSummary;
    @JsonProperty("IsInProcess")
    public boolean isInProcess;
    @JsonProperty("OperatingSystem")
    public String operatingSystem;
    @JsonProperty("ShellName")
    public String shellName;
    @JsonProperty("ShellVersion")
    public String shellVersion;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }
}
