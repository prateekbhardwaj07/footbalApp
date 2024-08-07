package com.prateekb.footbalApp.models.api;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "venue_name",
        "venue_address",
        "venue_city",
        "venue_capacity",
        "venue_surface"
})
public class Venue {
    @JsonProperty("venue_name")
    private String venueName;
    @JsonProperty("venue_address")
    private String venueAddress;
    @JsonProperty("venue_city")
    private String venueCity;
    @JsonProperty("venue_capacity")

    private String venueCapacity;
    @JsonProperty("venue_surface")
    private String venueSurface;

    @JsonProperty("venue_name")
    public String getVenueName() {
        return venueName;
    }
    @JsonProperty("venue_name")
    public void setVenueName(String venueName) {
        this.venueName = venueName;
    }

    @JsonProperty("venue_address")
    public String getVenueAddress() {
        return venueAddress;
    }

    @JsonProperty("venue_address")
    public void setVenueAddress(String venueAddress) {
        this.venueAddress = venueAddress;
    }

    @JsonProperty("venue_city")
    public String getVenueCity() {
        return venueCity;
    }

    @JsonProperty("venue_city")
    public void setVenueCity(String venueCity) {
        this.venueCity = venueCity;
    }

    @JsonProperty("venue_capacity")
    public String getVenueCapacity() {
        return venueCapacity;
    }

    @JsonProperty("venue_capacity")
    public void setVenueCapacity(String venueCapacity) {
        this.venueCapacity = venueCapacity;
    }

    @JsonProperty("venue_surface")
    public String getVenueSurface() {
        return venueSurface;
    }

    @JsonProperty("venue_surface")
    public void setVenueSurface(String venueSurface) {
        this.venueSurface = venueSurface;
    }

}