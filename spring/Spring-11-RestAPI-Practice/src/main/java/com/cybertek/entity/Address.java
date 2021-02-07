package com.cybertek.entity;

import com.cybertek.enums.AddressType;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.web.client.RestTemplate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.util.Map;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(value = {"hibarnateLazyInitializer"}, ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Address extends BaseEntity{

    @Enumerated(EnumType.STRING)
    private AddressType addressType;
    private String city;
    private String country;

    private Integer currentTemperature;

//    private Integer currentTemperature(){
//        return consumeTemp(this.city);
//    }

    public Integer consumeTemp(String city){
        RestTemplate restTemplate = new RestTemplate();
        String baseUrl = "http://api.weatherstack.com/current?access_key=02a009b8e3922c395677a1e85406aca6&query=";

        String uri = baseUrl + city;

        Object currentWeather = restTemplate.getForObject(uri, Object.class);

        Map<String, Object> getWeather = (Map<String, Object>) currentWeather;

        Map<String, Object> getTemperature = (Map<String, Object>) ((Map<?, ?>) currentWeather).get("current");

        return Integer.parseInt(getTemperature.get("temperature").toString());
    }


    @Column(name = "postal_code")
    private String postalCode;
    private String state;
    private String street;


}
