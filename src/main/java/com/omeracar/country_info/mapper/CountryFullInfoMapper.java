package com.omeracar.country_info.mapper;

import com.omeracar.country_info.dto.CountryFullInfoResponse;
import com.omeracar.countryinfo.ws.TCountryInfo;
import org.springframework.stereotype.Component;

@Component
public class CountryFullInfoMapper {

    public CountryFullInfoResponse toDto(String languageName, String isoCode){
        //aldığım xml response 'u CountryFullInfoResponse a mapliyor
        return new CountryFullInfoResponse(languageName,isoCode);
    }

}
