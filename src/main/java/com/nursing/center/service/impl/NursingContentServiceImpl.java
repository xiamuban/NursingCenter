package com.nursing.center.service.impl;

import com.nursing.center.mapper.NursingContentMapper;
import com.nursing.center.mapper.NursingLevelMapper;
import com.nursing.center.model.NursingContent;
import com.nursing.center.model.NursingLevel;
import com.nursing.center.service.NursingContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NursingContentServiceImpl implements NursingContentService {
    @Autowired
    private NursingContentMapper contentMapper;

    @Autowired
    private NursingLevelMapper levelMapper;

    @Override
    public void add(NursingContent content) {
        NursingLevel level = levelMapper.selById(content.getLevelId());
        content.setName("(" + level.getLevelName() + ")" + content.getName());
        contentMapper.insert(content);
    }

    @Override
    public List<NursingContent> selectAll() {
        return contentMapper.selectAll();
    }

    @Override
    public List<NursingContent> getAll(Integer id) {
        return contentMapper.getAll(id);
    }

    @Override
    public void delById(Integer id) {
        contentMapper.deleteByPrimaryKey(id);
    }
}
