package com.jq.empresaalimentosyfrutas.Model;

import java.io.Serializable;

public class Product implements Serializable {
    private String idProducto;
    private String nameProduct;
    private String cantidadProduct;
    private String precioProduct;
    private String urlImage;

    public Product(String idProducto, String nameProduct, String cantidadProduct, String precioProduct, String urlImage) {
        this.idProducto = idProducto;
        this.nameProduct = nameProduct;
        this.cantidadProduct = cantidadProduct;
        this.precioProduct = precioProduct;
        this.urlImage = urlImage;
    }

    public Product() {
        
    }

    public String getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(String idProducto) {
        this.idProducto = idProducto;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getCantidadProduct() {
        return cantidadProduct;
    }

    public void setCantidadProduct(String cantidadProduct) {
        this.cantidadProduct = cantidadProduct; }

    public String getPrecioProduct() {
        return precioProduct;
    }

    public void setPrecioProduct(String precioProduct) {
        this.precioProduct = precioProduct;
    }

    public String getUrlImage() {
        return urlImage;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }
}
