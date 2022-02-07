/*
 *  Copyright(c) 2022
 *    项目名称:Java-learning
 *    文件名称:Wrapper.java
 *    Date:2022/1/30 下午3:38
 *    Author: wrf
 */

package domain;

/**
 * @program: Java-learning
 * @description: 实现Packing接口，包装纸
 * @author: Rifu Wu
 * @create: 2022-01-30 15:38
 **/
public class Wrapper implements Packing{
    @Override
    public String pack() {
        return "Wrapper";
    }
}