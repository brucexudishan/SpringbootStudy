package com.example.mapper;

import com.example.domain.PDAUser;

import java.util.List;

/**
 * @描述:
 * @创建者:许记山
 * @创建时间:2017/7/31 21:25
 * @修改者:
 * @修改时间:
 */
public interface PDAUserMapper {
    List<PDAUser> getAllPDAUser();
    PDAUser getOne(Long id);
}
