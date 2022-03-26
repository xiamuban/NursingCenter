package com.nursing.center.model;

import java.util.Date;

public class MealCalendar {
    private Integer id;

    private Integer custfoodId;

    private Date addDate;

    private String remarks;

    private String delFlag;

    private String supplyType;

    private CustFood custFood;

    public CustFood getCustFood() {
        return custFood;
    }

    public void setCustFood(CustFood custFood) {
        this.custFood = custFood;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCustfoodId() {
        return custfoodId;
    }

    public void setCustfoodId(Integer custfoodId) {
        this.custfoodId = custfoodId;
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

    public String getSupplyType() {
        return supplyType;
    }

    public void setSupplyType(String supplyType) {
        this.supplyType = supplyType == null ? null : supplyType.trim();
    }
}