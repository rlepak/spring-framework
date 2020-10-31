package com.app.calculator;


import com.app.enums.City;
import com.app.interfaces.Carpet;
import com.app.interfaces.Floor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.math.MathContext;


@Component
public class Calculator {

    @Qualifier("carpetVirginia")
    @Autowired
    private Carpet carpet;


    @Qualifier("bedroom")
    @Autowired
    private Floor floor;

    public String getTotalCarpetCost(City city) throws Exception{
        BigDecimal cost = carpet.getSqFtPrice(city).multiply(floor.getArea());

        if (cost.compareTo(BigDecimal.ZERO)==0){
            throw new Exception("This city does't exist");
        }else{
            return "Total cost " + cost;
        }
    }


}
