package com.emedinaa.myfirstapp.adapter;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.emedinaa.myfirstapp.R;
import com.emedinaa.myfirstapp.model.Product;

import java.util.List;

public class ProductAdapter extends BaseAdapter {

    private List<Product> products;
    private Context context;

    public ProductAdapter(Context mContext,
                          List<Product> mProducts) {
        context= mContext;
        products= mProducts;
    }

    @Override
    public int getCount() {
        return products.size();
    }

    @Override
    public Object getItem(int position) {
        return products.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view;
        if (convertView == null) {
            view = LayoutInflater.from(this.context).inflate(R.layout.row_product,parent,
                    false);
        } else {
            view = convertView;
        }

        TextView textViewName=view.findViewById(R.id.textViewName);
        TextView textViewPrice=view.findViewById(R.id.textViewPrice);
        ImageView imageView= view.findViewById(R.id.imageView);

        Product product= products.get(position);
        textViewName.setText(product.getName());
        textViewPrice.setText("S/."+product.getPrice());

        if(product.getStock()<=0){
            textViewName.setTextColor(Color.parseColor("#ff00ff"));
        }else{
            textViewName.setTextColor(Color.parseColor("#000000"));
        }
        return view;
    }
}
