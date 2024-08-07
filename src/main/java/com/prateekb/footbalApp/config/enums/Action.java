package com.prateekb.footbalApp.config.enums;

public enum Action {
    COUNTRY("get_countries"),LEAGUE("get_leagues"),TEAMS("get_teams"), STANDINGS("get_standings");
    private String actionValue;
    Action(String value){
        this.actionValue = value;
    }

    public String getActionValue() {
        return actionValue;
    }
}
