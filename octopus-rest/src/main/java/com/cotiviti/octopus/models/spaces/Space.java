package com.cotiviti.octopus.models.spaces;

import java.util.List;

import com.cotiviti.octopus.models.spaces.Links;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.annotation.processing.Generated;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "Id",
        "Name",
        "Description",
        "IsDefault",
        "TaskQueueStopped",
        "SpaceManagersTeams",
        "SpaceManagersTeamMembers",
        "Links"
})
@Generated("jsonschema2pojo")
public class Space {

    @JsonProperty("Id")
    private String id;
    @JsonProperty("Name")
    private String name;
    @JsonProperty("Description")
    private Object description;
    @JsonProperty("IsDefault")
    private Boolean isDefault;
    @JsonProperty("TaskQueueStopped")
    private Boolean taskQueueStopped;
    @JsonProperty("SpaceManagersTeams")
    private List<String> spaceManagersTeams;
    @JsonProperty("SpaceManagersTeamMembers")
    private List<String> spaceManagersTeamMembers;
    @JsonProperty("Links")
    private Links links;

    /**
     * No args constructor for use in serialization
     *
     */
    public Space() {
    }

    /**
     *
     * @param isDefault
     * @param spaceManagersTeamMembers
     * @param spaceManagersTeams
     * @param name
     * @param description
     * @param taskQueueStopped
     * @param links
     * @param id
     */
    public Space(String id, String name, Object description, Boolean isDefault, Boolean taskQueueStopped, List<String> spaceManagersTeams, List<String> spaceManagersTeamMembers, Links links) {
        super();
        this.id = id;
        this.name = name;
        this.description = description;
        this.isDefault = isDefault;
        this.taskQueueStopped = taskQueueStopped;
        this.spaceManagersTeams = spaceManagersTeams;
        this.spaceManagersTeamMembers = spaceManagersTeamMembers;
        this.links = links;
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

    @JsonProperty("Description")
    public Object getDescription() {
        return description;
    }

    @JsonProperty("Description")
    public void setDescription(Object description) {
        this.description = description;
    }

    @JsonProperty("IsDefault")
    public Boolean getIsDefault() {
        return isDefault;
    }

    @JsonProperty("IsDefault")
    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    @JsonProperty("TaskQueueStopped")
    public Boolean getTaskQueueStopped() {
        return taskQueueStopped;
    }

    @JsonProperty("TaskQueueStopped")
    public void setTaskQueueStopped(Boolean taskQueueStopped) {
        this.taskQueueStopped = taskQueueStopped;
    }

    @JsonProperty("SpaceManagersTeams")
    public List<String> getSpaceManagersTeams() {
        return spaceManagersTeams;
    }

    @JsonProperty("SpaceManagersTeams")
    public void setSpaceManagersTeams(List<String> spaceManagersTeams) {
        this.spaceManagersTeams = spaceManagersTeams;
    }

    @JsonProperty("SpaceManagersTeamMembers")
    public List<String> getSpaceManagersTeamMembers() {
        return spaceManagersTeamMembers;
    }

    @JsonProperty("SpaceManagersTeamMembers")
    public void setSpaceManagersTeamMembers(List<String> spaceManagersTeamMembers) {
        this.spaceManagersTeamMembers = spaceManagersTeamMembers;
    }

    @JsonProperty("Links")
    public Links getLinks() {
        return links;
    }

    @JsonProperty("Links")
    public void setLinks(Links links) {
        this.links = links;
    }

}