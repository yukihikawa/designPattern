/*
 *  Copyright(c) 2022
 *    项目名称:Java-learning
 *    文件名称:FactoryProducer.java
 *    Date:2022/1/29 下午10:53
 *    Author: wrf
 */

package factory;/*
 *  Copyright(c) 2022
 *    项目名称:Java-learning
 *    文件名称:factory.FactoryProducer.java
 *    Date:2022/1/29 下午10:50
 *    Author: wrf
 */

import factory.AbstractFactory;
import factory.ColorFactory;
import factory.ShapeFactory;

import java.util.Locale;

/**
 * @program: Java-learning
 * @description: 工厂生成类
 * @author: Rifu Wu
 * @create: 2022-01-29 22:50
 **/
public class FactoryProducer {
    public static AbstractFactory getFactory(String choice){
        switch (choice.toUpperCase(Locale.ROOT)){
            case "SHAPE":
                return new ShapeFactory();
            case "COLOR":
                return new ColorFactory();
            default:
                return null;
        }

    }

}