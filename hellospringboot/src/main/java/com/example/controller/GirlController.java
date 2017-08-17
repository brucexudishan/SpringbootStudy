package com.example.controller;

import com.example.domain.Result;
import com.example.repository.GirlRepository;
import com.example.service.GirlService;
import com.example.domain.Girl;
import com.example.utils.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * @描述:
 * @创建者:许记山
 * @创建时间:2017/5/11 21:20
 * @修改者:
 * @修改时间:
 */
@RestController
public class GirlController {
    @Autowired
    private GirlRepository girlRepository;
    @Autowired
    private GirlService girlService;
    @GetMapping(value = "/girls")
    public List<Girl>gilrList(){
        return girlRepository.findAll();
    }

    /**
     * 添加Girl
     * @param girl
     * @return
     */
    @PostMapping(value = "/girls")
    public Result<Girl> girlAdd(@Valid Girl girl,BindingResult bindingResult){
        if (bindingResult.hasErrors()){
            Result result=ResultUtil.error(1, bindingResult.getFieldError().getDefaultMessage());
            return result;
        }
        girl.setAge(girl.getAge());
        girl.setName(girl.getName());
        return ResultUtil.succes(girlRepository.save(girl));
    }

    /**
     * 根据ID获取Girl对象
     * @param id
     * @return
     */
    @GetMapping(value = "/girls/{id}")
    public Girl getGirl(@PathVariable("id") Integer id){
        return girlRepository.findOne(id);
    }
    @PutMapping(value="/girls/{id}")
    public Girl girlUpdate(@PathVariable("id") Integer id,
                           @RequestParam("age") Integer age,
                           @RequestParam("name") String name){
        Girl girl=new Girl();
        girl.setId(id);
        girl.setAge(age);
        girl.setName(name);
        return girlRepository.save(girl);
    }

    /**
     * 通过ID删除
     * @param id
     */
    @DeleteMapping(value="/girls/{id}")
    public void girlDelete(@PathVariable("id") Integer id){
        girlRepository.delete(id);
    }

    /**
     * 通过年龄查询
     * @param age
     * @return
     */
    @GetMapping(value="/girls/age/{age}")
    public List<Girl> girlsByAge(@PathVariable("age") Integer age){
        return girlRepository.findByAge(age);
    }

    /**
     * 插入两行数据
     */
    @PostMapping(value = "/girls/two")
    public void insertTwoGirls(){
        girlService.insertTwo();
    }

    @GetMapping(value = "girls/getAge/{id}")
    public void getAge(@PathVariable("id") Integer id)throws Exception{
        girlService.getAge(id);

    }
}
