package com.nursing.center.service;

import com.github.pagehelper.PageInfo;
import com.nursing.center.model.Customer;
import com.nursing.center.vo.CustomerStatistics;

import java.util.List;

public interface CustomerService {
    PageInfo<Customer> queryAll(Customer customer, Integer currPage);

    List<Customer> selectAll();

    void add(Customer customer);

    Customer selById(Integer id);

    void update(Customer customer);

    void delById(Integer id);

    void withdraw(Integer id);

    List<CustomerStatistics> selMonthNum(Integer year);
}
