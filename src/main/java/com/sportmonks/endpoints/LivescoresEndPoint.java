package com.sportmonks.endpoints;

import com.mashape.unirest.http.HttpResponse;
import com.sportmonks.data.entity.Fixture;
import com.sportmonks.data.structure.Livescores;
import com.sportmonks.exceptions.NotFoundException;
import com.sportmonks.tools.RestTool;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Proxy Fixtures
 */
public class LivescoresEndPoint extends AbstractEndPoint {

	private static final String BASE_URL = AbstractEndPoint.API_URL + AbstractEndPoint.VERSION + "/livescores";
	private static final String BASE_URL_BY_LEAGUES = AbstractEndPoint.API_URL + AbstractEndPoint.VERSION
			+ "/livescores?leagues={leagues}";
	private static final String CURRENTLY_PLAYED_URL = BASE_URL + "/now";

	private static LivescoresEndPoint INSTANCE;
	private long lastLivescoreProxyCall = 0;

	private LivescoresEndPoint(final Double hourRateLimit) {
		super(hourRateLimit);
	}

	/**
	 * Creation d'une instance avec une limite d'appel par heure personnalisée
	 *
	 * @param customHourRateLimit : APIClient.FREE_PLAN_RATE_LIMIT, APIClient.CLASSIC_PLAN_RATE_LIMIT
	 *
	 * @return
	 */
	public static LivescoresEndPoint getInstance(final Double customHourRateLimit) {
		if (INSTANCE == null) {
			INSTANCE = new LivescoresEndPoint(customHourRateLimit);
		}

		return INSTANCE;
	}

	/**
	 * @param url
	 * @param params
	 * @return {@link Fixture}
	 */
	private Fixture findOne(final String url, final LivescoresEndPointParams params) {

		lastLivescoreProxyCall = waitBeforeNextCall(lastLivescoreProxyCall);

		final Map<String, String> paramsMap = new HashMap<>();
		if (params != null) {
			paramsMap.put("includes", params.getRelations());
			if (params.getLeagueIdList() != null && !params.getLeagueIdList().isEmpty()) {
				paramsMap.put("leagues", StringUtils.join(params.getLeagueIdList(), ","));
			}
		}

		final HttpResponse<Fixture> httpResponse = RestTool.get(url, paramsMap, Fixture.class);
		try {
			return httpResponse.getBody();
		} catch (Exception e) {
			return null;
		}
	}

	/**
	 * @param url
	 * @param params
	 * @return {@linkList<{@link Fixture}>}
	 */
	private List<Fixture> find(final String url, final LivescoresEndPointParams params) {

		lastLivescoreProxyCall = waitBeforeNextCall(lastLivescoreProxyCall);

		final Map<String, String> paramsMap = new HashMap<>();
		if (params != null) {
			paramsMap.put("includes", params.getRelations());
			if (params.getLeagueIdList() != null && !params.getLeagueIdList().isEmpty()) {
				paramsMap.put("leagues", StringUtils.join(params.getLeagueIdList(), ","));
			}
		}

		final HttpResponse<Livescores> httpResponse = RestTool.get(url, paramsMap, Livescores.class);
		try {
			return httpResponse.getBody().getData();
		} catch (Exception e) {
			return new ArrayList<>();
		}

	}

	/**
	 * @return
	 * @throws NotFoundException
	 */
	public List<Fixture> findToday() throws NotFoundException {
		final LivescoresEndPointParams params = new LivescoresEndPointParams();
		return find(BASE_URL, params);
	}

	/**
	 * @param
	 * @return
	 * @throws NotFoundException
	 */
	public List<Fixture> findCurrentlyPlayed() {
		final LivescoresEndPointParams params = new LivescoresEndPointParams();
		return findCurrentlyPlayed(params);
	}

	/**
	 *
	 * @param params
	 * @return
	 */
	public List<Fixture> findCurrentlyPlayed(final LivescoresEndPointParams params) {
		return find(CURRENTLY_PLAYED_URL, params);
	}

	public List<Fixture> findToday(final LivescoresEndPointParams params) {
		return find(BASE_URL, params);
	}

	public List<Fixture> findTodayByLeagues(final LivescoresEndPointParams params) {
		return find(BASE_URL_BY_LEAGUES, params);
	}

	/**
	 * Fixturees relations
	 */
	public enum Relation {
		localTeam, visitorTeam, substitutions, goals, cards, other, lineup, bench, stats, comments, tvstations, highlights, league, season, round, stage, referee, events, venue
	}

}
