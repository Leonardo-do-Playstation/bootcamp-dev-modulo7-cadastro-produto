package com.abutua.product_backend.models;

public class Product {
    
    //Atributos
    private int id;
    private String name;
    private double price;
    private String description;
    private boolean promotion;
    private boolean newProduct;
    private int idCategory;
    
    // Método construtor
     public Product(int id, String name,String description,int idCategory,boolean promotion, boolean newProduct, Double price){ //Declarando o metodo construtor e qual deve ser a estrutura do produto
            this.id = id;
            this.name = name;
            this.description = description;
            this.price = price;
            this.promotion = promotion;
            this.newProduct = newProduct;
            this.idCategory = idCategory; //Contrutor quase estourando o limite de informações (MAX 7)
            
    }
     public Product(){ //Declarando o metodo construtor vazio para novos produtos
           
    }

    // Métodos
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return price;
    }
     public String getDescription() {
        return description;
    }
     public void setDescription(String description) {
         this.description = description;
     }
     public boolean isPromotion() {
         return promotion;
     }
     public void setPromotion(boolean promotion) {
         this.promotion = promotion;
     }
     public boolean isNewProduct() {
         return newProduct;
     }
     public void setNewProduct(boolean newProduct) {
         this.newProduct = newProduct;
     }
     public int getIdCategory() {
         return idCategory;
     }
     public void setIdCategory(int idCategory) {
         this.idCategory = idCategory;
     }
    public void setPrice(double price) {
        this.price = price;
    }

    
}
