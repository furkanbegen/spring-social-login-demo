package com.furkanbegen.springsociallogindemo.mapper;

import com.furkanbegen.springsociallogindemo.dto.UserDto;
import com.furkanbegen.springsociallogindemo.model.User;

public interface UserMapper {

    UserDto toUserDto(User user);
}