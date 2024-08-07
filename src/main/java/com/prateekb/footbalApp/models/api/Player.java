package com.prateekb.footbalApp.models.api;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "player_key",
        "player_id",
        "player_image",
        "player_name",
        "player_number",
        "player_country",
        "player_type",
        "player_age",
        "player_match_played",
        "player_goals",
        "player_yellow_cards",
        "player_red_cards",
        "player_injured",
        "player_substitute_out",
        "player_substitutes_on_bench",
        "player_assists",
        "player_birthdate",
        "player_is_captain",
        "player_shots_total",
        "player_goals_conceded",
        "player_fouls_committed",
        "player_tackles",
        "player_blocks",
        "player_crosses_total",
        "player_interceptions",
        "player_clearances",
        "player_dispossesed",
        "player_saves",
        "player_inside_box_saves",
        "player_duels_total",
        "player_duels_won",
        "player_dribble_attempts",
        "player_dribble_succ",
        "player_pen_comm",
        "player_pen_won",
        "player_pen_scored",
        "player_pen_missed",
        "player_passes",
        "player_passes_accuracy",
        "player_key_passes",
        "player_woordworks",
        "player_rating"
})
public class Player {

    @JsonProperty("player_key")
    private Long playerKey;
    @JsonProperty("player_id")
    private String playerId;
    @JsonProperty("player_image")
    private String playerImage;
    @JsonProperty("player_name")
    private String playerName;
    @JsonProperty("player_number")
    private String playerNumber;
    @JsonProperty("player_country")
    private String playerCountry;
    @JsonProperty("player_type")
    private String playerType;
    @JsonProperty("player_age")
    private String playerAge;
    @JsonProperty("player_match_played")
    private String playerMatchPlayed;
    @JsonProperty("player_goals")
    private String playerGoals;
    @JsonProperty("player_yellow_cards")
    private String playerYellowCards;
    @JsonProperty("player_red_cards")
    private String playerRedCards;
    @JsonProperty("player_injured")
    private String playerInjured;
    @JsonProperty("player_substitute_out")
    private String playerSubstituteOut;
    @JsonProperty("player_substitutes_on_bench")
    private String playerSubstitutesOnBench;
    @JsonProperty("player_assists")
    private String playerAssists;
    @JsonProperty("player_birthdate")
    private String playerBirthdate;
    @JsonProperty("player_is_captain")
    private String playerIsCaptain;
    @JsonProperty("player_shots_total")
    private String playerShotsTotal;
    @JsonProperty("player_goals_conceded")
    private String playerGoalsConceded;
    @JsonProperty("player_fouls_committed")
    private String playerFoulsCommitted;
    @JsonProperty("player_tackles")
    private String playerTackles;
    @JsonProperty("player_blocks")
    private String playerBlocks;
    @JsonProperty("player_crosses_total")
    private String playerCrossesTotal;
    @JsonProperty("player_interceptions")
    private String playerInterceptions;
    @JsonProperty("player_clearances")
    private String playerClearances;
    @JsonProperty("player_dispossesed")
    private String playerDispossesed;
    @JsonProperty("player_saves")
    private String playerSaves;
    @JsonProperty("player_inside_box_saves")
    private String playerInsideBoxSaves;
    @JsonProperty("player_duels_total")
    private String playerDuelsTotal;
    @JsonProperty("player_duels_won")
    private String playerDuelsWon;
    @JsonProperty("player_dribble_attempts")
    private String playerDribbleAttempts;
    @JsonProperty("player_dribble_succ")
    private String playerDribbleSucc;
    @JsonProperty("player_pen_comm")
    private String playerPenComm;
    @JsonProperty("player_pen_won")
    private String playerPenWon;
    @JsonProperty("player_pen_scored")
    private String playerPenScored;
    @JsonProperty("player_pen_missed")
    private String playerPenMissed;
    @JsonProperty("player_passes")
    private String playerPasses;
    @JsonProperty("player_passes_accuracy")
    private String playerPassesAccuracy;
    @JsonProperty("player_key_passes")
    private String playerKeyPasses;
    @JsonProperty("player_woordworks")
    private String playerWoordworks;
    @JsonProperty("player_rating")
    private String playerRating;

