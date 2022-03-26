package com.nursing.center.service;

import com.github.pagehelper.PageInfo;
import com.nursing.center.model.NursingLevel;

import java.util.List;

public interface NursingLevelService {
    PageInfo<NursingLevel> queryAll(NursingLevel nursingLevel,Integer currPage);

    List<NursingLevel> selectAll();

    void add(NursingLevel nursingLevel);

    void delById(Integer id);

    void update(NursingLevel nursingLevel);

    NursingLevel loadById(Integer id);
}
