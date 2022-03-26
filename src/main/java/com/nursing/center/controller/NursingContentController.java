package com.nursing.center.controller;

import com.nursing.center.model.NursingContent;
import com.nursing.center.service.NursingContentService;
import com.nursing.center.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/nursingContent")
public class NursingContentController {
    @Autowired
    private NursingContentService contentService;

    @RequestMapping("/getAll")
    public List<NursingContent> selectAll(){
        return contentService.selectAll();
    }

    @RequestMapping("/getContents/{id}")
    public List<NursingContent> getContents(@PathVariable Integer id){
        return contentService.getAll(id);
    }

    @RequestMapping("/add")
    public ResultVO<NursingContent> add(@RequestBody NursingContent content){
        contentService.add(content);
        return new ResultVO<>(200,"添加成功");
    }

    @RequestMapping("/delete/{id}")
    public ResultVO delete(@PathVariable Integer id){
        contentService.delById(id);
        return new ResultVO(200,"删除成功");
    }
}
