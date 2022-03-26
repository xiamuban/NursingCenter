package com.nursing.center.service;

import com.github.pagehelper.PageInfo;
import com.nursing.center.model.MealCalendar;

public interface CalendarService {
    PageInfo<MealCalendar> queryAll(MealCalendar calendar,Integer currPage);

    void add(MealCalendar calendar);
}
