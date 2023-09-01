package oop7.enumex;

// enum are the group of variables that will not change 
//enum cannot be a super class  
// enums can implement interfaces
public class enumeration {

    // by default enum is static, pblic and final

    // Some classes have a particular no. of objects fr ex week  
    enum Week implements A {
        // enum constants
        mon, tue, wed, thur, fri, sat , sun;

        @Override
        public void hello() {
            System.out.println("hello");
        }

        // constructors can be created for enums 
        // constructors are executed seperately for every enum constants
        Week(){
            System.out.println("executed for "+ this);
        }
        
    }
    public static void main(String[] args) {
        Week week;
        week = Week.fri;

        for ( Week day :Week.values()){
            System.out.println(day);
        }

        System.out.println(week.ordinal());// odinal prints index
        week.hello();

    }

    
}
