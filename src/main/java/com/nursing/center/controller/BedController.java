package com.nursing.center.controller;

import com.nursing.center.model.Bed;
import com.nursing.center.service.BedService;
import com.nursing.center.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/bed")
public class BedController {
    @Autowired
    private BedService bedService;
    @RequestMapping("/all")
    public List<Bed> selectAll(){
        return bedService.selectAll();
    }

    @RequestMapping("/idleAll")
    public List<Bed> getIdleAll(){
        return bedService.getIdleAll();
    }

    /**
     * 根据床号ID 修改床位状态 1表示空闲 2表示占用 退住和入住是需求分别修改床位状态
     * @param id
     * @return
     */

    @RequestMapping("/checkIn/{id}")
    public ResultVO checkIn(@PathVariable Integer id){
        bedService.checkIn(id);
        return new ResultVO(200,"入住成功");
    }

    @RequestMapping("/withdraw/{id}")
    public ResultVO withdraw(@PathVariable Integer id){
        bedService.withdraw(id);
        return new ResultVO(200,"退住成功");
    }
}
