package com.prateekb.footbalApp.models.api;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "team_key",
        "team_name",
        "team_country",
        "team_founded",
        "team_badge",
        "venue",
        "players",
        "coaches"
})
public class Team {
    @JsonProperty("team_key")
    private String teamKey;
    @JsonProperty("team_name")
    private String teamName;
    @JsonProperty("team_country")
    private String teamCountry;
    @JsonProperty("team_founded")
    private String teamFounded;
    @JsonProperty("team_badge")
    private String teamBadge;
    @JsonProperty("venue")
    private Venue venue;
    @JsonProperty("players")
    private List<Player> players;
    @JsonProperty("coaches")
    private List<Coach> coaches;
    @JsonProperty("team_key")
    public String getTeamKey() {
        return teamKey;
    }

    @JsonProperty("team_key")
    public void setTeamKey(String teamKey) {
        this.teamKey = teamKey;
    }

    @JsonProperty("team_name")
    public String getTeamName() {
        return teamName;
    }

    @JsonProperty("team_name")
    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    @JsonProperty("team_country")
    public String getTeamCountry() {
        return teamCountry;
    }

    @JsonProperty("team_country")
    public void setTeamCountry(String teamCountry) {
        this.teamCountry = teamCountry;
    }

    @JsonProperty("team_founded")
    public String getTeamFounded() {
        return teamFounded;
    }

    @JsonProperty("team_founded")
    public void setTeamFounded(String teamFounded) {
        this.teamFounded = teamFounded;
    }

    @JsonProperty("team_badge")
    public String getTeamBadge() {
        return teamBadge;
    }

    @JsonProperty("team_badge")
    public void setTeamBadge(String teamBadge) {
        this.teamBadge = teamBadge;
    }

    @JsonProperty("venue")
    public Venue getVenue() {
        return venue;
    }

    @JsonProperty("venue")
    public void setVenue(Venue venue) {
        this.venue = venue;
    }

    @JsonProperty("players")
    public List<Player> getPlayers() {
        return players;
    }

    @JsonProperty("players")
    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    @JsonProperty("coaches")
    public List<Coach> getCoaches() {
        return coaches;
    }

    @JsonProperty("coaches")
    public void setCoaches(List<Coach> coaches) {
        this.coaches = coaches;
    }


}