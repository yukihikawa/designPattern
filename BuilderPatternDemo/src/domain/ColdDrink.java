/*
 *  Copyright(c) 2022
 *    ��Ŀ����:Java-learning
 *    �ļ�����:ColdDrink.java
 *    Date:2022/1/30 ����4:16
 *    Author: wrf
 */

package domain;

/**
 * @program: Java-learning
 * @description: ʵ��Item�ӿڵĳ����࣬�ṩĬ�Ϲ���
 * @author: Rifu Wu
 * @create: 2022-01-30 16:16
 **/
public abstract class ColdDrink implements Item{
    @Override
    public Bottle packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}