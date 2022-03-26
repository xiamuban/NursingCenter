package com.nursing.center.controller;

import com.github.pagehelper.PageInfo;
import com.nursing.center.model.Retreat;
import com.nursing.center.service.RetreatService;
import com.nursing.center.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/retreat")
public class RetreatController {
    @Autowired
    private RetreatService retreatService;

    @RequestMapping("loadById/{id}")
    public Retreat loadById(@PathVariable Integer id){
        return retreatService.loadById(id);
    }

    @RequestMapping("/queryAll/{currPage}")
    public PageInfo<Retreat> queryAll(@RequestBody Retreat retreat, @PathVariable Integer currPage){
        return retreatService.queryAll(retreat,currPage);
    }

    @RequestMapping("/add")
    public ResultVO<Retreat> add(@RequestBody Retreat retreat){
        retreatService.add(retreat);
        return new ResultVO<>(200,"添加成功");
    }

    @RequestMapping("/delete/{id}")
    public ResultVO delete(@PathVariable Integer id){
        retreatService.delById(id);
        return new ResultVO(200,"删除成功");
    }

    @RequestMapping("/update")
    public ResultVO<Retreat> update(@RequestBody Retreat retreat){
        retreatService.update(retreat);
        return new ResultVO<>(200,"修改成功");
    }

    @RequestMapping("/get/{id}")
    public Retreat setById(@PathVariable Integer id){
        return retreatService.setById(id);
    }
}
