package com.sportmonks.data.entity;

/**
 * Created by KS on 06/06/2017.
 */

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "status", "starting_at", "minute", "extra_minute", "injury_time" })
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class FixtureTime {

	@JsonProperty("status")
	private String status;
	@JsonProperty("starting_at")
	private Date startingAt;
	@JsonProperty("minute")
	private Integer minute;
	@JsonProperty("extra_minute")
	private Integer extraMinute;
	@JsonProperty("injury_time")
	private Integer injuryTime;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("status")
	public String getStatus() {
		return status;
	}

	@JsonProperty("status")
	public void setStatus(String status) {
		this.status = status;
	}

	@JsonProperty("starting_at")
	public Date getStartingAt() {
		return startingAt;
	}

	@JsonProperty("starting_at")
	public void setStartingAt(Date startingAt) {
		this.startingAt = startingAt;
	}

	@JsonProperty("minute")
	public Integer getMinute() {
		return minute;
	}

	@JsonProperty("minute")
	public void setMinute(Integer minute) {
		this.minute = minute;
	}

	@JsonProperty("extra_minute")
	public Integer getExtraMinute() {
		return extraMinute;
	}

	@JsonProperty("extra_minute")
	public void setExtraMinute(Integer extraMinute) {
		this.extraMinute = extraMinute;
	}

	@JsonProperty("injury_time")
	public Integer getInjuryTime() {
		return injuryTime;
	}

	@JsonProperty("injury_time")
	public void setInjuryTime(Integer injuryTime) {
		this.injuryTime = injuryTime;
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