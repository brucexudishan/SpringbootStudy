package com.example.repository;

import com.example.domain.Girl;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @描述:
 * @创建者:许记山
 * @创建时间:2017/5/11 21:23
 * @修改者:
 * @修改时间:
 */
public interface GirlRepository extends JpaRepository<Girl,Integer> {
    public List<Girl> findByAge(Integer age);
}
