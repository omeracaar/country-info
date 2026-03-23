package com.omeracar.country_info.mapper;

import com.omeracar.country_info.dto.CountryFullInfoResponse;
import com.omeracar.countryinfo.ws.TCountryInfo;
import org.springframework.stereotype.Component;

@Component
public class CountryFullInfoMapper {

    public CountryFullInfoResponse toDto(TCountryInfo info){
        //aldığım xml response 'u CountryFullInfoResponse a mapliyor
        return new CountryFullInfoResponse(
                info.getSISOCode(),
                info.getSName(),
                info.getSCapitalCity(),
                info.getSPhoneCode(),
                info.getSContinentCode(),
                info.getSCurrencyISOCode(),
                info.getSCountryFlag());
    }

}
