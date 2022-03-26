package com.nursing.center.mapper;

import com.nursing.center.model.Outgoing;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface OutgoingMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Outgoing record);

    Outgoing selectByPrimaryKey(Integer id);

    List<Outgoing> selectAll();

    int updateByPrimaryKey(Outgoing record);
}