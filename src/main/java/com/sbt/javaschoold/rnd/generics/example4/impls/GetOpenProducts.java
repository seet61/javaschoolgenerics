package com.sbt.javaschoold.rnd.generics.example4.impls;

import com.sbt.javaschoold.rnd.generics.example3.entities.Product;
import com.sbt.javaschoold.rnd.generics.example4.basicstore.Predicate;

public class GetOpenProducts implements Predicate<Product>{
    @Override
    public boolean apply(Product ext) {
        return ext.getEndDate() == null;
    }
}
