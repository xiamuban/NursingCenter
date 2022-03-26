package com.nursing.center.service.impl;

import com.nursing.center.mapper.UserMapper;
import com.nursing.center.model.User;
import com.nursing.center.service.UserService;
import com.nursing.center.util.JwtUtil;
import com.nursing.center.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    /**
     * status: 0 用户名不存在 1 密码错误 2 登录成功
     *
     * @param user
     * @return
     */

    @Override
    public ResultVO<User> login(User user) {
        int status;
        ResultVO<User> resultVO = new ResultVO();
        User checkUser = userMapper.selectByUserName(user.getUsername());
        if (checkUser != null) {
            if (checkUser.getPassword().equals(user.getPassword())) {
                status = 2;
                //生成token
                String token = JwtUtil.sign(checkUser.getUsername());
                resultVO.setMessage(token);
                resultVO.setObj(checkUser);
            } else {
                status = 1;
            }
        } else {
            status = 0;
        }
        resultVO.setStatus(status);
        return resultVO;
    }

    @Override
    public List<User> selectAll(Integer id) {//获取所以护工信息
        return userMapper.getAll(id);
    }

}
