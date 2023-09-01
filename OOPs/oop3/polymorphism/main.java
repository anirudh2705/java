package oop3.polymorphism;

// polymorphism 
//      poly - many & morphism - ways to represent a single entity oritem

// types of polymorphism
//      1. compile time / static polimorphism [done by method / constructor overloading] (java doesn't provide operator oveloading).
//              method overloading :- have same method name with different type, return statements, ordering, arguements. 
//      2. Runtime / Dynamic Polymorphism [done by method overriding] 
//              method overriding :- child class haveing same method name as the parent class but with different body.
//              ex :- refer com.oop3.polymorphism.shapes , com.oop3.polymorphism.square , com.oop3.polymorphism.circle


// final method prevents overriding & inheritance
// the final method is resolved at compile time whisch is known as [early binding]
// the method which is resolved at runtime is known as [late binding]

public class main {

    // compile time polymorphism

    int sum (int a, int b){
        return a+b;
    }

    int sum (int a, int b , int c){
        return a+b+c;
    }

    public static void main(String[] args) {
        main obj = new main();

        shapes obj1 = new square(); 
        
        // here which method will be called depends upon the child class i.e square() , this is known as [upcasting]
        // this is how overriding works.
        // the reference type (shapes) defines which one to access 
        // the child type (square) defines which one to run.

        // how java determines which method to run :- 
        // it is determined by dinamic method dispatch [it is a mechanism by which a call to a overridden method is resolved at runtime]


        int k = obj.sum(9,8);
        obj.sum(9,3,4);
        System.out.println(k);
    }

}
