package com.jq.empresaalimentosyfrutas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.jq.empresaalimentosyfrutas.Model.Product;

import java.util.ArrayList;
import java.util.LinkedList;

public class Listar_PRODUCTOS extends AppCompatActivity implements AdapterView.OnItemClickListener {


    private ListView lstProduct;
    private ArrayList<Product> products = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listar_productos);
        lstProduct = findViewById(R.id.lstViewProducts);
        Bundle intent = getIntent().getBundleExtra("extra");
        /*
        products.add(new Product("1234", "Arroz","1 kg" ,"1000" ,"https://www.casamuros.es/wp-content/uploads/2017/09/arroz-basmati.jpg"));
        products.add(new Product("5678", "Mango","2" ,"5000" ,"https://cdn.shopify.com/s/files/1/0279/7587/6643/products/MANGO.png?v=1623208921"));
        products.add(new Product("9876", "Platano","3" ,"3000" ,"https://www.enverdurate.cl/wp-content/uploads/2018/12/platano-2.jpg"));
        Intent intent = getIntent();
        */

        products = ((ArrayList<Product>)(intent.getSerializable("lista")));
        ProductAdapter adapter = new ProductAdapter(this,products);

        //ArrayAdapter<Product> adapter = new ArrayAdapter<Product>(this, android.R.layout.simple_list_item_1,products);
        lstProduct.setAdapter(adapter);
        lstProduct.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(this, "ha seleccionado el producto " + products.get(position), Toast.LENGTH_SHORT).show();
    }
}