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
        "pid",
        "entitlements"
})
public class PidCif {

    @JsonProperty("pid")
    private String pid;
    @JsonProperty("entitlements")
    private List<Entitlement> entitlements = new ArrayList<Entitlement>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * @return The pid
     */
    @JsonProperty("pid")
    public String getPid() {
        return pid;
    }

    /**
     * @param pid The pid
     */
    @JsonProperty("pid")
    public void setPid(String pid) {
        this.pid = pid;
    }

    /**
     * @return The entitlements
     */
    @JsonProperty("entitlements")
    public List<Entitlement> getEntitlements() {
        return entitlements;
    }

    /**
     * @param entitlements The entitlements
     */
    @JsonProperty("entitlements")
    public void setEntitlements(List<Entitlement> entitlements) {
        this.entitlements = entitlements;
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