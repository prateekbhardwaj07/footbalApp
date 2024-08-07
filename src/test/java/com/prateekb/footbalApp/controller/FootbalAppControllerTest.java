package com.prateekb.footbalApp.controller;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.prateekb.footbalApp.models.response.CountryResponse;
import com.prateekb.footbalApp.models.response.LeagueResponse;
import com.prateekb.footbalApp.models.response.StandingResponse;
import com.prateekb.footbalApp.models.response.TeamResponse;
import com.prateekb.footbalApp.service.FootBalAppService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@SpringBootTest
@EnableConfigurationProperties
@AutoConfigureMockMvc
public class FootbalAppControllerTest {
    @Autowired
    FootBalAppService service;
    @Autowired
    MockMvc mockMvc;

    private ObjectMapper objectMapper = new ObjectMapper()
            .findAndRegisterModules()
            .configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS,false)
            .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES,false);

    private String authToken = "e98d7a18-1c3f-4b02-8fc6-83c81e2d34e2";
    private String mockCountryCode = "44";
    private String mockLeagueCode = "149";
    private String mockTeamCode = "3014";


    @Test
    public void test_WhenGetCountry_Success() throws Exception {
        MvcResult mvcResult =
                mockMvc.perform(MockMvcRequestBuilders.get("/footbal/get-country")
                                .header("Authorization", authToken)
                                .contentType(MediaType.APPLICATION_JSON_VALUE)
                        ).andExpect(MockMvcResultMatchers.status().isOk())
                        .andReturn();
        CountryResponse response =
                objectMapper.readValue(mvcResult.getResponse().getContentAsString(),CountryResponse.class);
        Assertions.assertNotNull(response);
        Assertions.assertNotNull(response.getDetails());
        Assertions.assertTrue(response.getDetails().size() > 0);
    }

    @Test
    void test_WhenGetCountryReturns_WithUnAuthorizedAccess401() throws Exception {
        MvcResult mvcResult =
                mockMvc.perform(MockMvcRequestBuilders.get("/footbal/get-country")
                                .contentType(MediaType.APPLICATION_JSON_VALUE)
                        ).andExpect(MockMvcResultMatchers.status().isUnauthorized())
                        .andReturn();
    }

    @Test
    public void test_WhenGetLeague_Success() throws Exception {
        MvcResult mvcResult =
                mockMvc.perform(MockMvcRequestBuilders.get("/footbal/get-league/" + mockCountryCode)
                                .header("Authorization", authToken)
                                .contentType(MediaType.APPLICATION_JSON_VALUE)
                        ).andExpect(MockMvcResultMatchers.status().isOk())
                        .andReturn();
        LeagueResponse response =
                objectMapper.readValue(mvcResult.getResponse().getContentAsString(), LeagueResponse.class);
        Assertions.assertNotNull(response);
        Assertions.assertNotNull(response.getDetails());
        Assertions.assertTrue(response.getDetails().size() > 0);
    }

    @Test
    void test_WhenGetLeagueReturns_WithUnAuthorizedAccess401() throws Exception {
        MvcResult mvcResult =
                mockMvc.perform(MockMvcRequestBuilders.get("/footbal/get-league/" + mockCountryCode)
                                .contentType(MediaType.APPLICATION_JSON_VALUE)
                        ).andExpect(MockMvcResultMatchers.status().isUnauthorized())
                        .andReturn();
    }

    @Test
    public void test_WhenGetTeams_Success() throws Exception {
        MvcResult mvcResult =
                mockMvc.perform(MockMvcRequestBuilders.get("/footbal/get-teams/"
                                        + mockCountryCode + "/" + mockLeagueCode)
                                .header("Authorization", authToken)
                                .contentType(MediaType.APPLICATION_JSON_VALUE)
                        ).andExpect(MockMvcResultMatchers.status().isOk())
                        .andReturn();
        TeamResponse response =
                objectMapper.readValue(mvcResult.getResponse().getContentAsString(), TeamResponse.class);
        Assertions.assertNotNull(response);
        Assertions.assertNotNull(response.getDetails());
        Assertions.assertTrue(response.getDetails().size() > 0);
    }

    @Test
    void test_WhenGetTeamsReturns_WithUnAuthorizedAccess401() throws Exception {
        MvcResult mvcResult =
                mockMvc.perform(MockMvcRequestBuilders.get("/footbal/get-teams/"
                                        + mockCountryCode + "/" + mockLeagueCode)
                                .contentType(MediaType.APPLICATION_JSON_VALUE)
                        ).andExpect(MockMvcResultMatchers.status().isUnauthorized())
                        .andReturn();
    }
    @Test
    public void test_WhenGetStandings_Success() throws Exception {
        MvcResult mvcResult =
                mockMvc.perform(MockMvcRequestBuilders.get("/footbal/get-standings/"
                                        + mockLeagueCode + "/" + mockTeamCode)
                                .header("Authorization", authToken)
                                .contentType(MediaType.APPLICATION_JSON_VALUE)
                        ).andExpect(MockMvcResultMatchers.status().isOk())
                        .andReturn();
        StandingResponse response =
                objectMapper.readValue(mvcResult.getResponse().getContentAsString(), StandingResponse.class);
        Assertions.assertNotNull(response);
    }
    @Test
    void test_WhenGetStandingsReturns_WithUnAuthorizedAccess401() throws Exception {
        MvcResult mvcResult =
                mockMvc.perform(MockMvcRequestBuilders.get("/footbal/get-standings/"
                                        + mockLeagueCode + "/" + mockTeamCode)
                                .contentType(MediaType.APPLICATION_JSON_VALUE)
                        ).andExpect(MockMvcResultMatchers.status().isUnauthorized())
                        .andReturn();
    }
}
