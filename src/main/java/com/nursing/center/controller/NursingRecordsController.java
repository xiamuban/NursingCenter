package com.nursing.center.controller;

import com.github.pagehelper.PageInfo;
import com.nursing.center.model.NursingRecords;
import com.nursing.center.service.NursingRecordsService;
import com.nursing.center.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/nursingRecords")
public class NursingRecordsController {
    @Autowired
    private NursingRecordsService recordsService;
    @RequestMapping("/add")
    public ResultVO<NursingRecords> add(@RequestBody NursingRecords record){
        recordsService.add(record);
        return new ResultVO<>(200,"添加成功");
    }

    @RequestMapping("/queryAll/{currPage}")
    public PageInfo<NursingRecords> queryAll(@RequestBody NursingRecords nursingRecord, @PathVariable Integer currPage){
        return recordsService.queryAll(nursingRecord,currPage);
    }

    @RequestMapping("/delete/{id}")
    public ResultVO delete(@PathVariable Integer id){
        recordsService.delById(id);
        return new ResultVO(200,"删除成功");
    }

}
