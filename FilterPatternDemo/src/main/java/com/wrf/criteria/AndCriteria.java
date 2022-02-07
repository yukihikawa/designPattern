package com.wrf.criteria;

import com.wrf.domain.Person;

import java.util.List;

/**
 * @program: designPattern
 * @description: ”ÎπÊ‘Ú
 * @author: Rifu Wu
 * @create: 2022-02-07 01:12
 **/
public class AndCriteria implements Criteria {

    private Criteria criteria;
    private Criteria otherCriteria;

    public AndCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> firstCriteriaPersons = criteria.meetCriteria(persons);
        return otherCriteria.meetCriteria(firstCriteriaPersons);
    }
}