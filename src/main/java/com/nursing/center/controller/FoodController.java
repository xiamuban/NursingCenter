package com.nursing.center.controller;

import com.github.pagehelper.PageInfo;
import com.nursing.center.model.Food;
import com.nursing.center.service.FoodService;
import com.nursing.center.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/food")
public class FoodController {
    @Autowired
    private FoodService foodService;

    @RequestMapping("/queryAll/{currPage}")
    public PageInfo<Food> queryAll(@RequestBody Food food, @PathVariable Integer currPage){
        return foodService.queryAll(food,currPage);
    }

    @RequestMapping("/getAll")
    public List<Food> selectAll(){
        return foodService.selectAll();
    }

    @RequestMapping("/add")
    public ResultVO<Food> add(@RequestBody Food food){
        foodService.add(food);
        return new ResultVO<>(200,"添加成功");
    }

    @RequestMapping("/delete/{id}")
    public ResultVO delete(@PathVariable Integer id){
        foodService.delById(id);
        return new ResultVO(200,"删除成功");
    }

    @RequestMapping("/update")
    public ResultVO<Food> update(@RequestBody Food food){
        foodService.update(food);
        return new ResultVO<>(200,"修改成功");
    }

    @RequestMapping("/get/{id}")
    public Food setById(@PathVariable Integer id){
        return foodService.selById(id);
    }
}
