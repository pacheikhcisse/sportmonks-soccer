package com.sportmonks.endpoints;


import com.mashape.unirest.http.HttpResponse;
import com.sportmonks.data.entity.Round;
import com.sportmonks.data.structure.Rounds;
import com.sportmonks.exceptions.HaveToDefineValidIdException;
import com.sportmonks.tools.RestTool;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RoundsEndPoint extends AbstractEndPoint {

	private static final String BASE_URL = AbstractEndPoint.API_URL + AbstractEndPoint.VERSION + "/rounds";
	private static final String BY_SEASON_URL = BASE_URL + "/season/{seasonId}";

	private static RoundsEndPoint INSTANCE;
	private long lastTeamProxyCall = 0;


	public RoundsEndPoint(Double hourRateLimit) {
		super(hourRateLimit);
	}

	public static RoundsEndPoint getInstance(final Double customHourRateLimit) {
		if (INSTANCE == null) {
			INSTANCE = new RoundsEndPoint(customHourRateLimit);
		}

		return INSTANCE;
	}

	/**
	 * Liste de toutes les journées d'une saison
	 *
	 * @param seasonId
	 * @return
	 */
	public List<Round> findBySeason(final Long seasonId) {
		final RoundsEndPointParams params = new RoundsEndPointParams();
		params.setSeasonId(seasonId);
		return findBySeason(params);
	}

	/**
	 * Liste de toutes les journées pour une saison avec les relations définies
	 */
	public List<Round> findBySeason(final RoundsEndPointParams params) {

		if (!params.isValidSeasonId()) {
			throw new HaveToDefineValidIdException();
		}

		return findResults(BY_SEASON_URL, params);
	}

	/**
	 * Retourne une liste de résultat
	 *
	 * @param url
	 * @param params
	 * @return
	 */
	private List<Round> findResults(final String url, final RoundsEndPointParams params) {

		lastTeamProxyCall = waitBeforeNextCall(lastTeamProxyCall);

		final Map<String, String> paramsMap = new HashMap<>();
		if (params != null) {
			paramsMap.put("includes", params.getRelations());
			if (params.isValidSeasonId()) {
				paramsMap.put("seasonId", params.getSeasonId().toString());
			}
		}

		final HttpResponse<Rounds> httpResponse = RestTool.get(url, paramsMap, Rounds.class);

		final List<Round> response = new ArrayList<>();
		if (httpResponse != null) {
			Rounds body = httpResponse.getBody();
			if (body != null) {
				List<Round> data = body.getData();
				if (data != null) {
					response.addAll(data);
				}
			}
		}
		return response;
	}

	/**
	 * Round relations
	 */
	public enum Relation {
		fixtures, season, league
	}

}
