package com.sportmonks.data.structure;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.sportmonks.data.entity.StatsCards;
import com.sportmonks.data.entity.StatsFouls;
import com.sportmonks.data.entity.StatsGoals;
import com.sportmonks.data.entity.StatsOther;
import com.sportmonks.data.entity.StatsPassing;
import com.sportmonks.data.entity.StatsShots;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "shots", "goals", "fouls", "cards", "passing", "other" })
@EqualsAndHashCode
@ToString
public class Stats {

	@JsonProperty("shots")
	private StatsShots shots;
	@JsonProperty("goals")
	private StatsGoals goals;
	@JsonProperty("fouls")
	private StatsFouls fouls;
	@JsonProperty("cards")
	private StatsCards cards;
	@JsonProperty("passing")
	private StatsPassing passing;
	@JsonProperty("other")
	private StatsOther other;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("shots")
	public StatsShots getShots() {
		return shots;
	}

	@JsonProperty("shots")
	public void setShots(StatsShots shots) {
		this.shots = shots;
	}

	@JsonProperty("goals")
	public StatsGoals getGoals() {
		return goals;
	}

	@JsonProperty("goals")
	public void setGoals(StatsGoals goals) {
		this.goals = goals;
	}

	@JsonProperty("fouls")
	public StatsFouls getFouls() {
		return fouls;
	}

	@JsonProperty("fouls")
	public void setFouls(StatsFouls fouls) {
		this.fouls = fouls;
	}

	@JsonProperty("cards")
	public StatsCards getCards() {
		return cards;
	}

	@JsonProperty("cards")
	public void setCards(StatsCards cards) {
		this.cards = cards;
	}

	@JsonProperty("passing")
	public StatsPassing getPassing() {
		return passing;
	}

	@JsonProperty("passing")
	public void setPassing(StatsPassing passing) {
		this.passing = passing;
	}

	@JsonProperty("other")
	public StatsOther getOther() {
		return other;
	}

	@JsonProperty("other")
	public void setOther(StatsOther other) {
		this.other = other;
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