package com.sbt.javaschoold.rnd.generics.example3.entities;

import java.math.BigDecimal;
import java.util.Date;

public class Credit extends Product{
    private BigDecimal loanPercent;

    public Credit() {
    }

    public Credit(Date beginDate, Date endDate, Long productNumber, BigDecimal loanPercent) {
        super(beginDate, endDate, productNumber);
        this.loanPercent = loanPercent;
    }

    public BigDecimal getLoanPercent() {
        return loanPercent;
    }

    public void setLoanPercent(BigDecimal loanPercent) {
        this.loanPercent = loanPercent;
    }

    @Override
    public String toString() {
        return "Credit{" +
                "loanPercent=" + loanPercent +
                '}';
    }
}
