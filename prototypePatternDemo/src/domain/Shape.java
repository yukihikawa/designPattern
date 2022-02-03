/*
 *  Copyright(c) 2022
 *    项目名称:Java-learning
 *    文件名称:Shape.java
 *    Date:2022/2/2 上午10:32
 *    Author: wrf
 */

package domain;/*
 *  Copyright(c) 2022
 *    项目名称:Java-learning
 *    文件名称:domain.Shape.java
 *    Date:2022/2/2 上午10:03
 *    Author: wrf
 */

/**
 * @program: Java-learning
 * @description: 抽象类，实现cloneable
 * @author: Rifu Wu
 * @create: 2022-02-02 10:02
 **/
public abstract class Shape implements Cloneable{
    private String id;
    protected String type;

    abstract void draw();

    public String getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Object clone(){
        Object clone = null;
        try {
            clone = super.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return clone;
    }
}