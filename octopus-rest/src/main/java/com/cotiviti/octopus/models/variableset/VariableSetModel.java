package com.cotiviti.octopus.models.variableset;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.annotation.processing.Generated;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "ItemType",
        "TotalResults",
        "ItemsPerPage",
        "NumberOfPages",
        "LastPageNumber",
        "Items",
        "Links"
})
@Generated("jsonschema2pojo")
public class VariableSetModel {

    @JsonProperty("ItemType")
    private String itemType;
    @JsonProperty("TotalResults")
    private Integer totalResults;
    @JsonProperty("ItemsPerPage")
    private Integer itemsPerPage;
    @JsonProperty("NumberOfPages")
    private Integer numberOfPages;
    @JsonProperty("LastPageNumber")
    private Integer lastPageNumber;
    @JsonProperty("Items")
    private List<Item> items;
    @JsonProperty("Links")
    private Links__1 links;

    /**
     * No args constructor for use in serialization
     *
     */
    public VariableSetModel() {
    }

    /**
     *
     * @param itemType
     * @param totalResults
     * @param numberOfPages
     * @param itemsPerPage
     * @param links
     * @param lastPageNumber
     * @param items
     */
    public VariableSetModel(String itemType, Integer totalResults, Integer itemsPerPage, Integer numberOfPages, Integer lastPageNumber, List<Item> items, Links__1 links) {
        super();
        this.itemType = itemType;
        this.totalResults = totalResults;
        this.itemsPerPage = itemsPerPage;
        this.numberOfPages = numberOfPages;
        this.lastPageNumber = lastPageNumber;
        this.items = items;
        this.links = links;
    }

    @JsonProperty("ItemType")
    public String getItemType() {
        return itemType;
    }

    @JsonProperty("ItemType")
    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    @JsonProperty("TotalResults")
    public Integer getTotalResults() {
        return totalResults;
    }

    @JsonProperty("TotalResults")
    public void setTotalResults(Integer totalResults) {
        this.totalResults = totalResults;
    }

    @JsonProperty("ItemsPerPage")
    public Integer getItemsPerPage() {
        return itemsPerPage;
    }

    @JsonProperty("ItemsPerPage")
    public void setItemsPerPage(Integer itemsPerPage) {
        this.itemsPerPage = itemsPerPage;
    }

    @JsonProperty("NumberOfPages")
    public Integer getNumberOfPages() {
        return numberOfPages;
    }

    @JsonProperty("NumberOfPages")
    public void setNumberOfPages(Integer numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    @JsonProperty("LastPageNumber")
    public Integer getLastPageNumber() {
        return lastPageNumber;
    }

    @JsonProperty("LastPageNumber")
    public void setLastPageNumber(Integer lastPageNumber) {
        this.lastPageNumber = lastPageNumber;
    }

    @JsonProperty("Items")
    public List<Item> getItems() {
        return items;
    }

    @JsonProperty("Items")
    public void setItems(List<Item> items) {
        this.items = items;
    }

    @JsonProperty("Links")
    public Links__1 getLinks() {
        return links;
    }

    @JsonProperty("Links")
    public void setLinks(Links__1 links) {
        this.links = links;
    }

}