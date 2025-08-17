package com.shriraj.ecommerce.product.model;

public class ProductModel {
private int productNumber;
private double productPrice;
private int productStock;

public ProductModel() {
	
}

public ProductModel(int productNumber, double productPrice, int productStock) {
    this.productNumber = productNumber;
    this.productPrice = productPrice;
    this.productStock = productStock;
}

public int getProductNumber() {
    return productNumber;
}

public void setProductNumber(int productNumber) {
    this.productNumber = productNumber;
}

public double getProductPrice() {
    return productPrice;
}

public void setProductPrice(double productPrice) {
    this.productPrice = productPrice;
}

public int getProductStock() {
    return productStock;
}

public void setProductStock(int productStock) {
    this.productStock = productStock;
}


@Override
public String toString() {
    return "Product{" +
            "ProductNumber='" + productNumber + '\'' +
            ", Stock='" + productStock + '\'' +
            '}';

}
}
