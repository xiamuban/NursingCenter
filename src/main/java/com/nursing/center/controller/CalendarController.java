package com.nursing.center.controller;

import com.github.pagehelper.PageInfo;
import com.nursing.center.model.Customer;
import com.nursing.center.model.MealCalendar;
import com.nursing.center.service.CalendarService;
import com.nursing.center.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calendar")
public class CalendarController {
    @Autowired
    private CalendarService calendarService;

    @RequestMapping("/queryAll/{currPage}")
    public PageInfo<MealCalendar> queryAll(@RequestBody MealCalendar calendar, @PathVariable Integer currPage){
        return calendarService.queryAll(calendar,currPage);
    }

    @RequestMapping("/add")
    public ResultVO<MealCalendar> add(@RequestBody MealCalendar mealCalendar){
        calendarService.add(mealCalendar);
        return new ResultVO<>(200,"添加成功");
    }
}
