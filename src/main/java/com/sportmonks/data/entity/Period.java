package com.sportmonks.data.entity;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "minute", "count", "percentage" })
@EqualsAndHashCode
@ToString
public class Period {

	@JsonProperty("minute")
	private String minute;
	@JsonProperty("count")
	private String count;
	@JsonProperty("percentage")
	private String percentage;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("minute")
	public String getMinute() {
		return minute;
	}

	@JsonProperty("minute")
	public void setMinute(String minute) {
		this.minute = minute;
	}

	@JsonProperty("count")
	public String getCount() {
		return count;
	}

	@JsonProperty("count")
	public void setCount(String count) {
		this.count = count;
	}

	@JsonProperty("percentage")
	public String getPercentage() {
		return percentage;
	}

	@JsonProperty("percentage")
	public void setPercentage(String percentage) {
		this.percentage = percentage;
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