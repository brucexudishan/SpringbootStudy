package com.example.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Min;

/**
 * @描述:
 * @创建者:许记山
 * @创建时间:2017/5/11 20:37
 * @修改者:
 * @修改时间:
 */
@Entity
public class Girl {

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    @Min(value=18,message="未成年少女禁止入内")
    private Integer age;
    public Girl(){
    }

    @Override
    public String toString() {
        return "Girl{"+
                "id="+id+
                ",age="+age+'\''+
                ",name="+name+'}';
    }
}
