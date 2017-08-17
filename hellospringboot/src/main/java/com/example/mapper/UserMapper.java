package com.example.mapper;

import com.example.domain.User;

import java.util.List;

/**
 * @描述:
 * @创建者:许记山
 * @创建时间:2017/6/17 21:53
 * @修改者:
 * @修改时间:
 */
public interface UserMapper {
    List<User> getAll();

    User getOne(Long id);

    void insert(User user);

    void update(User user);

    void delete(Long id);
}
