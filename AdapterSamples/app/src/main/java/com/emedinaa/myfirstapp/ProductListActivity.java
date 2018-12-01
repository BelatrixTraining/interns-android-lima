package com.emedinaa.myfirstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.emedinaa.myfirstapp.adapter.ProductAdapter;
import com.emedinaa.myfirstapp.data.ProductData;
import com.emedinaa.myfirstapp.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductListActivity extends AppCompatActivity {

    private ListView listViewProduct;
    private List<Product> products= new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_list);

        listViewProduct= findViewById(R.id.listViewProduct);
        loadProducts();
    }

    private void loadProducts(){
        products= ProductData.getProducts();
        ProductAdapter productAdapter= new ProductAdapter(this, products);
        listViewProduct.setAdapter(productAdapter);
    }
}
