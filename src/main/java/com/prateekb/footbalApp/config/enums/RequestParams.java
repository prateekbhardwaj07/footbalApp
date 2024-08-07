package com.prateekb.footbalApp.config.enums;

public enum RequestParams {
    ACTION("action"),
    API_KEY("APIkey"),
    COUNTRYID("country_id"),
    LEAGUEID("league_id"),
    TEAMID("team_id");
    private String desc;
    RequestParams(String description){
        this.desc = description;
    }
    public String getDesc() {
        return desc;
    }
}
