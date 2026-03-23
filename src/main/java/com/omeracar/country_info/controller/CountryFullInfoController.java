package com.omeracar.country_info.controller;

import com.omeracar.country_info.dto.CountryFullInfoResponse;
import com.omeracar.country_info.service.CountryFullInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/country-full-info")
public class CountryFullInfoController {

    @Autowired
    private CountryFullInfoService countryFullInfoService;

    @GetMapping("/language/{languageName}")
    public CountryFullInfoResponse getLanguageISOCode(@PathVariable String languageName) {
        return countryFullInfoService.getLanguageISOCode(languageName);
    }



}
