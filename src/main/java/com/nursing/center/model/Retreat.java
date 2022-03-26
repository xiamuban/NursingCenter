package com.nursing.center.model;

import java.util.Date;
import java.util.List;

public class Retreat {
    private Integer id;

    private Date createTime;

    private Integer customerId;

    private Date retreatTime;

    private String retreatReason;

    private String auditStatus;
    //一对一关联
    private Customer customer;

    //一对多关联
    private List<Verify> verifyList;

    public List<Verify> getVerifyList() {
        return verifyList;
    }

    public void setVerifyList(List<Verify> verifyList) {
        this.verifyList = verifyList;
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

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Date getRetreatTime() {
        return retreatTime;
    }

    public void setRetreatTime(Date retreatTime) {
        this.retreatTime = retreatTime;
    }

    public String getRetreatReason() {
        return retreatReason;
    }

    public void setRetreatReason(String retreatReason) {
        this.retreatReason = retreatReason == null ? null : retreatReason.trim();
    }

    public String getAuditStatus() {
        return auditStatus;
    }

    public void setAuditStatus(String auditStatus) {
        this.auditStatus = auditStatus == null ? null : auditStatus.trim();
    }
}