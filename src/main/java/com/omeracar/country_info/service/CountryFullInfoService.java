package com.omeracar.country_info.service;

import com.omeracar.country_info.dto.CountryFullInfoResponse;
import com.omeracar.country_info.mapper.CountryFullInfoMapper;
import com.omeracar.countryinfo.ws.CountryInfoService;
import com.omeracar.countryinfo.ws.CountryInfoServiceSoapType;
import com.omeracar.countryinfo.ws.TCountryInfo;
import org.springframework.stereotype.Service;

@Service
public class CountryFullInfoService {

    private final CountryFullInfoMapper mapper;

    public CountryFullInfoService(CountryFullInfoMapper mapper) {
        this.mapper = mapper;
    }

    //controllerda da olan metot soap client ı veriyor
    private CountryInfoServiceSoapType getSoap() {
        CountryInfoService countryInfoService = new CountryInfoService();
        return countryInfoService.getCountryInfoServiceSoap();
    }


    public CountryFullInfoResponse countryFullInfoResponse(String isoCode){
        TCountryInfo info= getSoap().fullCountryInfo(isoCode);
        //getSoap().fullCountryInfo(isoCode); dış servise xml yapıda iso code gönderiyor

        return mapper.toDto(info);
    }
}
