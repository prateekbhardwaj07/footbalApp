package com.prateekb.footbalApp.models.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class LeagueDetails {
    Integer leagueId;
    String leagueName;
    Integer countryId;
    String countryName;
    String teamsURI;
}
