package com.wrf.criteria;

import com.wrf.domain.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: designPattern
 * @description: ʵ��criteria������Ů��
 * @author: Rifu Wu
 * @create: 2022-02-07 01:11
 **/
public class CriteriaFemale implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> femalePersons = new ArrayList<Person>();
        for (Person person : persons) {
            if(person.getGender().equalsIgnoreCase("FEMALE")){
                femalePersons.add(person);
            }
        }
        return femalePersons;
    }
}