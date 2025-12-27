package com.cotiviti.octopus.models.variableset;


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
        "VariableSetId",
        "ContentType",
        "Templates",
        "SpaceId",
        "Links"
})
@Generated("jsonschema2pojo")
public class Item {

    @JsonProperty("Id")
    private String id;
    @JsonProperty("Name")
    private String name;
    @JsonProperty("Description")
    private String description;
    @JsonProperty("VariableSetId")
    private String variableSetId;
    @JsonProperty("ContentType")
    private String contentType;
    @JsonProperty("Templates")
    private List<Object> templates;
    @JsonProperty("SpaceId")
    private String spaceId;
    @JsonProperty("Links")
    private Links links;

    /**
     * No args constructor for use in serialization
     *
     */
    public Item() {
    }

    /**
     *
     * @param spaceId
     * @param templates
     * @param name
     * @param description
     * @param variableSetId
     * @param links
     * @param id
     * @param contentType
     */
    public Item(String id, String name, String description, String variableSetId, String contentType, List<Object> templates, String spaceId, Links links) {
        super();
        this.id = id;
        this.name = name;
        this.description = description;
        this.variableSetId = variableSetId;
        this.contentType = contentType;
        this.templates = templates;
        this.spaceId = spaceId;
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
    public String getDescription() {
        return description;
    }

    @JsonProperty("Description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("VariableSetId")
    public String getVariableSetId() {
        return variableSetId;
    }

    @JsonProperty("VariableSetId")
    public void setVariableSetId(String variableSetId) {
        this.variableSetId = variableSetId;
    }

    @JsonProperty("ContentType")
    public String getContentType() {
        return contentType;
    }

    @JsonProperty("ContentType")
    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    @JsonProperty("Templates")
    public List<Object> getTemplates() {
        return templates;
    }

    @JsonProperty("Templates")
    public void setTemplates(List<Object> templates) {
        this.templates = templates;
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
    public Links getLinks() {
        return links;
    }

    @JsonProperty("Links")
    public void setLinks(Links links) {
        this.links = links;
    }

}
