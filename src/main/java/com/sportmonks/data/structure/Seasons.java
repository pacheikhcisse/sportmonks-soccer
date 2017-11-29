package com.sportmonks.data.structure;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.sportmonks.data.entity.Season;

import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "data" })
public class Seasons extends AbstractEndPointResponse {

	@JsonProperty("data")
	private List<Season> data = null;

	@JsonProperty("data")
	public List<Season> getData() {
		return data;
	}

	@JsonProperty("data")
	public void setData(List<Season> data) {
		this.data = data;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return super.getAdditionalProperties();
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		super.getAdditionalProperties().put(name, value);
	}

}