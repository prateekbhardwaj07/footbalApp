package com.prateekb.footbalApp.config.utils;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.prateekb.footbalApp.models.api.Country;
import com.prateekb.footbalApp.models.api.League;
import com.prateekb.footbalApp.models.api.Standings;
import com.prateekb.footbalApp.models.api.Team;
import com.prateekb.footbalApp.models.response.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Configuration
public class FootBalAppConfigUtil {

    @Bean
    @Primary
    public ObjectMapper objectMapper(){
       ObjectMapper objectMapper = new ObjectMapper();
       objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
       return objectMapper;
    }


    public CountryResponse adaptCountryResponse(List<Country> countries){
        CountryResponse countryResponse = null;
        try {
            List<CountryDetails> details = new ArrayList<>();
            countries.stream().forEach(country -> {
                details.add(CountryDetails.builder()
                        .countryId(Integer.parseInt(country.getCountryId()))
                        .name(country.getCountryName())
                        .leagueURI("/footbal/get-league/"+country.getCountryId())
                        .build());
            });
            countryResponse = CountryResponse.builder().details(details).build();
        }
        catch(Exception ex){

        }
        return countryResponse;
    }

    public LeagueResponse adaptLeagueResponse(List<League> leagues){
        LeagueResponse leagueResponse = null;
        try {
            List<LeagueDetails> details = new ArrayList<>();
            leagues.stream().forEach(league -> {
                details.add(LeagueDetails.builder()
                                .leagueId(Integer.parseInt(league.getLeagueId()))
                                .countryId(Integer.parseInt(league.getCountryId()))
                                .countryName(league.getCountryName())
                                .leagueName(league.getLeagueName())
                                .teamsURI("/footbal/get-teams/"+league.getCountryId() +"/" + league.getLeagueId())
                        .build());
            });
            leagueResponse = LeagueResponse.builder().details(details).build();
        }
        catch(Exception ex){

        }
        return leagueResponse;
    }

    public TeamResponse adaptTeamResponse(List<Team> teams, Integer countryId, Integer leagueId){
        TeamResponse teamResponse = null;
        try {
            List<TeamDetails> details = new ArrayList<>();
            teams.stream().forEach(team -> {
                details.add(TeamDetails.builder()
                                .teamId(Integer.parseInt(team.getTeamKey()))
                                .teamName(team.getTeamName())
                                .leagueId(leagueId)
                                .countryId(countryId)
                                .countryName(team.getTeamCountry())
                                .standingURI("/footbal/get-standings/"+ leagueId +"/" +team.getTeamKey())
                        .build());
            });
            teamResponse = TeamResponse.builder().details(details).build();
        }
        catch(Exception ex){

        }
        return teamResponse;
    }

    public StandingResponse adaptStandingResponse(List<Standings> standings, Integer leagueId, Integer teamId){
        StandingResponse standingResponse = null;
        try {
            Predicate<Standings> leaguePredicate = (teamStandings) ->
                    teamStandings.getLeagueId().equalsIgnoreCase(leagueId+"");
            Predicate<Standings> teamPredicate = (teamStandings) ->
                    teamStandings.getTeamId().equalsIgnoreCase(teamId+"");
            Standings teamStanding =
                        standings.parallelStream().filter(leaguePredicate.and(teamPredicate)).findFirst().get();
            standingResponse = StandingResponse.builder()
                    .teamId(Integer.parseInt(teamStanding.getTeamId()))
                    .teamName(teamStanding.getTeamName())
                    .leagueName(teamStanding.getLeagueName())
                    .leaguePosition(Integer.parseInt(teamStanding.getOverallLeaguePosition()))
                    .homePosition(Integer.parseInt(teamStanding.getHomeLeaguePosition()))
                    .awayPosition(Integer.parseInt(teamStanding.getAwayLeaguePosition()))
                    .build();
        }
        catch(Exception ex){

        }
        return standingResponse;
    }





    // singleton instance of ObjectMapper
    private static class ObjectMapperFactory {
        private static volatile ObjectMapper INSTANCE = null;
        private ObjectMapperFactory(){}
        public ObjectMapper getInstance(){
            if(INSTANCE == null) {
                synchronized (ObjectMapperFactory.class) {
                    if (INSTANCE == null) {
                        INSTANCE = new ObjectMapper();
                    }
                }
            }
            return INSTANCE;
        }
    }


}
