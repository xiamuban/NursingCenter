package com.nursing.center.service;

import com.nursing.center.model.User;
import com.nursing.center.vo.ResultVO;

import java.util.List;

public interface UserService {
    ResultVO<User> login(User user);

    List<User> selectAll(Integer id);
}
