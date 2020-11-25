package com.myspringboot.controller;

import com.myspringboot.entity.User2;
import com.myspringboot.mapper.User2Mapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;



@SpringBootTest
class controller2TestTest {

    @Autowired
    private User2Mapper user2Mapper;

    @Test
    public void add() {
        User2 user2= new User2();
        user2.setId(5);
        user2.setName("Honey");
        user2.setSex("WOMAN");
        user2Mapper.insert(user2);
    }


}