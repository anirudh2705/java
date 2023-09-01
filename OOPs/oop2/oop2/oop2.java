package oop2;

// PAckages are the folders to create compartments for the files
// . binds the instance vartiable and instance methods with the reference variables

public class oop2 {
    public static void main(String[] args) {
        Human ani = new Human(); 
        Human sai = new Human();
        Human arpit = new Human();
        System.out.println("population = " + Human.population);

        // greeting(); // non static data cannot be accessed inside static data
        //non static data belongs to objects
        
        // In  order to access non static data in static methods an object is needed to refer it 
        // here obj object creates a reference to greeting()
        oop2 obj = new oop2();
        obj.greeting();


        System.out.println(oop2.a+ " "+ oop2.b);
        System.out.println(oop2.a+ " "+ oop2.b+1);
        System.out.println(oop2.a+ " "+ oop2.b*8);
    }

    void greeting (){

        // static methods can be refered inside non static method 
        greeting2();
    }

    static void greeting2(){
    
    }

    // this static block will only run once when the class is initialized
    static int a;
    static int b;
    static{
        System.out.println("this is static block");
        a=2;
        b=a+3;
    }
}

class Human {
    int id;
    int phno;
    static long population;

    // when a property is not related to the object but 
    // common to all the objects in the class then the static keyword is used  
    // for example here the population is common for all the obj that will be created using Hman class

            // OR //

    // when a member is declered as static it can be accessed before creating any object inside the class
    // Static variables are not dependent on objects 
    // static belongs to the class but not object 
    // Static methods are resolved during compile time
    // Static method cannot be overriden.

    public Human (int id, int phno){
        this.id = id;
        this.phno = phno;
        Human.population += 1;

    }

    static void message(){
        // System.out.println(this.age);
        // this keyword cannot be used in the static methods
        // bcoz this refres to an obj but static doesn't need a object to run
    }
    Human (){
        this(2,7845);
    }
}