package com.nursing.center.mapper;

import com.nursing.center.model.NursingRecords;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface NursingRecordsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(NursingRecords record);

    NursingRecords selectByPrimaryKey(Integer id);

    List<NursingRecords> selectAll();

    int updateByPrimaryKey(NursingRecords record);

    List<NursingRecords> queryAll(NursingRecords nursingRecords);
}