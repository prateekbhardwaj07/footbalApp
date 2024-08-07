package com.prateekb.footbalApp.models.api;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "coach_name",
        "coach_country",
        "coach_age"
})
public class Coach {

    @JsonProperty("coach_name")
    private String coachName;
    @JsonProperty("coach_country")
    private String coachCountry;
    @JsonProperty("coach_age")
    private String coachAge;
    @JsonProperty("coach_name")
    public String getCoachName() {
        return coachName;
    }

    @JsonProperty("coach_name")
    public void setCoachName(String coachName) {
        this.coachName = coachName;
    }

    @JsonProperty("coach_country")
    public String getCoachCountry() {
        return coachCountry;
    }

    @JsonProperty("coach_country")
    public void setCoachCountry(String coachCountry) {
        this.coachCountry = coachCountry;
    }

    @JsonProperty("coach_age")
    public String getCoachAge() {
        return coachAge;
    }

    @JsonProperty("coach_age")
    public void setCoachAge(String coachAge) {
        this.coachAge = coachAge;
    }
}
