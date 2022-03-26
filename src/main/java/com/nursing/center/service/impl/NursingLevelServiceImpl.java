package com.nursing.center.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.nursing.center.mapper.NursingLevelMapper;
import com.nursing.center.model.NursingLevel;
import com.nursing.center.service.NursingLevelService;
import com.nursing.center.util.Define;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class NursingLevelServiceImpl implements NursingLevelService {
    @Autowired
    private NursingLevelMapper nursingLevelMapper;
    @Override
    public PageInfo<NursingLevel> queryAll(NursingLevel nursingLevel, Integer currPage) {
        if (currPage == null) currPage = 1;
        PageHelper.startPage(currPage, Define.DEFAULT_PAGE_SIZE);
        PageInfo<NursingLevel> nursingLevelPageInfo = new PageInfo<>(nursingLevelMapper.queryAll(nursingLevel));
        return nursingLevelPageInfo;
    }

    @Override
    public List<NursingLevel> selectAll() {
        return nursingLevelMapper.selectAll();
    }

    @Override
    public void add(NursingLevel nursingLevel) {
        nursingLevel.setAddDate(new Date());
        nursingLevelMapper.insert(nursingLevel);
    }

    @Override
    public void delById(Integer id) {
        nursingLevelMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void update(NursingLevel nursingLevel) {
        nursingLevelMapper.updateByPrimaryKey(nursingLevel);
    }

    @Override
    public NursingLevel loadById(Integer id) {
        return nursingLevelMapper.selById(id);
    }
}
