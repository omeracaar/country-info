package com.omeracar.country_info.controller;

import com.omeracar.countryinfo.ws.CountryInfoService;
import com.omeracar.countryinfo.ws.CountryInfoServiceSoapType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/country")
public class CountryInfoController {

    private CountryInfoServiceSoapType getSoap() {
        CountryInfoService countryInfoService = new CountryInfoService();
        return countryInfoService.getCountryInfoServiceSoap();
    }

    @GetMapping("/name/{countryName}")
    public String getCountryName(@PathVariable String countryName) {
        return getSoap().countryName(countryName);
    }

}
