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

    @GetMapping("/name/{countryCode}")
    public String getCountryName(@PathVariable String countryCode) {
        return getSoap().countryName(countryCode);
    }

    @GetMapping("/flag/{countryCode}")
    public String getCountryFlag(@PathVariable String countryCode) {
        return getSoap().countryFlag(countryCode);
    }

    @GetMapping("/phone/{countryCode}")
    public String getCountryPhoneCode(@PathVariable String countryCode) {
        return getSoap().countryIntPhoneCode(countryCode);
    }

    @GetMapping("/all")
    public Object getCountryList() {
        return getSoap().listOfCountryNamesByName();
    }

}
