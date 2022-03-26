package com.nursing.center.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.nursing.center.mapper.RetreatMapper;
import com.nursing.center.model.Retreat;
import com.nursing.center.service.RetreatService;
import com.nursing.center.util.Define;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class RetreatServiceImpl implements RetreatService {
    @Autowired
    private RetreatMapper retreatMapper;

    @Override
    public Retreat loadById(Integer id) {
        return retreatMapper.selById(id);
    }

    @Override
    public PageInfo<Retreat> queryAll(Retreat retreat, Integer currPage) {
        if (currPage == null) currPage = 1;
        PageHelper.startPage(currPage, Define.DEFAULT_PAGE_SIZE);
        PageInfo<Retreat> retreatPageInfo = new PageInfo<>(retreatMapper.queryAll(retreat));
        return retreatPageInfo;
    }

    @Override
    public void add(Retreat retreat) {
        retreat.setCreateTime(new Date());
        retreatMapper.insert(retreat);
    }

    @Override
    public Retreat setById(Integer id) {
        return retreatMapper.selectByPrimaryKey(id);
    }

    @Override
    public void update(Retreat retreat) {
        retreatMapper.updateByPrimaryKey(retreat);
    }

    @Override
    public void delById(Integer id) {
        retreatMapper.deleteByPrimaryKey(id);
    }
}
