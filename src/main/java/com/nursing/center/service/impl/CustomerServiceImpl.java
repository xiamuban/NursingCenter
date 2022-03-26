package com.nursing.center.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.nursing.center.mapper.BedMapper;
import com.nursing.center.mapper.CustomerMapper;
import com.nursing.center.model.Customer;
import com.nursing.center.service.CustomerService;
import com.nursing.center.util.Define;
import com.nursing.center.vo.CustomerStatistics;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerMapper customerMapper;
    @Autowired
    private BedMapper bedMapper;
    @Override
    public PageInfo<Customer> queryAll(Customer customer, Integer currPage) {
        if (currPage == null) currPage = 1;
        PageHelper.startPage(currPage, Define.DEFAULT_PAGE_SIZE);
        PageInfo<Customer> customerPageInfo = new PageInfo<>(customerMapper.queryAll(customer));
        return customerPageInfo;
    }

    @Override
    public List<Customer> selectAll() {
        return customerMapper.selectAll();
    }

    @Override
    public void add(Customer customer) {
        customer.setCheckinDate(new Date());
        customer.setBloodType("B");
        customer.setHeight("162");
        customer.setWeight("128");
        customer.setIsDeleted(0);
        customer.setMaritalStatus("1");
        customer.setPsychosomaticState("1");
        customer.setRoomNumber(502);
        customerMapper.insert(customer);
    }

    @Override
    public Customer selById(Integer id) {
        return customerMapper.selectByPrimaryKey(id);
    }

    @Override
    public void update(Customer customer) {
        customerMapper.updateByPrimaryKey(customer);
    }

    @Override
    public void delById(Integer id) {
        customerMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void withdraw(Integer id) {
        customerMapper.withdraw(id);
    }

    @Override
    public List<CustomerStatistics> selMonthNum(Integer year) {
        return customerMapper.selMonthNum(year);
    }
}
