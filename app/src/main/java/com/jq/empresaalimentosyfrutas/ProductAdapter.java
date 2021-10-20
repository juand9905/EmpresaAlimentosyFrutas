package com.jq.empresaalimentosyfrutas;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.jq.empresaalimentosyfrutas.Model.Product;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.LinkedList;

public class ProductAdapter extends BaseAdapter {

    protected Activity activity;
    protected ArrayList<Product> products;

    public ProductAdapter(Activity activity, ArrayList<Product> products) {
        this.activity = activity;
        this.products = products;
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
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = convertView;
        if (convertView == null){
            LayoutInflater inf = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            v = inf.inflate(R.layout.product_item,null);
        }
        Product productElement = products.get(position);

        TextView txtProductId = v.findViewById(R.id.txtProductId);
        txtProductId.setText(productElement.getIdProducto());

        TextView txtProductName = v.findViewById(R.id.txtProductName);
        txtProductName.setText(productElement.getNameProduct());

        TextView txtProductCantidad = v.findViewById(R.id.txtProductCantidad);
        txtProductCantidad.setText(productElement.getCantidadProduct());

        TextView txtProductPrecio = v.findViewById(R.id.txtProductPrecio);
        txtProductPrecio.setText(productElement.getPrecioProduct());

        ImageView img = v.findViewById(R.id.imageView);
        Picasso.get().load(productElement.getUrlImage()).into(img);

        return v;
    }
}
