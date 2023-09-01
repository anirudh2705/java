package oop6.shallowCopy;

import java.lang.reflect.Array;

public class shallowCopy implements Cloneable {
    int price;
    String car;
    int[] arr;
    
    public shallowCopy(int price, String car){
        this.price = price;
        this.car = car;
        this.arr = new int[] {1,2,3};
    }

    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
