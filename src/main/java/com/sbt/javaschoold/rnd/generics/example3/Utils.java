package com.sbt.javaschoold.rnd.generics.example3;

import com.sbt.javaschoold.rnd.generics.example3.entities.Product;

import java.util.Date;

public class Utils {
    public static <P extends Product> P createProduct(Class<P> clazz) {
        P product = null;

        try {
            product = clazz.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        product.setBeginDate(new Date());
        return product;
    }
}
