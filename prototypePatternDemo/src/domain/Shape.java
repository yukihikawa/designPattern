/*
 *  Copyright(c) 2022
 *    ��Ŀ����:Java-learning
 *    �ļ�����:Shape.java
 *    Date:2022/2/2 ����10:32
 *    Author: wrf
 */

package domain;/*
 *  Copyright(c) 2022
 *    ��Ŀ����:Java-learning
 *    �ļ�����:domain.Shape.java
 *    Date:2022/2/2 ����10:03
 *    Author: wrf
 */

/**
 * @program: Java-learning
 * @description: �����࣬ʵ��cloneable
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