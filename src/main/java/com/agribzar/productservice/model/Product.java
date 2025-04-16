package com.agribzar.productservice.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productId;
    private String name;
    private String description;
    private int availableQuantity;
    private double percentage;
    private LocalDate productValidity;

    // New field for storing the image URL or path
    private String image;

    public Product() {
        super();
    }

    // Getter and Setter for productId
    public Long getProductId() {
        return productId;
    }
    public void setProductId(Long productId) {
        this.productId = productId;
    }

    // Getter and Setter for name
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for description
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    // Getter and Setter for availableQuantity
    public int getAvailableQuantity() {
        return availableQuantity;
    }
    public void setAvailableQuantity(int availableQuantity) {
        this.availableQuantity = availableQuantity;
    }

    // Getter and Setter for percentage
    public double getPercentage() {
        return percentage;
    }
    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    // Getter and Setter for productValidity
    public LocalDate getProductValidity() {
        return productValidity;
    }
    public void setProductValidity(LocalDate productValidity) {
        this.productValidity = productValidity;
    }

    // Getter and Setter for image
    public String getImage() {
        return image;
    }
    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "Product [productId=" + productId + ", name=" + name + ", description=" + description + 
               ", availableQuantity=" + availableQuantity + ", percentage=" + percentage + 
               ", productValidity=" + productValidity + ", image=" + image + "]";
    }
}