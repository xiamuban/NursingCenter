package com.nursing.center.mapper;

import com.nursing.center.model.CustFood;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CustFoodMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CustFood record);

    CustFood selectByPrimaryKey(Integer id);

    List<CustFood> selectAll();

    int updateByPrimaryKey(CustFood record);
}