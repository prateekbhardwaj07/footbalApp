package com.prateekb.footbalApp.models.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class StandingResponse {
    Integer teamId;
    String teamName;
    String leagueName;
    Integer leaguePosition;
    Integer homePosition;
    Integer awayPosition;

}
