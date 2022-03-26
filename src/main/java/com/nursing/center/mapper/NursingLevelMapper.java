package com.nursing.center.mapper;

import com.nursing.center.model.NursingLevel;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface NursingLevelMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(NursingLevel record);

    NursingLevel selectByPrimaryKey(Integer id);

    List<NursingLevel> selectAll();

    int updateByPrimaryKey(NursingLevel record);

    List<NursingLevel> queryAll(NursingLevel nursingLevel);

    NursingLevel selById(Integer id);

}