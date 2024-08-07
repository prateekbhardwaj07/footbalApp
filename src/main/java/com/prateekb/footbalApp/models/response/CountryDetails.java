package com.prateekb.footbalApp.models.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CountryDetails {
    Integer countryId;
    String name;
    String leagueURI;
}
