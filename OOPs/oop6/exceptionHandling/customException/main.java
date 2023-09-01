package oop6.exceptionHandling.customException;

public class main {

    public static void main(String[] args) {
        try {
            String car = "toyata";
        if (car == "toyata"){
            throw new customException("this is toyata");
        }
        } catch (customException e) { // calling custom exception
            System.out.println(e.getMessage());
        }
    }
    
}
