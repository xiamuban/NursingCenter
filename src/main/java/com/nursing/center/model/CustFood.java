package com.nursing.center.model;

import java.util.Date;

public class CustFood {
    private Integer id;

    private Date addDate;

    private String remarks;

    private String delFlag;

    private Integer custId;

    private Integer foodId;

    private Date foodDate;

    private Integer foodWeek;

    private Food food;

    private Customer customer;

    public Food getFood() {
        return food;
    }

    public void setFood(Food food) {
        this.food = food;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getAddDate() {
        return addDate;
    }

    public void setAddDate(Date addDate) {
        this.addDate = addDate;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag == null ? null : delFlag.trim();
    }

    public Integer getCustId() {
        return custId;
    }

    public void setCustId(Integer custId) {
        this.custId = custId;
    }

    public Integer getFoodId() {
        return foodId;
    }

    public void setFoodId(Integer foodId) {
        this.foodId = foodId;
    }

    public Date getFoodDate() {
        return foodDate;
    }

    public void setFoodDate(Date foodDate) {
        this.foodDate = foodDate;
    }

    public Integer getFoodWeek() {
        return foodWeek;
    }

    public void setFoodWeek(Integer foodWeek) {
        this.foodWeek = foodWeek;
    }
}