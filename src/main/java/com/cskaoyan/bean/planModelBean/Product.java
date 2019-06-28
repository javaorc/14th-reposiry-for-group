package com.cskaoyan.bean.planModelBean;

public class Product {
    private String productId;

    private String productName;

    private String productType;

    private String image;

    private String note;

    private Integer status;

    public Product() {
    }

    public Product(String productId, String productName, String productType, String image, String note, Integer status) {
        this.productId = productId;
        this.productName = productName;
        this.productType = productType;
        this.image = image;
        this.note = note;
        this.status = status;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId='" + productId + '\'' +
                ", productName='" + productName + '\'' +
                ", productType='" + productType + '\'' +
                ", image='" + image + '\'' +
                ", note='" + note + '\'' +
                ", status=" + status +
                '}';
    }
}
