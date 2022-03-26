package com.nursing.center.mapper;

import com.nursing.center.model.Verify;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface VerifyMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Verify record);

    Verify selectByPrimaryKey(Integer id);

    List<Verify> selectAll();

    int updateByPrimaryKey(Verify record);
}