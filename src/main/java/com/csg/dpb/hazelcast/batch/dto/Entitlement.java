package com.csg.dpb.hazelcast.batch.dto;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
        "cif",
        "bu",
        "isPrimaryRM",
        "isPrimaryIC",
        "intermediatePids"
})
public class Entitlement {

    @JsonProperty("cif")
    private Integer cif;
    @JsonProperty("bu")
    private String bu;
    @JsonProperty("isPrimaryRM")
    private Boolean isPrimaryRM;
    @JsonProperty("isPrimaryIC")
    private Boolean isPrimaryIC;
    @JsonProperty("intermediatePids")
    private List<String> intermediatePids = new ArrayList<String>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * @return The cif
     */
    @JsonProperty("cif")
    public Integer getCif() {
        return cif;
    }

    /**
     * @param cif The cif
     */
    @JsonProperty("cif")
    public void setCif(Integer cif) {
        this.cif = cif;
    }

    /**
     * @return The bu
     */
    @JsonProperty("bu")
    public String getBu() {
        return bu;
    }

    /**
     * @param bu The bu
     */
    @JsonProperty("bu")
    public void setBu(String bu) {
        this.bu = bu;
    }

    /**
     * @return The isPrimaryRM
     */
    @JsonProperty("isPrimaryRM")
    public Boolean getIsPrimaryRM() {
        return isPrimaryRM;
    }

    /**
     * @param isPrimaryRM The isPrimaryRM
     */
    @JsonProperty("isPrimaryRM")
    public void setIsPrimaryRM(Boolean isPrimaryRM) {
        this.isPrimaryRM = isPrimaryRM;
    }

    /**
     * @return The isPrimaryIC
     */
    @JsonProperty("isPrimaryIC")
    public Boolean getIsPrimaryIC() {
        return isPrimaryIC;
    }

    /**
     * @param isPrimaryIC The isPrimaryIC
     */
    @JsonProperty("isPrimaryIC")
    public void setIsPrimaryIC(Boolean isPrimaryIC) {
        this.isPrimaryIC = isPrimaryIC;
    }

    /**
     * @return The intermediatePids
     */
    @JsonProperty("intermediatePids")
    public List<String> getIntermediatePids() {
        return intermediatePids;
    }

    /**
     * @param intermediatePids The intermediatePids
     */
    @JsonProperty("intermediatePids")
    public void setIntermediatePids(List<String> intermediatePids) {
        this.intermediatePids = intermediatePids;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}