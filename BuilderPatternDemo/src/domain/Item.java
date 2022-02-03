/*
 *  Copyright(c) 2022
 *    项目名称:Java-learning
 *    文件名称:Item.java
 *    Date:2022/1/30 下午3:37
 *    Author: wrf
 */

/**
 * @program: Java-learning
 * @description:食物条目
 * @author: Rifu Wu
 * @create: 2022-01-30 15:35
 **/
package domain;

public interface Item {
    public String name();

    public Bottle packing();

    public float price();
}
