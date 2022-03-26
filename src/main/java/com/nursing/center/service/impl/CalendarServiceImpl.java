package com.nursing.center.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.nursing.center.mapper.CustFoodMapper;
import com.nursing.center.mapper.MealCalendarMapper;
import com.nursing.center.model.CustFood;
import com.nursing.center.model.MealCalendar;
import com.nursing.center.service.CalendarService;
import com.nursing.center.util.Define;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class CalendarServiceImpl implements CalendarService {
    @Autowired
    private MealCalendarMapper calendarMapper;

    @Autowired
    private CustFoodMapper custFoodMapper;

    @Override
    public PageInfo<MealCalendar> queryAll(MealCalendar calendar, Integer currPage) {
        if (currPage == null) currPage = 1;
        PageHelper.startPage(currPage, Define.DEFAULT_PAGE_SIZE);
        PageInfo<MealCalendar> calendarPageInfo = new PageInfo<>(calendarMapper.queryAll(calendar));
        return calendarPageInfo;
    }

    @Override
    public void add(MealCalendar calendar) {
        CustFood custFood = calendar.getCustFood();
        custFood.setAddDate(new Date());
        custFoodMapper.insert(custFood);

        calendar.setCustfoodId(custFood.getId());
        calendar.setAddDate(new Date());
        calendarMapper.insert(calendar);
    }
}
