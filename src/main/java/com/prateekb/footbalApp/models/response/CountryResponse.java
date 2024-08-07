package com.prateekb.footbalApp.models.response;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class CountryResponse {
    List<CountryDetails> details;
}
