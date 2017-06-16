package com.example.service;

import com.example.repository.GirlRepository;
import com.example.domain.Girl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * @描述:
 * @创建者:许记山
 * @创建时间:2017/5/12 19:28
 * @修改者:
 * @修改时间:
 */
@Service
public class GirlService {
    @Autowired
    private GirlRepository girlRepository;
    @Transactional
    public void insertTwo(){
        Girl girlA=new Girl();
        girlA.setAge(19);
        girlA.setName("王昭君");
        girlRepository.save(girlA);
        Girl girlB=new Girl();
        girlB.setAge(29);
        girlB.setName("杨玉环");
        girlRepository.save(girlB);
    }
    public void getAge(Integer id) throws Exception{
        Girl girl=girlRepository.findOne(id);
        if (girl.getAge()<10){
            throw new Exception("你还是小学生！");
        }else if (girl.getAge()>10&&girl.getAge()<16){
            throw new Exception("你还在上初中");
        }
    }
}
