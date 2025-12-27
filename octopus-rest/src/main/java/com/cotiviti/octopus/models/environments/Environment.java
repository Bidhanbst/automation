package com.cotiviti.octopus.models.environments;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class Environment {
    @JsonProperty("Id")
    public String id;
    @JsonProperty("Name")
    public String name;
    @JsonProperty("Description")
    public String description;
    @JsonProperty("SortOrder")
    public int sortOrder;
    @JsonProperty("UseGuidedFailure")
    public boolean useGuidedFailure;
    @JsonProperty("AllowDynamicInfrastructure")
    public boolean allowDynamicInfrastructure;
    @JsonProperty("SpaceId")
    public String spaceId;
    @JsonProperty("ExtensionSettings")
    public ArrayList<Object> extensionSettings;
    @JsonProperty("Links")
    public Links links;

    public Environment(String id, String name, String description, int sortOrder, boolean useGuidedFailure, boolean allowDynamicInfrastructure, String spaceId, ArrayList<Object> extensionSettings, Links links) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.sortOrder = sortOrder;
        this.useGuidedFailure = useGuidedFailure;
        this.allowDynamicInfrastructure = allowDynamicInfrastructure;
        this.spaceId = spaceId;
        this.extensionSettings = extensionSettings;
        this.links = links;
    }

    public Environment()
    {
        super();
    }

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(int sortOrder) {
        this.sortOrder = sortOrder;
    }

    public boolean isUseGuidedFailure() {
        return useGuidedFailure;
    }

    public void setUseGuidedFailure(boolean useGuidedFailure) {
        this.useGuidedFailure = useGuidedFailure;
    }

    public boolean isAllowDynamicInfrastructure() {
        return allowDynamicInfrastructure;
    }

    public void setAllowDynamicInfrastructure(boolean allowDynamicInfrastructure) {
        this.allowDynamicInfrastructure = allowDynamicInfrastructure;
    }

    public String getSpaceId() {
        return spaceId;
    }

    public void setSpaceId(String spaceId) {
        this.spaceId = spaceId;
    }

    public ArrayList<Object> getExtensionSettings() {
        return extensionSettings;
    }

    public void setExtensionSettings(ArrayList<Object> extensionSettings) {
        this.extensionSettings = extensionSettings;
    }

    public Links getLinks() {
        return links;
    }

    public void setLinks(Links links) {
        this.links = links;
    }
}



