package com.nursing.center.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.nursing.center.mapper.FoodMapper;
import com.nursing.center.model.Food;
import com.nursing.center.service.FoodService;
import com.nursing.center.util.Define;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodServiceImpl implements FoodService {
    @Autowired
    private FoodMapper foodMapper;
    @Override
    public PageInfo<Food> queryAll(Food food, Integer currPage) {
        if (currPage == null) currPage = 1;
        PageHelper.startPage(currPage, Define.DEFAULT_PAGE_SIZE);
        PageInfo<Food> foodPageInfo = new PageInfo<>(foodMapper.queryAll(food));
        return foodPageInfo;
    }

    @Override
    public void add(Food food) {
        foodMapper.insert(food);
    }

    @Override
    public void delById(Integer id) {
        foodMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Food selById(Integer id) {
        return foodMapper.selectByPrimaryKey(id);
    }

    @Override
    public void update(Food food) {
        foodMapper.updateByPrimaryKey(food);
    }

    @Override
    public List<Food> selectAll() {
        return foodMapper.selectAll();
    }
}
