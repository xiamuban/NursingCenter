package com.nursing.center.controller;

import com.github.pagehelper.PageInfo;
import com.nursing.center.model.Customer;
import com.nursing.center.service.CustomerService;
import com.nursing.center.vo.CustomerStatistics;
import com.nursing.center.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @RequestMapping("/getAll")
    public List<Customer> selectAll(){
        return customerService.selectAll();
    }

    @RequestMapping("/queryAll/{currPage}")
    public PageInfo<Customer> queryAll(@RequestBody Customer customer, @PathVariable Integer currPage){
        return customerService.queryAll(customer,currPage);
    }

    @RequestMapping("/add")
    public ResultVO<Customer> add(@RequestBody Customer customer){
        customerService.add(customer);
        return new ResultVO<>(200,"添加成功");
    }

    @RequestMapping("/delete/{id}")
    public ResultVO delete(@PathVariable Integer id){
        customerService.delById(id);
        return new ResultVO(200,"删除成功");
    }

    @RequestMapping("/update")
    public ResultVO<Customer> update(@RequestBody Customer customer){
        customerService.update(customer);
        return new ResultVO<>(200,"修改成功");
    }

    @RequestMapping("/get/{id}")
    public Customer setById(@PathVariable Integer id){
        return customerService.selById(id);
    }

    @RequestMapping("/withdraw/{id}")
    public ResultVO withdraw(@PathVariable Integer id){
        customerService.withdraw(id);
        return new ResultVO(200,"退住成功");
    }

    @RequestMapping("/queryMonthNum/{year}")//统计某一年的客户信息
    public List<CustomerStatistics> queryMonthNum(@PathVariable  Integer year){
        return customerService.selMonthNum(year);
    }

}
