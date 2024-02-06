package com.furkanbegen.springsociallogindemo.mapper.impl;

import com.furkanbegen.springsociallogindemo.dto.UserDto;
import com.furkanbegen.springsociallogindemo.mapper.UserMapper;
import com.furkanbegen.springsociallogindemo.model.User;

import org.springframework.stereotype.Service;

@Service
public class UserMapperImpl implements UserMapper {

    @Override
    public UserDto toUserDto(User user) {
        if (user == null) {
            return null;
        }
        return new UserDto(user.getId(), user.getUsername(), user.getName(), user.getEmail(), user.getRole());
    }
}
