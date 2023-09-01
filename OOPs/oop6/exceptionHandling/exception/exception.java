package oop6.exceptionHandling.exception;

import oop6.exceptionHandling.customException.customException;

// exception handeling is of two types checked and unchecked 
// checked exceptions are checked during the compile time 
// unchecked exceptions are checked during runtime 

public class exception {
    public static void main(String[] args) {
        int a = 3;
        int b = 0;

        // exception handeling 
        try{
            divide(a, b);            
        } catch(ArithmeticException e){ // multiple catch blocks can be created
            System.out.println(e.getMessage());
        } catch(Exception e){ 
            System.out.println(e.getMessage());
        }finally{
            // this always executes
            System.out.println("finally block");
        }
    }

    // throws declares an exception 
    // if the method may throw exception throws keyword is use to declare it
    static int divide (int a, int b) throws ArithmeticException { 
        if (b == 0){
            throw new ArithmeticException("do not divide by zero");
            // throw is used to expliitly throw something
        }
        return a/b;
    }
    
}
