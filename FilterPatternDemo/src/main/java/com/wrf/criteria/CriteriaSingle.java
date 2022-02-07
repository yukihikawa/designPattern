package com.wrf.criteria;

import com.wrf.domain.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: designPattern
 * @description: ¹ýÂËµ¥Éí
 * @author: Rifu Wu
 * @create: 2022-02-07 01:12
 **/
public class CriteriaSingle implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> singlePersons = new ArrayList<Person>();
        for (Person person : persons) {
            if(person.getMaritalStatus().equalsIgnoreCase("SINGLE")){
                singlePersons.add(person);
            }
        }
        return singlePersons;
    }
}