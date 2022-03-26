package com.nursing.center.model;

public class Food {
    private Integer id;

    private String name;

    private String category;

    private String label;

    private Double price;

    private String photo;

    private String momalFlag;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category == null ? null : category.trim();
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label == null ? null : label.trim();
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo == null ? null : photo.trim();
    }

    public String getMomalFlag() {
        return momalFlag;
    }

    public void setMomalFlag(String momalFlag) {
        this.momalFlag = momalFlag == null ? null : momalFlag.trim();
    }
}