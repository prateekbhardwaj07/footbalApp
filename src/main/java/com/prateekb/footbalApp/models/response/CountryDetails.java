package com.prateekb.footbalApp.models.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CountryDetails {
    Integer countryId;
    String name;
    String leagueURI;
}
