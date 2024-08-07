package com.prateekb.footbalApp.service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.prateekb.footbalApp.config.enums.Action;
import com.prateekb.footbalApp.config.enums.ApiRequest;
import com.prateekb.footbalApp.config.utils.FootBalAppConfigUtil;
import com.prateekb.footbalApp.exception.ApplicationException;
import com.prateekb.footbalApp.models.api.Country;
import com.prateekb.footbalApp.models.api.League;
import com.prateekb.footbalApp.models.api.Standings;
import com.prateekb.footbalApp.models.api.Team;
import com.prateekb.footbalApp.models.response.CountryResponse;
import com.prateekb.footbalApp.models.response.LeagueResponse;
import com.prateekb.footbalApp.models.response.StandingResponse;
import com.prateekb.footbalApp.models.response.TeamResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class FootBalAppService {
    @Autowired
    HttpConnector connector;
    @Autowired
    FootBalAppConfigUtil configUtil;
    @Autowired
    ObjectMapper objectMapper;

    public CountryResponse getAllCountries() throws ApplicationException {
        CountryResponse countryResponse = null;
        try {
            ApiRequest request = ApiRequest.COUNTRIES;
            List<String> params = Arrays.asList(Action.COUNTRY.getActionValue());
            String response = connector.sendGet(request, params);
            List<Country> countries =
                    objectMapper.readValue(response, new TypeReference<List<Country>>() {
                    });
            countryResponse = configUtil.adaptCountryResponse(countries);
        } catch (Exception ex) {
            throw new ApplicationException("Country Response Not Available","BAD_REQUEST",400);
        }
        return countryResponse;
    }

    public LeagueResponse getLeaguesForCountry(Integer countryId) throws ApplicationException {
        LeagueResponse leagueResponse = null;
        try {
            ApiRequest request = ApiRequest.LEAGUES;
            List<String> params = Arrays.asList(Action.LEAGUE.getActionValue(), String.valueOf(countryId));
            String response = connector.sendGet(request, params);
            List<League> leagues =
                    objectMapper.readValue(response, new TypeReference<List<League>>() {
                    });
            leagueResponse = configUtil.adaptLeagueResponse(leagues);
        } catch (Exception ex) {
            throw new ApplicationException("Leagues Response Not Available","BAD_REQUEST",400);
        }
        return leagueResponse;
    }

    public TeamResponse getTeamsForLeague(Integer countryId, Integer leagueId) throws ApplicationException {
        TeamResponse teamResponse = null;
        try {
            ApiRequest request = ApiRequest.TEAMS;
            List<String> params = Arrays.asList(Action.TEAMS.getActionValue(), String.valueOf(leagueId));
            String response = connector.sendGet(request, params);
            List<Team> teams =
                    objectMapper.readValue(response, new TypeReference<List<Team>>() {
                    });
            teamResponse = configUtil.adaptTeamResponse(teams, countryId, leagueId);
        } catch (Exception ex) {
            throw new ApplicationException("Teams Response Not Available","BAD_REQUEST",400);
        }
        return teamResponse;
    }

    public StandingResponse getStandingForTeam(Integer leagueId, Integer teamId) throws ApplicationException {
        StandingResponse standingResponse = null;
        try {
            ApiRequest request = ApiRequest.STANDINGS;
            List<String> params = Arrays.asList(Action.STANDINGS.getActionValue(), String.valueOf(leagueId));
            String response = connector.sendGet(request, params);
            List<Standings> standings =
                    objectMapper.readValue(response, new TypeReference<List<Standings>>() {
                    });
            standingResponse = configUtil.adaptStandingResponse(standings, leagueId, teamId);
        } catch (Exception ex) {
            throw new ApplicationException("Standings Response Not Available","BAD_REQUEST",400);
        }
        return standingResponse;
    }
}
