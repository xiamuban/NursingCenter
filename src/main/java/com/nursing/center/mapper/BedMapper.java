package com.nursing.center.mapper;

import com.nursing.center.model.Bed;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BedMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Bed record);

    Bed selectByPrimaryKey(Integer id);

    List<Bed> selectAll();

    int updateByPrimaryKey(Bed record);

    List<Bed> setIdleAll();

    void checkIn(Integer id);

    void withdraw(Integer id);
}