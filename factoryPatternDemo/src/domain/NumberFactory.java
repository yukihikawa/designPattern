/*
 *  Copyright(c) 2022
 *    ��Ŀ����:Java-learning
 *    �ļ�����:NumberFactory.java
 *    Date:2022/1/29 ����5:17
 *    Author: wrf
 *
 * �����ӿ�
 */

package domain;

public interface NumberFactory {
    Number Parse(String s);

    static NumberFactory impl = new NumberFactoryImpl();

    static NumberFactory getFactory(){
        return impl;
    }
}
