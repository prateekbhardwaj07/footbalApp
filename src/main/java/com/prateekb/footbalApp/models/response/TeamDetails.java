package com.prateekb.footbalApp.models.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TeamDetails {
    Integer teamId;
    String teamName;
    Integer leagueId;
    Integer countryId;
    String countryName;
    String standingURI;

}
