package com.prateekb.footbalApp.models.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TeamDetails {
    Integer teamId;
    String teamName;
    Integer leagueId;
    Integer countryId;
    String countryName;
    String standingURI;

}
