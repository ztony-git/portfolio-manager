package com.pluralsight.finance;

import java.math.BigDecimal;

public class House extends FixedAsset {
    private int yearBuilt;
    private int squareFeet;
    private int bedrooms;

    public House(String name, int yearBuilt, int squareFeet, int bedrooms) {
        super(name);
        this.yearBuilt = yearBuilt;
        this.squareFeet = squareFeet;
        this.bedrooms = bedrooms;
    }

    @Override
    public BigDecimal getValue() {
        return null;
    }
}

