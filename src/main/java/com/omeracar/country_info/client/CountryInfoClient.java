package com.omeracar.country_info.client;

import com.omeracar.country_info.dto.CountryFullInfoResponse;
import com.omeracar.country_info.mapper.CountryFullInfoMapper;
import com.omeracar.countryinfo.ws.CountryInfoServiceSoapType;
import com.omeracar.countryinfo.ws.LanguageISOCodeResponse;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.springframework.stereotype.Component;

@Component
public class CountryInfoClient {

    private static final String WS_URL = "http://webservices.oorsprong.org/websamples.countryinfo/CountryInfoService.wso";

    private final CountryFullInfoMapper mapper;

    public CountryInfoClient(CountryFullInfoMapper mapper) {
        this.mapper = mapper;
    }

    private CountryInfoServiceSoapType createSoap() {
        JaxWsProxyFactoryBean factoryBean = new JaxWsProxyFactoryBean();
        factoryBean.setServiceClass(CountryInfoServiceSoapType.class);
        factoryBean.setAddress(WS_URL);
        return (CountryInfoServiceSoapType) factoryBean.create();
    }

    public CountryFullInfoResponse getLanguageISOCode(String languageName) {
        String isoCode = createSoap().languageISOCode(languageName);
        return mapper.toDto(languageName, isoCode);
    }
}
