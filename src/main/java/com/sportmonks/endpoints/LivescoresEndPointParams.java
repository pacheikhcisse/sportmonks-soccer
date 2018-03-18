package com.sportmonks.endpoints;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.commons.lang3.StringUtils;

/**
 * Created by kevin on 21/05/2016.
 */
public class LivescoresEndPointParams extends AbstractEndPointParams {
	private final Set<String> relations = new HashSet<>();
	private List<String> leagueIdList;


	/**
	 * @param relation
	 */
	public void addRelation(final LivescoresEndPoint.Relation relation) {
		relations.add(relation.toString());
	}

	/**
	 * @return
	 */
	public String getRelations() {
		return StringUtils.join(relations, ",");
	}

	public List<String> getLeagueIdList() {
		return leagueIdList;
	}

	public void setLeagueIdList(List<String> leagueIdList) {
		this.leagueIdList = leagueIdList;
	}
}
