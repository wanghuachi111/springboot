package com.myspringboot.service;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.myspringboot.entity.User;
import com.myspringboot.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    @Transactional
    public void add(User user) {
        userMapper.insert(user);
    }

    @Transactional
    public void delete(Integer id) {
        if (userMapper.selectById(id) == null) {
            System.out.println("Error, there maybe a wrong id number");
        }

        userMapper.deleteById(id);
    }

    @Transactional
    public void update(User user) {
        if (userMapper.selectById(user.getId())==null) {
            System.out.println("Error,there maybe a wrong id number");
        }
        userMapper.updateById(user);
    }

    @Transactional
    public List<User> query(String name) {

        QueryWrapper<User> wrapper = new QueryWrapper<>();
        if (!StringUtils.isEmpty(name)) {
            wrapper.like("name",name);
        }

        wrapper.orderByDesc("createtime");
        return userMapper.selectList(wrapper);
    }

}
