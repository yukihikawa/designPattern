package com.wrf.criteria;

import com.wrf.domain.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: designPattern
 * @description: Criteria接口的实体类
 * @author: Rifu Wu
 * @create: 2022-02-07 01:05
 **/
public class CriteriaMale implements Criteria{
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> malePersons = new ArrayList<Person>();
        for(Person person : persons){
            if(person.getGender().equalsIgnoreCase("MALE"))
                malePersons.add(person);
        }
        return malePersons;
    }
}