package com.nursing.center.mapper;

import com.nursing.center.model.MealCalendar;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface MealCalendarMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MealCalendar record);

    MealCalendar selectByPrimaryKey(Integer id);

    List<MealCalendar> selectAll();

    int updateByPrimaryKey(MealCalendar record);

    List<MealCalendar> queryAll(MealCalendar calendar);
}