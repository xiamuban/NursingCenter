package com.nursing.center.model;

import java.util.Date;
import java.util.List;

public class NursingLevel {
    private Integer id;

    private Date addDate;

    private String levelName;

    private String levelStatus;

    private Integer contentNum;

    private List<NursingContent> contentList;

    public List<NursingContent> getContentList() {
        return contentList;
    }

    public void setContentList(List<NursingContent> contentList) {
        this.contentList = contentList;
    }

    public Integer getContentNum() {
        return contentNum;
    }

    public void setContentNum(Integer contentNum) {
        this.contentNum = contentNum;
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

    public String getLevelName() {
        return levelName;
    }

    public void setLevelName(String levelName) {
        this.levelName = levelName == null ? null : levelName.trim();
    }

    public String getLevelStatus() {
        return levelStatus;
    }

    public void setLevelStatus(String levelStatus) {
        this.levelStatus = levelStatus == null ? null : levelStatus.trim();
    }
}