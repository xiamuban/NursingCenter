package com.nursing.center.service;

import com.github.pagehelper.PageInfo;
import com.nursing.center.model.Retreat;

public interface RetreatService {
    Retreat loadById(Integer id);

    PageInfo<Retreat> queryAll(Retreat retreat, Integer currPage);

    void add(Retreat retreat);

    Retreat setById(Integer id);

    void update(Retreat retreat);

    void delById(Integer id);
}
