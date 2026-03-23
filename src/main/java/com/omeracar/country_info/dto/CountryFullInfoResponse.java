package com.omeracar.country_info.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CountryFullInfoResponse {

    private String countryCode;//xml de isoCode du değiştirdim
    private String countryName;//name
    private String countryCapital;//capital
    private String countryPhoneCode;//phoneCode
    private String continentCode;
    private String currencyIsoCode;
    private String countryFlag;
}