    @JsonProperty("player_key")
    public Long getPlayerKey() {
        return playerKey;
    }

    @JsonProperty("player_key")
    public void setPlayerKey(Long playerKey) {
        this.playerKey = playerKey;
    }

    @JsonProperty("player_id")
    public String getPlayerId() {
        return playerId;
    }

    @JsonProperty("player_id")
    public void setPlayerId(String playerId) {
        this.playerId = playerId;
    }

    @JsonProperty("player_image")
    public String getPlayerImage() {
        return playerImage;
    }

    @JsonProperty("player_image")
    public void setPlayerImage(String playerImage) {
        this.playerImage = playerImage;
    }

    @JsonProperty("player_name")
    public String getPlayerName() {
        return playerName;
    }

    @JsonProperty("player_name")
    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    @JsonProperty("player_number")
    public String getPlayerNumber() {
        return playerNumber;
    }

    @JsonProperty("player_number")
    public void setPlayerNumber(String playerNumber) {
        this.playerNumber = playerNumber;
    }

    @JsonProperty("player_country")
    public String getPlayerCountry() {
        return playerCountry;
    }

    @JsonProperty("player_country")
    public void setPlayerCountry(String playerCountry) {
        this.playerCountry = playerCountry;
    }

    @JsonProperty("player_type")
    public String getPlayerType() {
        return playerType;
    }

    @JsonProperty("player_type")
    public void setPlayerType(String playerType) {
        this.playerType = playerType;
    }

    @JsonProperty("player_age")
    public String getPlayerAge() {
        return playerAge;
    }

    @JsonProperty("player_age")
    public void setPlayerAge(String playerAge) {
        this.playerAge = playerAge;
    }

    @JsonProperty("player_match_played")
    public String getPlayerMatchPlayed() {
        return playerMatchPlayed;
    }

    @JsonProperty("player_match_played")
    public void setPlayerMatchPlayed(String playerMatchPlayed) {
        this.playerMatchPlayed = playerMatchPlayed;
    }

    @JsonProperty("player_goals")
    public String getPlayerGoals() {
        return playerGoals;
    }

    @JsonProperty("player_goals")
    public void setPlayerGoals(String playerGoals) {
        this.playerGoals = playerGoals;
    }

    @JsonProperty("player_yellow_cards")
    public String getPlayerYellowCards() {
        return playerYellowCards;
    }

    @JsonProperty("player_yellow_cards")
    public void setPlayerYellowCards(String playerYellowCards) {
        this.playerYellowCards = playerYellowCards;
    }

    @JsonProperty("player_red_cards")
    public String getPlayerRedCards() {
        return playerRedCards;
    }

    @JsonProperty("player_red_cards")
    public void setPlayerRedCards(String playerRedCards) {
        this.playerRedCards = playerRedCards;
    }

    @JsonProperty("player_injured")
    public String getPlayerInjured() {
        return playerInjured;
    }

    @JsonProperty("player_injured")
    public void setPlayerInjured(String playerInjured) {
        this.playerInjured = playerInjured;
    }

    @JsonProperty("player_substitute_out")
    public String getPlayerSubstituteOut() {
        return playerSubstituteOut;
    }

    @JsonProperty("player_substitute_out")
    public void setPlayerSubstituteOut(String playerSubstituteOut) {
        this.playerSubstituteOut = playerSubstituteOut;
    }

    @JsonProperty("player_substitutes_on_bench")
    public String getPlayerSubstitutesOnBench() {
        return playerSubstitutesOnBench;
    }

    @JsonProperty("player_substitutes_on_bench")
    public void setPlayerSubstitutesOnBench(String playerSubstitutesOnBench) {
        this.playerSubstitutesOnBench = playerSubstitutesOnBench;
    }

