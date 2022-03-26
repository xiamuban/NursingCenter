package com.nursing.center.mapper;

import com.nursing.center.model.Customer;
import com.nursing.center.vo.CustomerStatistics;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CustomerMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Customer record);

    Customer selectByPrimaryKey(Integer id);

    List<Customer> selectAll();

    int updateByPrimaryKey(Customer record);

    List<Customer> queryAll(Customer customer);

    void withdraw(Integer id);

    List<CustomerStatistics> selMonthNum(Integer year);
}