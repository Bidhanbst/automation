package com.cotiviti.octopus.models.spaces;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.annotation.processing.Generated;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "Self",
        "SpaceHome",
        "Web",
        "Logo",
        "Search"
})
@Generated("jsonschema2pojo")
public class Links {

    @JsonProperty("Self")
    private String self;
    @JsonProperty("SpaceHome")
    private String spaceHome;
    @JsonProperty("Web")
    private String web;
    @JsonProperty("Logo")
    private String logo;
    @JsonProperty("Search")
    private String search;

    /**
     * No args constructor for use in serialization
     *
     */
    public Links() {
    }

    /**
     *
     * @param search
     * @param web
     * @param self
     * @param logo
     * @param spaceHome
     */
    public Links(String self, String spaceHome, String web, String logo, String search) {
        super();
        this.self = self;
        this.spaceHome = spaceHome;
        this.web = web;
        this.logo = logo;
        this.search = search;
    }

    @JsonProperty("Self")
    public String getSelf() {
        return self;
    }

    @JsonProperty("Self")
    public void setSelf(String self) {
        this.self = self;
    }

    @JsonProperty("SpaceHome")
    public String getSpaceHome() {
        return spaceHome;
    }

    @JsonProperty("SpaceHome")
    public void setSpaceHome(String spaceHome) {
        this.spaceHome = spaceHome;
    }

    @JsonProperty("Web")
    public String getWeb() {
        return web;
    }

    @JsonProperty("Web")
    public void setWeb(String web) {
        this.web = web;
    }

    @JsonProperty("Logo")
    public String getLogo() {
        return logo;
    }

    @JsonProperty("Logo")
    public void setLogo(String logo) {
        this.logo = logo;
    }

    @JsonProperty("Search")
    public String getSearch() {
        return search;
    }

    @JsonProperty("Search")
    public void setSearch(String search) {
        this.search = search;
    }

}
