package com.cotiviti.octopus.models.machines;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class MachineInfo {

    @JsonProperty("ItemType")
    public String itemType;
    @JsonProperty("TotalResults")
    public int totalResults;
    @JsonProperty("ItemsPerPage")
    public int itemsPerPage;
    @JsonProperty("NumberOfPages")
    public int numberOfPages;
    @JsonProperty("LastPageNumber")
    public int lastPageNumber;
    @JsonProperty("Items")
    public ArrayList<Item> items;
    @JsonProperty("Links")
    public Links links;

}




