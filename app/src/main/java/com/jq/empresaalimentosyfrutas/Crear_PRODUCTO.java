package com.jq.empresaalimentosyfrutas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.jq.empresaalimentosyfrutas.Model.Product;

import java.util.ArrayList;
import java.util.LinkedList;

public class Crear_PRODUCTO extends AppCompatActivity implements View.OnClickListener {

    private EditText txtId;
    private EditText txtNombre;
    private EditText txtCantidad;
    private EditText txtPrecio;
    private  EditText txtImg;
    private Button btnGuardar;
    private Button btnConsultar;

    private LinkedList<Product> products;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear_producto);
        products = new LinkedList<>();
        txtId = findViewById(R.id.txtIdProducto);
        txtNombre = findViewById(R.id.txtNombreProducto);
        txtCantidad = findViewById(R.id.txtCantidadProducto);
        txtPrecio = findViewById(R.id.txtPrecioProducto);
        txtImg = findViewById(R.id.txtImage);

        btnGuardar = findViewById(R.id.btnGuardar);
        btnConsultar = findViewById(R.id.btnConsultar);

        btnGuardar.setOnClickListener(this);
        btnConsultar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnGuardar:
                Product product = new Product();
                product.setIdProducto(txtId.getText().toString());
                product.setNameProduct(txtNombre.getText().toString());
                product.setCantidadProduct(txtCantidad.getText().toString());
                product.setPrecioProduct(txtPrecio.getText().toString());
                product.setUrlImage(txtImg.getText().toString());
                products.add(product);
                this.cleanForm();
                Toast.makeText(this, "Producto adicionado correctamente", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnConsultar:
                Bundle extra = new Bundle();
                extra.putSerializable("lista",products);

                Intent intent = new Intent(Crear_PRODUCTO.this,Listar_PRODUCTOS.class);
                intent.putExtra("extra", extra);

                startActivity(intent);
                break;

        }
    }

    private void cleanForm(){
        txtId.setText("");
        txtNombre.setText("");
        txtCantidad.setText("");
        txtPrecio.setText("");
        txtImg.setText("");

    }
}

