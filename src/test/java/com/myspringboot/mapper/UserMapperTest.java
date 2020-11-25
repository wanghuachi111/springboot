package com.myspringboot.mapper;

import com.myspringboot.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class UserMapperTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    void test() {
        userMapper.selectList(null).forEach(System.out::println);
    }

    @Test
    void save() {
        User user = new User();
        user.setId(8);
        user.setAge(18);
        user.setName("彭十一");
        userMapper.insert(user);
        System.out.println(user);
    }

    @Test
    void update() {
        User user1 = userMapper.selectById(7);
        user1.setAge(20);
        userMapper.updateById(user1);
    }
}