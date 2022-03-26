package com.nursing.center.mapper;

import com.nursing.center.model.Retreat;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface RetreatMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Retreat record);

    Retreat selectByPrimaryKey(Integer id);

    List<Retreat> selectAll();

    int updateByPrimaryKey(Retreat record);

    List<Retreat> queryAll(Retreat retreat);

    void updateStatus(Retreat retreat);

    Retreat selById(Integer id);
}