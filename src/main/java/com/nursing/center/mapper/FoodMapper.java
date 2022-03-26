package com.nursing.center.mapper;

import com.nursing.center.model.Food;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FoodMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Food record);

    Food selectByPrimaryKey(Integer id);

    List<Food> selectAll();

    int updateByPrimaryKey(Food record);

    List<Food> queryAll(Food food);
}