/*
 *  Copyright(c) 2022
 *    项目名称:Java-learning
 *    文件名称:NumberFactory.java
 *    Date:2022/1/29 下午5:17
 *    Author: wrf
 *
 * 工厂接口
 */

package domain;

public interface NumberFactory {
    Number Parse(String s);

    static NumberFactory impl = new NumberFactoryImpl();

    static NumberFactory getFactory(){
        return impl;
    }
}
