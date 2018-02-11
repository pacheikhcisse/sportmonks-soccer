package com.sportmonks.data.structure;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.sportmonks.data.entity.Coach;
import lombok.EqualsAndHashCode;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "data" })
@EqualsAndHashCode
public class Coachs {

	@JsonProperty("data")
	private Coach data;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("data")
	public Coach getData() {
		return data;
	}

	@JsonProperty("data")
	public void setData(Coach data) {
		this.data = data;
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