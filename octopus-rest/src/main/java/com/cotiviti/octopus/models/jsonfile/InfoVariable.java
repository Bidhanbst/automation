package com.cotiviti.octopus.models.jsonfile;

import com.cotiviti.octopus.models.variables.Scope;

public class InfoVariable {

    private String name;
    private String value;
    private String description;
    private Scope scope;
    private Boolean isEditable;
    private String type;
    private Boolean isSensitive;

    public InfoVariable(String name, String value, String description, Scope scope, Boolean isEditable, String type, Boolean isSensitive) {
        this.name = name;
        this.value = value;
        this.description = description;
        this.scope = scope;
        this.isEditable = isEditable;
        this.type = type;
        this.isSensitive = isSensitive;
    }


    public InfoVariable ()
    {
        super();
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getValue() {
        return value;
    }
    public void setValue(String value) {
        this.value = value;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public Scope getScope() {
        return scope;
    }
    public void setScope(Scope scope) {
        this.scope = scope;
    }
    public Boolean getIsEditable() {
        return isEditable;
    }
    public void setIsEditable(Boolean isEditable) {
        this.isEditable = isEditable;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public Boolean getIsSensitive() {
        return isSensitive;
    }
    public void setIsSensitive(Boolean isSensitive) {
        this.isSensitive = isSensitive;
    }
}

