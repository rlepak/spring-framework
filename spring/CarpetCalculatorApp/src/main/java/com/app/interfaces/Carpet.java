package com.app.interfaces;

import com.app.enums.City;

import java.math.BigDecimal;

public interface Carpet {
    BigDecimal getSqFtPrice(City city);
}
