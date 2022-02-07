package com.wrf.criteria;

import com.wrf.domain.Person;

import java.util.List;

/**
 * @program: designPattern
 * @description: 标准的接口
 * @author: Rifu Wu
 * @create: 2022-02-07 01:03
 **/
public interface Criteria {
    public List<Person> meetCriteria(List<Person> persons);
}