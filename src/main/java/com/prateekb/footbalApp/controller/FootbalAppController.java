package com.prateekb.footbalApp.controller;

import com.prateekb.footbalApp.exception.ApplicationException;
import com.prateekb.footbalApp.models.response.CountryResponse;
import com.prateekb.footbalApp.models.response.LeagueResponse;
import com.prateekb.footbalApp.models.response.StandingResponse;
import com.prateekb.footbalApp.models.response.TeamResponse;
import com.prateekb.footbalApp.service.FootBalAppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/footbal")
public class FootbalAppController {

    @Autowired
    FootBalAppService service;
    @GetMapping(value = "/get-country")
    public ResponseEntity<CountryResponse> getAllCountries() throws ApplicationException {
        CountryResponse response = service.getAllCountries();
        if(response != null && response.getDetails().size() > 0){
            return ResponseEntity.status(200).body(response);
        }
        return ResponseEntity.status(401).build();
    }

    @GetMapping(value = "/get-league/{country}")
    public ResponseEntity<LeagueResponse> getLeague(@PathVariable("country") Integer country) throws ApplicationException {
        LeagueResponse response = service.getLeaguesForCountry(country);
        if(response != null && response.getDetails().size() > 0){
            return ResponseEntity.status(200).body(response);
        }
        return ResponseEntity.status(401).build();
    }
    @GetMapping(value = "/get-teams/{country}/{league}")
    public ResponseEntity<TeamResponse> getTeams(@PathVariable("country") Integer country,
                                                 @PathVariable("league") Integer league) throws ApplicationException {
        TeamResponse response = service.getTeamsForLeague(country, league);
        if(response != null && response.getDetails().size() > 0){
            return ResponseEntity.status(200).body(response);
        }
        return ResponseEntity.status(401).build();
    }

    @GetMapping(value = "/get-standings/{league}/{team}")
    public ResponseEntity<StandingResponse> getStandings(@PathVariable("league") Integer league,
                                                 @PathVariable("team") Integer team) throws ApplicationException {
        StandingResponse response = service.getStandingForTeam(league, team);
        if(response != null){
            return ResponseEntity.status(200).body(response);
        }
        return ResponseEntity.status(401).build();
    }


}
