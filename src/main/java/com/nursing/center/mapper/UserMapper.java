package com.nursing.center.mapper;

import com.nursing.center.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    User selectByPrimaryKey(Integer id);

    List<User> selectAll();

    List<User> getAll(Integer id);

    int updateByPrimaryKey(User record);

    User selectByUserName(String name);
}