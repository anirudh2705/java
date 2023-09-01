package oop6.lambdaExpression;

import java.lang.reflect.Array;
import java.util.ArrayList;

// a lambda expression is a short block of code which takes in parameter and return a value 
// it doesn't require a name 

public class lambda {

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 6; i++) { // general expression
            arr.add(2*i);
        }

        arr.forEach((item) -> System.out.println(item*2)); // lambda expression
    }
    
}
