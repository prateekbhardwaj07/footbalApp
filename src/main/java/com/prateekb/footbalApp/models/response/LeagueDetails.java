package com.prateekb.footbalApp.models.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LeagueDetails {
    Integer leagueId;
    String leagueName;
    Integer countryId;
    String countryName;
    String teamsURI;
}
