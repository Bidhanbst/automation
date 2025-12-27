package com.cotiviti.octopus.models.variableset;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.annotation.processing.Generated;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "Self",
        "Template",
        "Page.All",
        "Page.Current",
        "Page.Last"
})

public class Links__1 {

    @JsonProperty("Self")
    private String self;
    @JsonProperty("Template")
    private String template;
    @JsonProperty("Page.All")
    private String pageAll;
    @JsonProperty("Page.Current")
    private String pageCurrent;
    @JsonProperty("Page.Last")
    private String pageLast;

    /**
     * No args constructor for use in serialization
     *
     */
    public Links__1() {
    }

    /**
     *
     * @param template
     * @param pageLast
     * @param pageAll
     * @param self
     * @param pageCurrent
     */
    public Links__1(String self, String template, String pageAll, String pageCurrent, String pageLast) {
        super();
        this.self = self;
        this.template = template;
        this.pageAll = pageAll;
        this.pageCurrent = pageCurrent;
        this.pageLast = pageLast;
    }

    @JsonProperty("Self")
    public String getSelf() {
        return self;
    }

    @JsonProperty("Self")
    public void setSelf(String self) {
        this.self = self;
    }

    @JsonProperty("Template")
    public String getTemplate() {
        return template;
    }

    @JsonProperty("Template")
    public void setTemplate(String template) {
        this.template = template;
    }

    @JsonProperty("Page.All")
    public String getPageAll() {
        return pageAll;
    }

    @JsonProperty("Page.All")
    public void setPageAll(String pageAll) {
        this.pageAll = pageAll;
    }

    @JsonProperty("Page.Current")
    public String getPageCurrent() {
        return pageCurrent;
    }

    @JsonProperty("Page.Current")
    public void setPageCurrent(String pageCurrent) {
        this.pageCurrent = pageCurrent;
    }

    @JsonProperty("Page.Last")
    public String getPageLast() {
        return pageLast;
    }

    @JsonProperty("Page.Last")
    public void setPageLast(String pageLast) {
        this.pageLast = pageLast;
    }

}
