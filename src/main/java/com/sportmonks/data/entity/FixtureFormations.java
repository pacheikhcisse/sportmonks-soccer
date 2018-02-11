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
@JsonPropertyOrder({ "localteam_formation", "visitorteam_formation" })
@EqualsAndHashCode
@ToString
public class FixtureFormations {

	@JsonProperty("localteam_formation")
	private String localteamFormation;
	@JsonProperty("visitorteam_formation")
	private String visitorteamFormation;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("localteam_formation")
	public String getLocalteamFormation() {
		return localteamFormation;
	}

	@JsonProperty("localteam_formation")
	public void setLocalteamFormation(String localteamFormation) {
		this.localteamFormation = localteamFormation;
	}

	@JsonProperty("visitorteam_formation")
	public String getVisitorteamFormation() {
		return visitorteamFormation;
	}

	@JsonProperty("visitorteam_formation")
	public void setVisitorteamFormation(String visitorteamFormation) {
		this.visitorteamFormation = visitorteamFormation;
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