package com.sportmonks.endpoints;

import org.apache.commons.lang3.StringUtils;

import java.util.HashSet;
import java.util.Set;

public class RoundsEndPointParams extends AbstractEndPointParams {

	private Long seasonId;
	private Set<String> relations = new HashSet<>();

	/**
	 * @return
	 */
	public Long getSeasonId() {
		return seasonId;
	}

	/**
	 * @param seasonId
	 */
	public void setSeasonId(Long seasonId) {
		this.seasonId = seasonId;
	}

	/**
	 * @param relation
	 */
	public void addRelation(final RoundsEndPoint.Relation relation) {
		relations.add(relation.toString());
	}

	/**
	 * @return
	 */
	public String getRelations() {
		return StringUtils.join(relations, ",");
	}

	/**
	 * @return
	 */
	public boolean isValidSeasonId() {
		return seasonId != null && seasonId > 0;
	}

}
