package oop5.abstraction;

// Abstract class :- 
//         An abstract class is a class which doesn't have a body ,it only have defination.
//         It determines the body by it's child class.
        
//         Abstract class or methpds are the empty methods which is overridden by the child class which provides the body to it.
//         Any class which contains one or more abstract methods, the class must be declared as abstract.
//         [refer oop.oop5.parent & oop.oop5.son]


public abstract class main {
    public static void main(String[] args) {

        // object of an an abstract class cannot be created bcoz it doesn't have a body
       // parent parent = new parent(); 

        son son = new son();
        son.career();
        son.passion();

    }
}
