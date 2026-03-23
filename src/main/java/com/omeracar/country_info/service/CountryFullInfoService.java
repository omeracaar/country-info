package com.omeracar.country_info.service;

import com.omeracar.country_info.client.CountryInfoClient;
import com.omeracar.country_info.dto.CountryFullInfoResponse;
import com.omeracar.country_info.mapper.CountryFullInfoMapper;
import com.omeracar.countryinfo.ws.CountryInfoService;
import com.omeracar.countryinfo.ws.CountryInfoServiceSoapType;
import com.omeracar.countryinfo.ws.TCountryInfo;
import org.springframework.stereotype.Service;

@Service
public class CountryFullInfoService {

    private final CountryFullInfoMapper mapper;
    private final CountryInfoClient countryInfoClient;

    public CountryFullInfoService(CountryFullInfoMapper mapper, CountryInfoClient countryInfoClient) {
        this.mapper = mapper;
        this.countryInfoClient = countryInfoClient;
    }

    public CountryFullInfoResponse getLanguageISOCode(String languageName) {
        return countryInfoClient.getLanguageISOCode(languageName);
    }
}
