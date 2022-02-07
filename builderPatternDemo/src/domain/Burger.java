/*
 *  Copyright(c) 2022
 *    ��Ŀ����:Java-learning
 *    �ļ�����:Burger.java
 *    Date:2022/1/30 ����3:54
 *    Author: wrf
 */

package domain;

/**
 * @program: Java-learning
 * @description: ʵ��Item�ӿڵĳ����࣬�ṩĬ�Ϲ���
 * @author: Rifu Wu
 * @create: 2022-01-30 15:50
 **/
public abstract class Burger implements Item{
    @Override
    public Bottle packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}