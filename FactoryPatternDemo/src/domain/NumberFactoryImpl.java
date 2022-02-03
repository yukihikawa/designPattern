/*
 *  Copyright(c) 2022
 *    项目名称:Java-learning
 *    文件名称:NumberFactoryImpl.java
 *    Date:2022/1/29 下午5:19
 *    Author: wrf
 */

package domain;

import java.math.BigDecimal;

/**
 * @program: Java-learning
 * @description: 工厂的实现类
 * @author: Rifu Wu
 * @create: 2022-01-29 17:18
 **/
public class NumberFactoryImpl implements NumberFactory{

    @Override
    public Number Parse(String s) {
        return new BigDecimal(s);
    }
}