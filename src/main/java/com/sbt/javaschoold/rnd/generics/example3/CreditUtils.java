package com.sbt.javaschoold.rnd.generics.example3;

import com.sbt.javaschoold.rnd.generics.example3.entities.Credit;

import java.math.BigDecimal;

public class CreditUtils {
    public static Credit createCredit() {
        Credit credit = Utils.<Credit>createProduct(Credit.class);

        credit.setLoanPercent(new BigDecimal(10L));

        return credit;
    }
}
