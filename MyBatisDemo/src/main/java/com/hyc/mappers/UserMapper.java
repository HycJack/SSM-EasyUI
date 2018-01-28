package com.hyc.mappers;

import com.hyc.domain.User;
import com.hyc.domain.User;

import java.util.List;

/**
 * Created by Jack on 2018-01-28.
 */
public interface UserMapper {
    List<User> findAllUsers();
    User findUserById(Integer id);
    void insertUser(User User);
}
