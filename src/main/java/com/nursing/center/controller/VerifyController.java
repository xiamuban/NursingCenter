package com.nursing.center.controller;

import com.nursing.center.model.Verify;
import com.nursing.center.service.VerifyService;
import com.nursing.center.vo.ResultVO;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/verify")
public class VerifyController {

    @Resource
    private VerifyService verifyService;

    @RequestMapping("add")
    public ResultVO<Verify> add(@RequestBody Verify verify){
        verifyService.add(verify);
        return new ResultVO<Verify>(200,"审核成功");
    }
}
