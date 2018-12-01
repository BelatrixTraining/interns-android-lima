package com.emedinaa.myfirstapp.data;

import com.emedinaa.myfirstapp.model.Movie;
import com.emedinaa.myfirstapp.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductData {

    public static List<Product> getProducts(){

        List<Product> productListList= new ArrayList<>();
        productListList.add(new Product(1,"Cuadernos",1.5,0));
        productListList.add(new Product(1,"Plumones",1.0,5));
        productListList.add(new Product(1,"Borrador",0.5,5));
        productListList.add(new Product(1,"Hojas Bond",2.0,5));
        productListList.add(new Product(1,"Plumones",1.0,5));
        productListList.add(new Product(1,"Borrador",0.5,5));
        productListList.add(new Product(1,"Hojas Bond",2.0,5));
        productListList.add(new Product(1,"Plumones",1.0,5));
        productListList.add(new Product(1,"Borrador",0.5,5));
        productListList.add(new Product(1,"Hojas Bond",2.0,5));
        productListList.add(new Product(1,"Plumones",1.0,5));
        productListList.add(new Product(1,"Borrador",0.5,5));
        productListList.add(new Product(1,"Hojas Bond",2.0,5));
        productListList.add(new Product(1,"Plumones",1.0,5));
        productListList.add(new Product(1,"Borrador",0.5,5));
        productListList.add(new Product(1,"Hojas Bond",2.0,5));
        productListList.add(new Product(1,"Plumones",1.0,5));
        productListList.add(new Product(1,"Borrador",0.5,5));
        productListList.add(new Product(1,"Hojas Bond",2.0,5));

        return productListList;
    }
}
