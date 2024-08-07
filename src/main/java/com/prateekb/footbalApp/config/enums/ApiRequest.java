package com.prateekb.footbalApp.config.enums;

public enum ApiRequest {
    COUNTRIES(RequestParams.ACTION.getDesc(), RequestParams.API_KEY.getDesc()),
    LEAGUES(RequestParams.ACTION.getDesc(), RequestParams.COUNTRYID.getDesc(), RequestParams.API_KEY.getDesc()),
    TEAMS(RequestParams.ACTION.getDesc(), RequestParams.LEAGUEID.getDesc(), RequestParams.API_KEY.getDesc()),
    STANDINGS(RequestParams.ACTION.getDesc(), RequestParams.LEAGUEID.getDesc(), RequestParams.API_KEY.getDesc());

    private String[] requestParams;
    ApiRequest(String... params){
        this.requestParams = params;
    }

    public String[] getRequestParams() {
        return requestParams;
    }
}
