package com.nursing.center.service;

import com.github.pagehelper.PageInfo;
import com.nursing.center.model.NursingRecords;

public interface NursingRecordsService {
    void add(NursingRecords record);

    PageInfo<NursingRecords> queryAll(NursingRecords nursingRecords, Integer currPage);

    void delById(Integer id);
}
