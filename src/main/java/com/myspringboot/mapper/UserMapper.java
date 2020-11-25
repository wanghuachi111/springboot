package com.myspringboot.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.myspringboot.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper extends BaseMapper<User> {
}
