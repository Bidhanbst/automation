package com.cotiviti.octopus.models.environments;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Links {
        @JsonProperty("Self")
        public String self;
        @JsonProperty("Machines")
        public String machines;
        @JsonProperty("SinglyScopedVariableDetails")
        public String singlyScopedVariableDetails;
        @JsonProperty("Metadata")
        public String metadata;

    public Links(String self, String machines, String singlyScopedVariableDetails, String metadata) {
        this.self = self;
        this.machines = machines;
        this.singlyScopedVariableDetails = singlyScopedVariableDetails;
        this.metadata = metadata;
    }

    public Links()
    {
        super();
    }

    public String getSelf() {
        return self;
    }

    public void setSelf(String self) {
        this.self = self;
    }

    public String getMachines() {
        return machines;
    }

    public void setMachines(String machines) {
        this.machines = machines;
    }

    public String getSinglyScopedVariableDetails() {
        return singlyScopedVariableDetails;
    }

    public void setSinglyScopedVariableDetails(String singlyScopedVariableDetails) {
        this.singlyScopedVariableDetails = singlyScopedVariableDetails;
    }

    public String getMetadata() {
        return metadata;
    }

    public void setMetadata(String metadata) {
        this.metadata = metadata;
    }
}
