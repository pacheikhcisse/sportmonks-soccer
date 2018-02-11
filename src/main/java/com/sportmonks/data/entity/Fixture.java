package com.sportmonks.data.entity;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.sportmonks.data.structure.Commentaries;
import com.sportmonks.data.structure.FixtureBench;
import com.sportmonks.data.structure.FixtureCards;
import com.sportmonks.data.structure.FixtureEvents;
import com.sportmonks.data.structure.FixtureGoals;
import com.sportmonks.data.structure.FixtureHighlights;
import com.sportmonks.data.structure.FixtureLeague;
import com.sportmonks.data.structure.FixtureLineup;
import com.sportmonks.data.structure.FixtureOther;
import com.sportmonks.data.structure.FixtureRound;
import com.sportmonks.data.structure.FixtureSeason;
import com.sportmonks.data.structure.FixtureStage;
import com.sportmonks.data.structure.FixtureSubstitutions;
import com.sportmonks.data.structure.FixtureTeam;
import com.sportmonks.data.structure.FixtureTvStations;
import com.sportmonks.data.structure.Stats;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"id", "league_id", "season_id", "stage_id", "round_id", "aggregate_id", "venue_id", "referee_id", "localteam_id", "visitorteam_id", "weather_report", "commentaries", "attendance", "winning_odds_calculated", "formations", "scores", "time", "deleted", "localTeam", "visitorTeam", "substitutions", "goals", "cards", "other", "lineup", "bench", "stats", "comments", "tvstations", "highlights", "league", "season", "round", "stage", "events", "venue"})
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class Fixture {

	@JsonProperty("id")
	private Long id;
	@JsonProperty("league_id")
	private Long leagueId;
	@JsonProperty("season_id")
	private Long seasonId;
	@JsonProperty("stage_id")
	private Long stageId;
	@JsonProperty("round_id")
	private Long roundId;
	@JsonProperty("aggregate_id")
	private Long aggregateId;
	@JsonProperty("venue_id")
	private Long venueId;
	@JsonProperty("referee_id")
	private Long refereeId;
	@JsonProperty("localteam_id")
	private Long localteamId;
	@JsonProperty("visitorteam_id")
	private Long visitorteamId;
	@JsonProperty("weather_report")
	private WeatherReport weatherReport;
	@JsonProperty("commentaries")
	private Boolean commentaries;
	@JsonProperty("attendance")
	private Integer attendance;
	@JsonProperty("winning_odds_calculated")
	private Boolean winningOddsCalculated;
	@JsonProperty("formations")
	private FixtureFormations formations;
	@JsonProperty("scores")
	private FixtureScores scores;
	@JsonProperty("time")
	private FixtureTime time;
	@JsonProperty("deleted")
	private Boolean deleted;
	@JsonProperty("localTeam")
	private FixtureTeam localTeam;
	@JsonProperty("visitorTeam")
	private FixtureTeam visitorTeam;
	@JsonProperty("substitutions")
	private FixtureSubstitutions substitutions;
	@JsonProperty("goals")
	private FixtureGoals goals;
	@JsonProperty("cards")
	private FixtureCards cards;
	@JsonProperty("other")
	private FixtureOther other;
	@JsonProperty("lineup")
	private FixtureLineup lineup;
	@JsonProperty("bench")
	private FixtureBench bench;
	@JsonProperty("stats")
	private Stats stats;
	@JsonProperty("comments")
	private Commentaries comments;
	@JsonProperty("tvstations")
	private FixtureTvStations tvstations;
	@JsonProperty("highlights")
	private FixtureHighlights highlights;
	@JsonProperty("league")
	private FixtureLeague league;
	@JsonProperty("season")
	private FixtureSeason season;
	@JsonProperty("round")
	private FixtureRound round;
	@JsonProperty("stage")
	private FixtureStage stage;
	@JsonProperty("events")
	private FixtureEvents events;
	@JsonProperty("venue")
	private Venue venue;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("id")
	public Long getId() {
		return id;
	}

	@JsonProperty("id")
	public void setId(Long id) {
		this.id = id;
	}

	@JsonProperty("league_id")
	public Long getLeagueId() {
		return leagueId;
	}

	@JsonProperty("league_id")
	public void setLeagueId(Long leagueId) {
		this.leagueId = leagueId;
	}

	@JsonProperty("season_id")
	public Long getSeasonId() {
		return seasonId;
	}

	@JsonProperty("season_id")
	public void setSeasonId(Long seasonId) {
		this.seasonId = seasonId;
	}

	@JsonProperty("stage_id")
	public Long getStageId() {
		return stageId;
	}

	@JsonProperty("stage_id")
	public void setStageId(Long stageId) {
		this.stageId = stageId;
	}

	@JsonProperty("round_id")
	public Long getRoundId() {
		return roundId;
	}

	@JsonProperty("round_id")
	public void setRoundId(Long roundId) {
		this.roundId = roundId;
	}

	@JsonProperty("aggregate_id")
	public Long getAggregateId() {
		return aggregateId;
	}

	@JsonProperty("aggregate_id")
	public void setAggregateId(Long aggregateId) {
		this.aggregateId = aggregateId;
	}

	@JsonProperty("venue_id")
	public Long getVenueId() {
		return venueId;
	}

	@JsonProperty("venue_id")
	public void setVenueId(Long venueId) {
		this.venueId = venueId;
	}

	@JsonProperty("referee_id")
	public Long getRefereeId() {
		return refereeId;
	}

	@JsonProperty("referee_id")
	public void setRefereeId(Long refereeId) {
		this.refereeId = refereeId;
	}

	@JsonProperty("localteam_id")
	public Long getLocalteamId() {
		return localteamId;
	}

	@JsonProperty("localteam_id")
	public void setLocalteamId(Long localteamId) {
		this.localteamId = localteamId;
	}

	@JsonProperty("visitorteam_id")
	public Long getVisitorteamId() {
		return visitorteamId;
	}

	@JsonProperty("visitorteam_id")
	public void setVisitorteamId(Long visitorteamId) {
		this.visitorteamId = visitorteamId;
	}

	@JsonProperty("weather_report")
	public WeatherReport getWeatherReport() {
		return weatherReport;
	}

	@JsonProperty("weather_report")
	public void setWeatherReport(WeatherReport weatherReport) {
		this.weatherReport = weatherReport;
	}

	@JsonProperty("commentaries")
	public Boolean getCommentaries() {
		return commentaries;
	}

	@JsonProperty("commentaries")
	public void setCommentaries(Boolean commentaries) {
		this.commentaries = commentaries;
	}

	@JsonProperty("attendance")
	public Integer getAttendance() {
		return attendance;
	}

	@JsonProperty("attendance")
	public void setAttendance(Integer attendance) {
		this.attendance = attendance;
	}

	@JsonProperty("winning_odds_calculated")
	public Boolean getWinningOddsCalculated() {
		return winningOddsCalculated;
	}

	@JsonProperty("winning_odds_calculated")
	public void setWinningOddsCalculated(Boolean winningOddsCalculated) {
		this.winningOddsCalculated = winningOddsCalculated;
	}

	@JsonProperty("formations")
	public FixtureFormations getFormations() {
		return formations;
	}

	@JsonProperty("formations")
	public void setFormations(FixtureFormations formations) {
		this.formations = formations;
	}

	@JsonProperty("scores")
	public FixtureScores getScores() {
		return scores;
	}

	@JsonProperty("scores")
	public void setScores(FixtureScores scores) {
		this.scores = scores;
	}

	@JsonProperty("time")
	public FixtureTime getTime() {
		return time;
	}

	@JsonProperty("time")
	public void setTime(FixtureTime time) {
		this.time = time;
	}

	@JsonProperty("deleted")
	public Boolean getDeleted() {
		return deleted;
	}

	@JsonProperty("deleted")
	public void setDeleted(Boolean deleted) {
		this.deleted = deleted;
	}

	@JsonProperty("localTeam")
	public FixtureTeam getLocalTeam() {
		return localTeam;
	}

	@JsonProperty("localTeam")
	public void setLocalTeam(FixtureTeam localTeam) {
		this.localTeam = localTeam;
	}

	@JsonProperty("visitorTeam")
	public FixtureTeam getVisitorTeam() {
		return visitorTeam;
	}

	@JsonProperty("visitorTeam")
	public void setVisitorTeam(FixtureTeam visitorTeam) {
		this.visitorTeam = visitorTeam;
	}

	@JsonProperty("substitutions")
	public FixtureSubstitutions getSubstitutions() {
		return substitutions;
	}

	@JsonProperty("substitutions")
	public void setSubstitutions(FixtureSubstitutions substitutions) {
		this.substitutions = substitutions;
	}

	@JsonProperty("goals")
	public FixtureGoals getGoals() {
		return goals;
	}

	@JsonProperty("goals")
	public void setGoals(FixtureGoals goals) {
		this.goals = goals;
	}

	@JsonProperty("cards")
	public FixtureCards getCards() {
		return cards;
	}

	@JsonProperty("cards")
	public void setCards(FixtureCards cards) {
		this.cards = cards;
	}

	@JsonProperty("other")
	public FixtureOther getOther() {
		return other;
	}

	@JsonProperty("other")
	public void setOther(FixtureOther other) {
		this.other = other;
	}

	@JsonProperty("lineup")
	public FixtureLineup getLineup() {
		return lineup;
	}

	@JsonProperty("lineup")
	public void setLineup(FixtureLineup lineup) {
		this.lineup = lineup;
	}

	@JsonProperty("bench")
	public FixtureBench getBench() {
		return bench;
	}

	@JsonProperty("bench")
	public void setBench(FixtureBench bench) {
		this.bench = bench;
	}

	@JsonProperty("stats")
	public Stats getStats() {
		return stats;
	}

	@JsonProperty("stats")
	public void setStats(Stats stats) {
		this.stats = stats;
	}

	@JsonProperty("comments")
	public Commentaries getComments() {
		return comments;
	}

	@JsonProperty("comments")
	public void setComments(Commentaries comments) {
		this.comments = comments;
	}

	@JsonProperty("tvstations")
	public FixtureTvStations getTvstations() {
		return tvstations;
	}

	@JsonProperty("tvstations")
	public void setTvstations(FixtureTvStations tvstations) {
		this.tvstations = tvstations;
	}

	@JsonProperty("highlights")
	public FixtureHighlights getHighlights() {
		return highlights;
	}

	@JsonProperty("highlights")
	public void setHighlights(FixtureHighlights highlights) {
		this.highlights = highlights;
	}

	@JsonProperty("league")
	public FixtureLeague getLeague() {
		return league;
	}

	@JsonProperty("league")
	public void setLeague(FixtureLeague league) {
		this.league = league;
	}

	@JsonProperty("season")
	public FixtureSeason getSeason() {
		return season;
	}

	@JsonProperty("season")
	public void setSeason(FixtureSeason season) {
		this.season = season;
	}

	@JsonProperty("round")
	public FixtureRound getRound() {
		return round;
	}

	@JsonProperty("round")
	public void setRound(FixtureRound round) {
		this.round = round;
	}

	@JsonProperty("stage")
	public FixtureStage getStage() {
		return stage;
	}

	@JsonProperty("stage")
	public void setStage(FixtureStage stage) {
		this.stage = stage;
	}

	@JsonProperty("events")
	public FixtureEvents getEvents() {
		return events;
	}

	@JsonProperty("events")
	public void setEvents(FixtureEvents events) {
		this.events = events;
	}

	@JsonProperty("venue")
	public Venue getVenue() {
		return venue;
	}

	@JsonProperty("venue")
	public void setVenue(Venue venue) {
		this.venue = venue;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}



	// please don't watch this method :'(
	/*@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}

		Fixture fixture = (Fixture) o;

		// id
		if (this.getId().compareTo(fixture.getId()) != 0) {
			return false;
		}
		// leagueId
		if (this.getLeagueId().compareTo(fixture.getLeagueId()) != 0) {
			return false;
		}
		// seasonId
		if (this.getSeasonId().compareTo(fixture.getSeasonId()) != 0) {
			return false;
		}
		// localTeamId
		if (this.getLocalteamId().compareTo(fixture.getLocalteamId()) != 0) {
			return false;
		}
		// visitorTeamId
		if (this.getVisitorteamId().compareTo(fixture.getVisitorteamId()) != 0) {
			return false;
		}
		// roundId
		if (this.getRoundId().compareTo(fixture.getRoundId()) != 0) {
			return false;
		}
		// scores
		if (this.getScores() != null) {
			if (fixture.getScores() == null) {
				return false;
			} else {
				if (this.getScores().getLocalTeamScore() != null) {
					if (fixture.getScores().getLocalTeamScore() == null) {
						return false;
					}
					if (this.getScores().getLocalTeamScore().compareTo(fixture.getScores().getLocalTeamScore()) != 0) {
						return false;
					}
					if (this.getScores().getVisitorTeamScore()
							.compareTo(fixture.getScores().getVisitorTeamScore()) != 0) {
						return false;
					}
				} else {
					if (fixture.getScores().getLocalTeamScore() != null) {
						return false;
					}
				}
			}
		} else {
			if (fixture.getScores() != null) {
				return false;
			}
		}
		// time
		if (this.getTime() != null) {
			if (fixture.getTime() == null) {
				return false;
			} else {
				if (this.getTime().getStatus() != null) {
					if (fixture.getTime().getStatus() == null) {
						return false;
					}
					if (!this.getTime().getStatus().equals(fixture.getTime().getStatus())) {
						return false;
					}
				} else {
					if (fixture.getTime().getStatus() != null) {
						return false;
					}
				}
				if (this.getTime().getMinute() != null) {
					if (fixture.getTime().getMinute() == null) {
						return false;
					}
					if (this.getTime().getMinute().compareTo(fixture.getTime().getMinute()) != 0) {
						return false;
					}
				} else {
					if (fixture.getTime().getMinute() != null) {
						return false;
					}
				}
				if (this.getTime().getExtraMinute() != null) {
					if (fixture.getTime().getExtraMinute() == null) {
						return false;
					}
					if (this.getTime().getExtraMinute().compareTo(fixture.getTime().getExtraMinute()) != 0) {
						return false;
					}
				} else {
					if (fixture.getTime().getExtraMinute() != null) {
						return false;
					}
				}
				if (this.getTime().getStartingAt() != null) {
					if (fixture.getTime().getStartingAt() == null) {
						return false;
					}
					if (!this.getTime().getStartingAt().getDate().equals(fixture.getTime().getStartingAt().getDate())) {
						return false;
					}
					if (!this.getTime().getStartingAt().getTime().equals(fixture.getTime().getStartingAt().getTime())) {
						return false;
					}
				} else {
					if (fixture.getTime().getStartingAt() != null) {
						return false;
					}
				}
			}
		} else {
			if (fixture.getTime() != null) {
				return false;
			}
		}
		// local team
		if (this.getLocalTeam() != null) {
			if (fixture.getLocalTeam() == null) {
				return false;
			} else {
				if (this.getLocalTeam().getData() != null) {
					if (fixture.getLocalTeam().getData() == null) {
						return false;
					}
					if (this.getLocalTeam().getData().getId()
							.compareTo(fixture.getLocalTeam().getData().getId()) != 0) {
						return false;
					}
					if (!this.getLocalTeam().getData().getName().equals(fixture.getLocalTeam().getData().getName())) {
						return false;
					}
					if (this.getLocalTeam().getData().getCountryId()
							.compareTo(fixture.getLocalTeam().getData().getCountryId()) != 0) {
						return false;
					}
					if (!this.getLocalTeam().getData().getLogoPath()
							.equals(fixture.getLocalTeam().getData().getLogoPath())) {
						return false;
					}
				} else {
					if (fixture.getLocalTeam().getData() != null) {
						return false;
					}
				}
			}
		} else {
			if (fixture.getLocalTeam() != null) {
				return false;
			}
		}
		// away team
		if (this.getVisitorTeam() != null) {
			if (fixture.getVisitorTeam() == null) {
				return false;
			} else {
				if (this.getVisitorTeam().getData() != null) {
					if (fixture.getVisitorTeam().getData() == null) {
						return false;
					}
					if (this.getVisitorTeam().getData().getId()
							.compareTo(fixture.getVisitorTeam().getData().getId()) != 0) {
						return false;
					}
					if (!this.getVisitorTeam().getData().getName()
							.equals(fixture.getVisitorTeam().getData().getName())) {
						return false;
					}
					if (this.getVisitorTeam().getData().getCountryId()
							.compareTo(fixture.getVisitorTeam().getData().getCountryId()) != 0) {
						return false;
					}
					if (!this.getVisitorTeam().getData().getLogoPath()
							.equals(fixture.getVisitorTeam().getData().getLogoPath())) {
						return false;
					}
				} else {
					if (fixture.getVisitorTeam().getData() != null) {
						return false;
					}
				}
			}
		} else {
			if (fixture.getVisitorTeam() != null) {
				return false;
			}
		}
		// events
		if (this.getEvents() != null) {
			if (fixture.getEvents() == null) {
				return false;
			} else {
				if (this.getEvents().getData() != null) {
					if (fixture.getEvents().getData() == null) {
						return false;
					} else {
						if (this.getEvents().getData().size() != fixture.getEvents().getData().size()) {
							return false;
						} else {
							List<FixtureEvent> thisFixtureEvents = this.getEvents().getData();
							List<FixtureEvent> otherFixtureEvents = fixture.getEvents().getData();
							for (int i = 0; i < this.getEvents().getData().size(); i++) {
								if (thisFixtureEvents.get(i).getId()
										.compareTo(otherFixtureEvents.get(i).getId()) != 0) {
									return false;
								}
								if (thisFixtureEvents.get(i).getTeamId() != null) {
									if (otherFixtureEvents.get(i).getTeamId() == null) {
										return false;
									}
									if (!thisFixtureEvents.get(i).getTeamId()
											.equals(otherFixtureEvents.get(i).getTeamId())) {
										return false;
									}
								} else {
									if (otherFixtureEvents.get(i).getTeamId() != null) {
										return false;
									}
								}
								if (thisFixtureEvents.get(i).getMinute() != null) {
									if (otherFixtureEvents.get(i).getMinute() == null) {
										return false;
									}
									if (thisFixtureEvents.get(i).getMinute()
											.compareTo(otherFixtureEvents.get(i).getMinute()) != 0) {
										return false;
									}
								} else {
									if (otherFixtureEvents.get(i).getMinute() != null) {
										return false;
									}
								}
								if (thisFixtureEvents.get(i).getExtraMinute() != null) {
									if (otherFixtureEvents.get(i).getExtraMinute() == null) {
										return false;
									}
									if (thisFixtureEvents.get(i).getExtraMinute()
											.compareTo(otherFixtureEvents.get(i).getExtraMinute()) != 0) {
										return false;
									}
								} else {
									if (otherFixtureEvents.get(i).getExtraMinute() != null) {
										return false;
									}
								}
								if (thisFixtureEvents.get(i).getPlayerId() != null) {
									if (otherFixtureEvents.get(i).getPlayerId() == null) {
										return false;
									}
									if (thisFixtureEvents.get(i).getPlayerId()
											.compareTo(otherFixtureEvents.get(i).getPlayerId()) != 0) {
										return false;
									}
								} else {
									if (otherFixtureEvents.get(i).getPlayerId() != null) {
										return false;
									}
								}
								if (thisFixtureEvents.get(i).getPlayerName() != null) {
									if (otherFixtureEvents.get(i).getPlayerName() == null) {
										return false;
									}
									if (!thisFixtureEvents.get(i).getPlayerName()
											.equals(otherFixtureEvents.get(i).getPlayerName())) {
										return false;
									}
								}
								if (thisFixtureEvents.get(i).getType() != null) {
									if (otherFixtureEvents.get(i).getType() == null) {
										return false;
									}
									if (!thisFixtureEvents.get(i).getType()
											.equals(otherFixtureEvents.get(i).getType())) {
										return false;
									}
								}
							}
						}
					}
				} else {
					if (fixture.getEvents().getData() != null) {
						return false;
					}
				}
			}
		} else {
			if (fixture.getEvents() != null) {
				return false;
			}
		}
		// stats
		if (this.getStats() != null) {
			if (fixture.getStats() == null) {
				return false;
			} else {
				if (this.getStats().getAdditionalProperties() != null) {
					if (fixture.getStats().getAdditionalProperties() == null) {
						return false;
					} else {
						if (this.getStats().getAdditionalProperties().get("data") != null) {
							if (fixture.getStats().getAdditionalProperties().get("data") == null) {
								return false;
							} else {
								List<Map<String, Object>> thisFixtureStats = (List<Map<String, Object>>) this.getStats()
										.getAdditionalProperties().get("data");
								List<Map<String, Object>> otherFixtureStats = (List<Map<String, Object>>) fixture
										.getStats().getAdditionalProperties().get("data");
								if (thisFixtureStats.size() != otherFixtureStats.size()) {
									return false;
								} else {
									for (int i = 0; i < thisFixtureStats.size(); i++) {
										if (thisFixtureStats.get(i).get("team_id") != otherFixtureStats.get(i)
												.get("team_id")) {
											return false;
										}

										if (thisFixtureStats.get(i).get("shots") != null) {
											if (otherFixtureStats.get(i).get("shots") == null) {
												return false;
											} else {
												Map<String, Object> thisShots = (Map<String, Object>) thisFixtureStats
														.get(i).get("shots");
												Map<String, Object> otherShots = (Map<String, Object>) otherFixtureStats
														.get(i).get("shots");
												if (thisShots != null) {
													if (otherShots == null) {
														return false;
													}
													if (thisShots.get("total") != otherShots.get("total")) {
														return false;
													}
													if (thisShots.get("insidebox") != otherShots.get("insidebox")) {
														return false;
													}
												} else {
													if (otherShots != null) {
														return false;
													}
												}
											}
										} else {
											if (otherFixtureStats.get(i).get("shots") != null) {
												return false;
											}
										}

										if (thisFixtureStats.get(i).get("possessiontime") != otherFixtureStats.get(i)
												.get("possessiontime")) {
											return false;
										}
										if (thisFixtureStats.get(i).get("fouls") != otherFixtureStats.get(i)
												.get("fouls")) {
											return false;
										}
										if (thisFixtureStats.get(i).get("yellowcards") != otherFixtureStats.get(i)
												.get("yellowcards")) {
											return false;
										}
										if (thisFixtureStats.get(i).get("redcards") != otherFixtureStats.get(i)
												.get("redcards")) {
											return false;
										}
										if (thisFixtureStats.get(i).get("offsides") != otherFixtureStats.get(i)
												.get("offsides")) {
											return false;
										}
										if (thisFixtureStats.get(i).get("corners") != otherFixtureStats.get(i)
												.get("corners")) {
											return false;
										}
									}
								}
							}
						} else {
							if (fixture.getStats().getAdditionalProperties().get("data") != null) {
								return false;
							}
						}
					}
				} else {
					if (fixture.getStats().getAdditionalProperties() != null) {
						return false;
					}
				}
			}
		} else {
			if (fixture.getStats() != null) {
				return false;
			}
		}

		return true;
	}

*/

/*
	@Override
	public int hashCode() {
		int result = id != null ? id.hashCode() : 0;
		result = 31 * result + (leagueId != null ? leagueId.hashCode() : 0);
		result = 31 * result + (seasonId != null ? seasonId.hashCode() : 0);
		result = 31 * result + (stageId != null ? stageId.hashCode() : 0);
		result = 31 * result + (roundId != null ? roundId.hashCode() : 0);
		result = 31 * result + (aggregateId != null ? aggregateId.hashCode() : 0);
		result = 31 * result + (venueId != null ? venueId.hashCode() : 0);
		result = 31 * result + (refereeId != null ? refereeId.hashCode() : 0);
		result = 31 * result + (localteamId != null ? localteamId.hashCode() : 0);
		result = 31 * result + (visitorteamId != null ? visitorteamId.hashCode() : 0);
		result = 31 * result + (weatherReport != null ? weatherReport.hashCode() : 0);
		result = 31 * result + (commentaries != null ? commentaries.hashCode() : 0);
		result = 31 * result + (attendance != null ? attendance.hashCode() : 0);
		result = 31 * result + (winningOddsCalculated != null ? winningOddsCalculated.hashCode() : 0);
		result = 31 * result + (formations != null ? formations.hashCode() : 0);
		result = 31 * result + (scores != null ? scores.hashCode() : 0);
		result = 31 * result + (time != null ? time.hashCode() : 0);
		result = 31 * result + (deleted != null ? deleted.hashCode() : 0);
		result = 31 * result + (localTeam != null ? localTeam.hashCode() : 0);
		result = 31 * result + (visitorTeam != null ? visitorTeam.hashCode() : 0);
		result = 31 * result + (substitutions != null ? substitutions.hashCode() : 0);
		result = 31 * result + (goals != null ? goals.hashCode() : 0);
		result = 31 * result + (cards != null ? cards.hashCode() : 0);
		result = 31 * result + (other != null ? other.hashCode() : 0);
		result = 31 * result + (lineup != null ? lineup.hashCode() : 0);
		result = 31 * result + (bench != null ? bench.hashCode() : 0);
		result = 31 * result + (stats != null ? stats.hashCode() : 0);
		result = 31 * result + (comments != null ? comments.hashCode() : 0);
		result = 31 * result + (tvstations != null ? tvstations.hashCode() : 0);
		result = 31 * result + (highlights != null ? highlights.hashCode() : 0);
		result = 31 * result + (league != null ? league.hashCode() : 0);
		result = 31 * result + (season != null ? season.hashCode() : 0);
		result = 31 * result + (round != null ? round.hashCode() : 0);
		result = 31 * result + (stage != null ? stage.hashCode() : 0);
		result = 31 * result + (events != null ? events.hashCode() : 0);
		result = 31 * result + (venue != null ? venue.hashCode() : 0);
		result = 31 * result + (additionalProperties != null ? additionalProperties.hashCode() : 0);
		return result;
	}

*/

}