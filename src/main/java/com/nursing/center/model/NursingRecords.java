package com.nursing.center.model;

import java.util.Date;

public class NursingRecords {
    private Integer id;

    private Date addDate;

    private Integer custId;

    private String delFlag;

    private Date nursingTime;

    private Integer nursingContent;

    private Integer nursingNum;

    private Integer nurseId;

    private Customer customer;

    private NursingContent content;

    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public NursingContent getContent() {
        return content;
    }

    public void setContent(NursingContent content) {
        this.content = content;
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

    public Integer getCustId() {
        return custId;
    }

    public void setCustId(Integer custId) {
        this.custId = custId;
    }

    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag == null ? null : delFlag.trim();
    }

    public Date getNursingTime() {
        return nursingTime;
    }

    public void setNursingTime(Date nursingTime) {
        this.nursingTime = nursingTime;
    }

    public Integer getNursingContent() {
        return nursingContent;
    }

    public void setNursingContent(Integer nursingContent) {
        this.nursingContent = nursingContent;
    }

    public Integer getNursingNum() {
        return nursingNum;
    }

    public void setNursingNum(Integer nursingNum) {
        this.nursingNum = nursingNum;
    }

    public Integer getNurseId() {
        return nurseId;
    }

    public void setNurseId(Integer nurseId) {
        this.nurseId = nurseId;
    }
}