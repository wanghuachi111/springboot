package com.myspringboot.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.myspringboot.entity.User2;
import com.myspringboot.mapper.User2Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * @ProjectName: springboot
 * @Package: com.myspringboot.service
 * @ClassName: User2Service
 * @Author: Hasee
 * @Description:
 * @Date: 2020/11/25 20:43
 * @Version: 1.0
 */
@Service
public class User2Service {

    @Autowired
    private User2Mapper user2Mapper;

    @Transactional
    public void add(User2 user2) {
        user2Mapper.insert(user2);
    }

    @Transactional
    public void delete(Integer id) {
        if (user2Mapper.selectById(id)==null) {
            System.out.println("No found,please enter the right ID number");
        }
        user2Mapper.deleteById(id);
    }

    @Transactional
    public void update(User2 user2) {
        if (user2Mapper.selectById(user2.getId())==null) {
            System.out.println("No found,please enter the right ID number");
        }
        user2Mapper.updateById(user2);
    }

    @Transactional
    public List<User2> query(String name) {
        QueryWrapper<User2> wrapper = new QueryWrapper<>();
        if (!StringUtils.isEmpty(name)) {
            wrapper.like("name",name);
        }
        wrapper.orderByDesc("createtime");
        return user2Mapper.selectList(wrapper);
    }
}
