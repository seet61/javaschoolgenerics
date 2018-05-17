package com.sbt.javaschoold.rnd.generics.example3.entities;

import java.util.Date;

public class Product {
    private Date beginDate;
    private Date endDate;
    private Long productNumber;

    public Product() {

    }

    public Product(Date beginDate, Date endDate, Long productNumber) {
        this.beginDate = beginDate;
        this.endDate = endDate;
        this.productNumber = productNumber;
    }

    public Date getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(Date beginDate) {
        this.beginDate = beginDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Long getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(Long productNumber) {
        this.productNumber = productNumber;
    }

    @Override
    public String toString() {
        return "Product{" +
                "beginDate=" + beginDate +
                '}';
    }
}
