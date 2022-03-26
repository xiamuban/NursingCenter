package com.nursing.center.mapper;

import com.nursing.center.model.NursingContent;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface NursingContentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(NursingContent record);

    NursingContent selectByPrimaryKey(Integer id);

    List<NursingContent> selectAll();

    List<NursingContent> getAll(Integer id);

    int updateByPrimaryKey(NursingContent record);
}