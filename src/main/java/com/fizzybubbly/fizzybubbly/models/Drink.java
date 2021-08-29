package com.fizzybubbly.fizzybubbly.models;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Drink extends AbstractEntity {

    @ManyToOne
    private Brand brand;

    @ManyToOne
    private Flavor flavor;

    private String carbonation;

    private int rating;

    private String imagePath;

    public Drink(Brand brand, Flavor flavor, String carbonation, int rating, String imagePath) {
        this.brand = brand;
        this.flavor = flavor;
        this.carbonation = carbonation;
        this.rating = rating;
        this.imagePath = imagePath;
    }

    public Drink() {}

    @Override
    public String toString() {
        return brand.getName() + " " + flavor.getName();
    }

    public String getBrand() {
        return brand.getName();
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public String getFlavor() {
        return flavor.getName();
    }

    public void setFlavor(Flavor flavor) {
        this.flavor = flavor;
    }

    public String getCarbonation() {
        return carbonation;
    }

    public void setCarbonation(String carbonation) {
        this.carbonation = carbonation;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }
}
