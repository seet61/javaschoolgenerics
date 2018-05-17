package com.sbt.javaschoold.rnd.generics.example4;

import com.sbt.javaschoold.rnd.generics.example3.entities.Credit;
import com.sbt.javaschoold.rnd.generics.example3.entities.Product;
import com.sbt.javaschoold.rnd.generics.example4.basicstore.MyObjectStore;
import com.sbt.javaschoold.rnd.generics.example4.impls.GetOpenProducts;
import com.sbt.javaschoold.rnd.generics.example4.impls.MyObjectStoreImpl;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Example {
    public static void main(String[] args) {
        MyObjectStore<String, Product> myStore = new MyObjectStoreImpl<>();

        Map<String, Product> stringProductMap = new HashMap<>();

        stringProductMap.put("1", new Product(new Date(), null, 1L));
        stringProductMap.put("2", new Product(new Date(), null, 2L));
        stringProductMap.put("3", new Product(new Date(), new Date(), 3L));
        stringProductMap.put("4", new Product(new Date(), new Date(), 4L));

        myStore.putAll(stringProductMap);
        System.out.println(myStore.getAll(new GetOpenProducts()));

        Map<String, Credit> stringCreditMap = new HashMap<>();

        stringCreditMap.put("1", new Credit(new Date(), null, 1L, new BigDecimal(10)));
        stringCreditMap.put("2", new Credit(new Date(), null, 2L, new BigDecimal(10)));
        stringCreditMap.put("3", new Credit(new Date(), new Date(), 3L, new BigDecimal(10)));
        stringCreditMap.put("4", new Credit(new Date(), new Date(), 4L, new BigDecimal(10)));

        myStore.putAll(stringCreditMap);
        System.out.println(myStore.getAll(new GetOpenProducts()));
    }
}
