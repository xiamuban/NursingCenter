package com.nursing.center.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.nursing.center.mapper.NursingRecordsMapper;
import com.nursing.center.model.NursingRecords;
import com.nursing.center.service.NursingRecordsService;
import com.nursing.center.util.Define;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class NursingRecordsServiceImpl implements NursingRecordsService {
    @Autowired
    private NursingRecordsMapper recordsMapper;
    @Override
    public void add(NursingRecords record) {
        record.setAddDate(new Date());
        record.setDelFlag("0");
        recordsMapper.insert(record);
    }

    @Override
    public PageInfo<NursingRecords> queryAll(NursingRecords nursingRecords, Integer currPage) {
        if (currPage == null) currPage = 1;
        PageHelper.startPage(currPage, Define.DEFAULT_PAGE_SIZE);
        PageInfo<NursingRecords> recordsPageInfo = new PageInfo<>(recordsMapper.queryAll(nursingRecords));
        return recordsPageInfo;
    }

    @Override
    public void delById(Integer id) {
        recordsMapper.deleteByPrimaryKey(id);
    }
}
