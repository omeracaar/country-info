package com.omeracar.country_info.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CountryFullInfoResponse {

    private String languageName;
    private String isoCode;
}