    @JsonProperty("player_assists")
    public String getPlayerAssists() {
        return playerAssists;
    }

    @JsonProperty("player_assists")
    public void setPlayerAssists(String playerAssists) {
        this.playerAssists = playerAssists;
    }

    @JsonProperty("player_birthdate")
    public String getPlayerBirthdate() {
        return playerBirthdate;
    }

    @JsonProperty("player_birthdate")
    public void setPlayerBirthdate(String playerBirthdate) {
        this.playerBirthdate = playerBirthdate;
    }

    @JsonProperty("player_is_captain")
    public String getPlayerIsCaptain() {
        return playerIsCaptain;
    }

    @JsonProperty("player_is_captain")
    public void setPlayerIsCaptain(String playerIsCaptain) {
        this.playerIsCaptain = playerIsCaptain;
    }

    @JsonProperty("player_shots_total")
    public String getPlayerShotsTotal() {
        return playerShotsTotal;
    }

    @JsonProperty("player_shots_total")
    public void setPlayerShotsTotal(String playerShotsTotal) {
        this.playerShotsTotal = playerShotsTotal;
    }

    @JsonProperty("player_goals_conceded")
    public String getPlayerGoalsConceded() {
        return playerGoalsConceded;
    }

    @JsonProperty("player_goals_conceded")
    public void setPlayerGoalsConceded(String playerGoalsConceded) {
        this.playerGoalsConceded = playerGoalsConceded;
    }

    @JsonProperty("player_fouls_committed")
    public String getPlayerFoulsCommitted() {
        return playerFoulsCommitted;
    }

    @JsonProperty("player_fouls_committed")
    public void setPlayerFoulsCommitted(String playerFoulsCommitted) {
        this.playerFoulsCommitted = playerFoulsCommitted;
    }

    @JsonProperty("player_tackles")
    public String getPlayerTackles() {
        return playerTackles;
    }

    @JsonProperty("player_tackles")
    public void setPlayerTackles(String playerTackles) {
        this.playerTackles = playerTackles;
    }

    @JsonProperty("player_blocks")
    public String getPlayerBlocks() {
        return playerBlocks;
    }

    @JsonProperty("player_blocks")
    public void setPlayerBlocks(String playerBlocks) {
        this.playerBlocks = playerBlocks;
    }

    @JsonProperty("player_crosses_total")
    public String getPlayerCrossesTotal() {
        return playerCrossesTotal;
    }

    @JsonProperty("player_crosses_total")
    public void setPlayerCrossesTotal(String playerCrossesTotal) {
        this.playerCrossesTotal = playerCrossesTotal;
    }

    @JsonProperty("player_interceptions")
    public String getPlayerInterceptions() {
        return playerInterceptions;
    }

    @JsonProperty("player_interceptions")
    public void setPlayerInterceptions(String playerInterceptions) {
        this.playerInterceptions = playerInterceptions;
    }

    @JsonProperty("player_clearances")
    public String getPlayerClearances() {
        return playerClearances;
    }

    @JsonProperty("player_clearances")
    public void setPlayerClearances(String playerClearances) {
        this.playerClearances = playerClearances;
    }

    @JsonProperty("player_dispossesed")
    public String getPlayerDispossesed() {
        return playerDispossesed;
    }

    @JsonProperty("player_dispossesed")
    public void setPlayerDispossesed(String playerDispossesed) {
        this.playerDispossesed = playerDispossesed;
    }

    @JsonProperty("player_saves")
    public String getPlayerSaves() {
        return playerSaves;
    }

    @JsonProperty("player_saves")
    public void setPlayerSaves(String playerSaves) {
        this.playerSaves = playerSaves;
    }

    @JsonProperty("player_inside_box_saves")
    public String getPlayerInsideBoxSaves() {
        return playerInsideBoxSaves;
    }

