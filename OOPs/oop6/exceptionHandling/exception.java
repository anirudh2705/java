package oop6.exceptionHandling;

// exception handeling is of two types checked and unchecked 
// checked exceptions are checked during the compile time 
// unchecked exceptions are checked during runtime 

public class exception {
    public static void main(String[] args) {
        int a = 0;
        int b = 3;

        // exception handeling 
        try{
            int c = b/a;
        } catch(ArithmeticException e){ // multiple catch blocks can be created
            System.out.println(e.getMessage());
        } catch(Exception e){ 
            System.out.println(e.getMessage());
        } finally{
            // this always executes
            System.out.println("finally block");
        }
    }
    
}
