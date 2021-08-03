package org.apache.study.dao;

import org.apache.study.mybatis.User;

import java.util.List;

public interface UserMapper {

    List<User> getUserList();

    User getUserById(int id);

    int addUser(User user);

    int updateUser(User user);

    int deleteUser(int id);
}
