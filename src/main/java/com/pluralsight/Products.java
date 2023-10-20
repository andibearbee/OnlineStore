package com.pluralsight;

public class Products {
        private String sku;
        private String productName;
        private float price;
        private String department;
        public Products(String sku, String productName, float price, String department) {
            this.sku = sku;
            this.productName = productName;
            this.price = price;
            this.department = department;
        }
        public String getSku() {
            return this.sku;
        }
        public String getProductName() {
            return this.productName;
        }
        public float getPrice() {
            return this.price;
        }

        public String getDepartment () {
            return this.department;
        }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
