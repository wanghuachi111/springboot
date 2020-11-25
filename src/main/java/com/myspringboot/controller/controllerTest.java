//package com.myspringboot.controller;
//
//import com.myspringboot.entity.User;
//import com.myspringboot.mapper.UserMapper;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//
//
//@RestController
//@RequestMapping("controllertest")
//public class controllerTest {
//
//    @Autowired
//    private UserMapper userMapper;
//
//    @GetMapping("test1")
//    public String test() {
//        userMapper.selectList(null).forEach(System.out::println);
//        System.out.println("1.test1 has been used.");
//        return "test accomplished";
//
//    }
//
//    @GetMapping("test2")
//    public String save() {
//        User user = new User();
//        user.setId(8);
//        user.setAge(18);
//        user.setName("彭十一");
//        userMapper.insert(user);
//        System.out.println(user);
//        System.out.println("2.test2 has been used.");
//        return "test passed";
//    }
//
//    @GetMapping("test3")
//    public String update() {
//        User user1 = userMapper.selectById(7);
//        user1.setAge(20);
//        userMapper.updateById(user1);
//        System.out.println("3.test3 has been used.");
//        return "test finished";
//
//    }
//
//
//
//}
