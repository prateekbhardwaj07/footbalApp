package com.prateekb.footbalApp.controller;

import com.prateekb.footbalApp.exception.ApplicationException;
import com.prateekb.footbalApp.models.response.CountryResponse;
import com.prateekb.footbalApp.models.response.LeagueResponse;
import com.prateekb.footbalApp.models.response.StandingResponse;
import com.prateekb.footbalApp.models.response.TeamResponse;
import com.prateekb.footbalApp.service.FileService;
import com.prateekb.footbalApp.service.FootBalAppService;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
@RequestMapping(value = "/footbal")
public class FootbalAppController {

    @Autowired
    FootBalAppService service;
    @Autowired
    FileService fileService;


    @GetMapping(value = "/get-country")
    @CircuitBreaker(name = "footbalCB", fallbackMethod = "getAllAvailableCountry")
    public ResponseEntity<CountryResponse> getAllCountries() {
        CountryResponse response = service.getAllCountries();
        return ResponseEntity.status(200).body(response);
    }

    @GetMapping(value = "/get-league/{country}")
    @CircuitBreaker(name = "footbalCB", fallbackMethod = "getAllAvailableLeague")
    public ResponseEntity<LeagueResponse> getLeague(@PathVariable("country") Integer country) {
        LeagueResponse response = service.getLeaguesForCountry(country);
        return ResponseEntity.status(200).body(response);
    }

    @GetMapping(value = "/get-teams/{country}/{league}")
    @CircuitBreaker(name = "footbalCB", fallbackMethod = "getAllAvailableTeams")
    public ResponseEntity<TeamResponse> getTeams(@PathVariable("country") Integer country,
                                                 @PathVariable("league") Integer league) {
        TeamResponse response = service.getTeamsForLeague(country, league);
        return ResponseEntity.status(200).body(response);
    }

    @GetMapping(value = "/get-standings/{league}/{team}")
    @CircuitBreaker(name = "footbalCB", fallbackMethod = "getAllAvailableStandings")
    public ResponseEntity<StandingResponse> getStandings(@PathVariable("league") Integer league,
                                                         @PathVariable("team") Integer team) {
        StandingResponse response = service.getStandingForTeam(league, team);
        return ResponseEntity.status(200).body(response);
    }

    public ResponseEntity<CountryResponse> getAllAvailableCountry(Exception ex) {
        CountryResponse response = fileService.getModelResponse("countries.json", CountryResponse.class);
        return ResponseEntity.ok(response);
    }

    public ResponseEntity<LeagueResponse> getAllAvailableLeague(Integer country, Exception ex) {
        LeagueResponse response = fileService.getModelResponse("leagues.json", LeagueResponse.class);
        return ResponseEntity.ok(response);
    }

    public ResponseEntity<TeamResponse> getAllAvailableTeams(Integer country, Integer league, Exception ex) {
        TeamResponse response = fileService.getModelResponse("teams.json", TeamResponse.class);
        return ResponseEntity.ok(response);
    }

    public ResponseEntity<StandingResponse> getAllAvailableStandings(Integer league, Integer team, Exception ex) {
        StandingResponse response = fileService.getModelResponse("standings.json", StandingResponse.class);
        return ResponseEntity.ok(response);
    }
}