    @JsonProperty("player_inside_box_saves")
    public void setPlayerInsideBoxSaves(String playerInsideBoxSaves) {
        this.playerInsideBoxSaves = playerInsideBoxSaves;
    }

    @JsonProperty("player_duels_total")
    public String getPlayerDuelsTotal() {
        return playerDuelsTotal;
    }

    @JsonProperty("player_duels_total")
    public void setPlayerDuelsTotal(String playerDuelsTotal) {
        this.playerDuelsTotal = playerDuelsTotal;
    }

    @JsonProperty("player_duels_won")
    public String getPlayerDuelsWon() {
        return playerDuelsWon;
    }

    @JsonProperty("player_duels_won")
    public void setPlayerDuelsWon(String playerDuelsWon) {
        this.playerDuelsWon = playerDuelsWon;
    }

    @JsonProperty("player_dribble_attempts")
    public String getPlayerDribbleAttempts() {
        return playerDribbleAttempts;
    }

    @JsonProperty("player_dribble_attempts")
    public void setPlayerDribbleAttempts(String playerDribbleAttempts) {
        this.playerDribbleAttempts = playerDribbleAttempts;
    }

    @JsonProperty("player_dribble_succ")
    public String getPlayerDribbleSucc() {
        return playerDribbleSucc;
    }

    @JsonProperty("player_dribble_succ")
    public void setPlayerDribbleSucc(String playerDribbleSucc) {
        this.playerDribbleSucc = playerDribbleSucc;
    }

    @JsonProperty("player_pen_comm")
    public String getPlayerPenComm() {
        return playerPenComm;
    }

    @JsonProperty("player_pen_comm")
    public void setPlayerPenComm(String playerPenComm) {
        this.playerPenComm = playerPenComm;
    }

    @JsonProperty("player_pen_won")
    public String getPlayerPenWon() {
        return playerPenWon;
    }

    @JsonProperty("player_pen_won")
    public void setPlayerPenWon(String playerPenWon) {
        this.playerPenWon = playerPenWon;
    }

    @JsonProperty("player_pen_scored")
    public String getPlayerPenScored() {
        return playerPenScored;
    }

    @JsonProperty("player_pen_scored")
    public void setPlayerPenScored(String playerPenScored) {
        this.playerPenScored = playerPenScored;
    }

    @JsonProperty("player_pen_missed")
    public String getPlayerPenMissed() {
        return playerPenMissed;
    }

    @JsonProperty("player_pen_missed")
    public void setPlayerPenMissed(String playerPenMissed) {
        this.playerPenMissed = playerPenMissed;
    }

    @JsonProperty("player_passes")
    public String getPlayerPasses() {
        return playerPasses;
    }

    @JsonProperty("player_passes")
    public void setPlayerPasses(String playerPasses) {
        this.playerPasses = playerPasses;
    }

    @JsonProperty("player_passes_accuracy")
    public String getPlayerPassesAccuracy() {
        return playerPassesAccuracy;
    }

    @JsonProperty("player_passes_accuracy")
    public void setPlayerPassesAccuracy(String playerPassesAccuracy) {
        this.playerPassesAccuracy = playerPassesAccuracy;
    }

    @JsonProperty("player_key_passes")
    public String getPlayerKeyPasses() {
        return playerKeyPasses;
    }

    @JsonProperty("player_key_passes")
    public void setPlayerKeyPasses(String playerKeyPasses) {
        this.playerKeyPasses = playerKeyPasses;
    }

    @JsonProperty("player_woordworks")
    public String getPlayerWoordworks() {
        return playerWoordworks;
    }

    @JsonProperty("player_woordworks")
    public void setPlayerWoordworks(String playerWoordworks) {
        this.playerWoordworks = playerWoordworks;
    }

    @JsonProperty("player_rating")
    public String getPlayerRating() {
        return playerRating;
    }

    @JsonProperty("player_rating")
    public void setPlayerRating(String playerRating) {
        this.playerRating = playerRating;
    }

}