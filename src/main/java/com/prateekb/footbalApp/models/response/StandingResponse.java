package com.prateekb.footbalApp.models.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StandingResponse {
    Integer teamId;
    String teamName;
    String leagueName;
    Integer leaguePosition;
    Integer homePosition;
    Integer awayPosition;

}
