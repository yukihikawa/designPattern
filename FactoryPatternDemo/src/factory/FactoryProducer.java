/*
 *  Copyright(c) 2022
 *    ��Ŀ����:Java-learning
 *    �ļ�����:FactoryProducer.java
 *    Date:2022/1/29 ����10:53
 *    Author: wrf
 */

package factory;/*
 *  Copyright(c) 2022
 *    ��Ŀ����:Java-learning
 *    �ļ�����:factory.FactoryProducer.java
 *    Date:2022/1/29 ����10:50
 *    Author: wrf
 */

import factory.AbstractFactory;
import factory.ColorFactory;
import factory.ShapeFactory;

import java.util.Locale;

/**
 * @program: Java-learning
 * @description: ����������
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