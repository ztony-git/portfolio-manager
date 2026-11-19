package com.pluralsight.finance;

import java.math.BigDecimal;

public abstract class FixedAsset implements Valuable {
    private String name;

    public FixedAsset(String name) {
        this.name = name;
    }

    public abstract BigDecimal getValue();
}
