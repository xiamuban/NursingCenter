package com.nursing.center.service;

import com.github.pagehelper.PageInfo;
import com.nursing.center.model.Food;

import java.util.List;

public interface FoodService {
    PageInfo<Food> queryAll(Food food,Integer currPage);

    void add(Food food);

    void delById(Integer id);

    Food selById(Integer id);

    void update(Food food);

    List<Food> selectAll();
}
