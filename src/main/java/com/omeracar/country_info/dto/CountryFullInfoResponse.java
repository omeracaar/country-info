package com.omeracar.country_info.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CountryFullInfoResponse {

    private String isoCode;
    private String name;
    private String capital;
    private String phoneCode;
    private String continentCode;
    private String currencyIsoCode;
    private String countryFlag;
}
