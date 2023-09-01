package oop6.shallowCopy;

import java.util.Arrays;

public class main {

    // shallow copy creates a copy of objects with primitive datatype.
    // it doesn't craetes a copy of non primitives [array, class, interface, String].
    // if any non primitive object is present it refers to the parents reference varible instead of creating a copy.
    public static void main(String[] args) throws CloneNotSupportedException {
        shallowCopy carInfo = new shallowCopy(1090998, "toyata");
        shallowCopy car2 = (shallowCopy)carInfo.clone();

        
        // here car2.arr is refereing to the reference variable of carInfo i.e carInfo.arr
        System.out.println(Arrays.toString(car2.arr));
        car2.arr[1] = 20;
        System.out.println(Arrays.toString(carInfo.arr)); // here carinfo[2] is changed because the car2.arr is pointing to carInfo.arr
    }
}
