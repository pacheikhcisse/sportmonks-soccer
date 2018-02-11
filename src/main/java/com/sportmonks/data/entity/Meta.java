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
@JsonPropertyOrder({ "subscription", "plan", "sport", "pagination" })
@EqualsAndHashCode
@ToString
public class Meta {

	@JsonProperty("subscription")
	private MetaSubscription subscription;
	@JsonProperty("plan")
	private MetaPlan plan;
	@JsonProperty("sport")
	private MetaSport sport;
	@JsonProperty("pagination")
	private MetaPagination pagination;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("subscription")
	public MetaSubscription getSubscription() {
		return subscription;
	}

	@JsonProperty("subscription")
	public void setSubscription(MetaSubscription subscription) {
		this.subscription = subscription;
	}

	@JsonProperty("plan")
	public MetaPlan getPlan() {
		return plan;
	}

	@JsonProperty("plan")
	public void setPlan(MetaPlan plan) {
		this.plan = plan;
	}

	@JsonProperty("sport")
	public MetaSport getSport() {
		return sport;
	}

	@JsonProperty("sport")
	public void setSport(MetaSport sport) {
		this.sport = sport;
	}

	@JsonProperty("pagination")
	public MetaPagination getPagination() {
		return pagination;
	}

	@JsonProperty("pagination")
	public void setPagination(MetaPagination pagination) {
		this.pagination = pagination;
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