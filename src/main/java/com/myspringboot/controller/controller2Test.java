package com.myspringboot.controller;

import com.myspringboot.entity.User2;
import com.myspringboot.mapper.User2Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ProjectName: try
 * @Package: com.myspringboot.controller
 * @ClassName: controller2Test
 * @Author: Hasee
 * @Description:
 * @Date: 2020/11/24 17:09
 * @Version: 1.0
 */

@RestController
@RequestMapping("controller2test")
public class controller2Test {

    @Autowired
    private User2Mapper user2Mapper;

    @GetMapping("test1")
    public String add() {

        User2 user2 = new User2();
        user2.setId(4);
        user2.setName("JOHNY");
        user2.setSex("MAN");
        user2Mapper.insert(user2);
        System.out.println("Test1");
    }
}
