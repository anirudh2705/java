package oop6.deepCopy;
import java.util.Arrays;

// it overcomes the problems in shallow copy
// it creates a copy of the all the objects istead of refereng to the old one 

public class main {
    public static void main(String[] args) throws CloneNotSupportedException {
        deepCopy carInfo = new deepCopy(1090998, "toyata");
        deepCopy car2 = (deepCopy)carInfo.clone();

        System.out.println(Arrays.toString(car2.arr));
        car2.arr[1] = 20;
        System.out.println(Arrays.toString(carInfo.arr)); // carInfo doesn't change bcoz a copy of carInfo.arr is created for car2.arr.
        System.out.println(Arrays.toString(car2.arr));
    }
}
