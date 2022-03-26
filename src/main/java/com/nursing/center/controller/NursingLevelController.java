package com.nursing.center.controller;

import com.github.pagehelper.PageInfo;
import com.nursing.center.model.Customer;
import com.nursing.center.model.NursingLevel;
import com.nursing.center.service.NursingLevelService;
import com.nursing.center.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/nursingLevel")
public class NursingLevelController {
    @Autowired
    private NursingLevelService nursingLevelService;

    @RequestMapping("/getAll")
    public List<NursingLevel> selectAll(){
        return nursingLevelService.selectAll();
    }

    @RequestMapping("/queryAll/{currPage}")
    public PageInfo<NursingLevel> queryAll(@RequestBody NursingLevel nursingLevel, @PathVariable Integer currPage){
        return nursingLevelService.queryAll(nursingLevel,currPage);
    }

    @RequestMapping("loadById/{id}")
    public NursingLevel loadById(@PathVariable Integer id){
        return nursingLevelService.loadById(id);
    }

    @RequestMapping("/add")
    public ResultVO<NursingLevel> add(@RequestBody NursingLevel nursingLevel){
        nursingLevelService.add(nursingLevel);
        return new ResultVO<>(200,"添加成功");
    }

    @RequestMapping("/delete/{id}")
    public ResultVO delete(@PathVariable Integer id){
        nursingLevelService.delById(id);
        return new ResultVO(200,"删除成功");
    }

    @RequestMapping("/update")
    public ResultVO<NursingLevel> update(@RequestBody NursingLevel nursingLevel){
        nursingLevelService.update(nursingLevel);
        return new ResultVO<>(200,"修改成功");
    }
}
