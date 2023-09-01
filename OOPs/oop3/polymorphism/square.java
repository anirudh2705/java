package oop3.polymorphism;

public class square extends shapes{

    // this will run when the obj of square is created
    // hence it overrides the parent method 

    @Override  // it checks weather the below method is overridden or not it throws error if the method is  not overridden.
    void name(){
        System.out.println("this is square class");
    }
}
