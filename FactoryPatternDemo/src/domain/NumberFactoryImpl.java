/*
 *  Copyright(c) 2022
 *    ��Ŀ����:Java-learning
 *    �ļ�����:NumberFactoryImpl.java
 *    Date:2022/1/29 ����5:19
 *    Author: wrf
 */

package domain;

import java.math.BigDecimal;

/**
 * @program: Java-learning
 * @description: ������ʵ����
 * @author: Rifu Wu
 * @create: 2022-01-29 17:18
 **/
public class NumberFactoryImpl implements NumberFactory{

    @Override
    public Number Parse(String s) {
        return new BigDecimal(s);
    }
}