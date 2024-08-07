package com.prateekb.footbalApp.models.api;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "country_id",
        "country_name",
        "country_logo"
})
public class Country {
    @JsonProperty("country_id")
    String id;
    @JsonProperty("country_name")
    String countryName;
    @JsonProperty("country_logo")
    String logoHref;

    @JsonProperty("country_id")
    public String getCountryId() {
        return id;
    }

    @JsonProperty("country_id")
    public void setCountryId(String countryId) {
        this.id = countryId;
    }

    @JsonProperty("country_name")
    public String getCountryName() {
        return countryName;
    }

    @JsonProperty("country_name")
    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    @JsonProperty("country_logo")
    public String getCountryLogo() {
        return logoHref;
    }

    @JsonProperty("country_logo")
    public void setCountryLogo(String countryLogo) {
        this.logoHref = countryLogo;
    }

}
