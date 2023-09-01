package oop1;
public class oop1{
    public static void main(String[] args) {
        Student anirudh = new Student();
        System.out.println(anirudh.phno);
        System.out.println(anirudh);
        // in java primitives are not objects thus it's stored in the stack memory so, we don't use new keyword

        Student obj;
        for (int i = 0; i < 1000000000; i++) {
            obj = new Student(12, 789);
        }
    }

}
class Student{

    int rno;
    int phno;

    Student (){    // calling a constructor from anorther constructor 
        this(11, 896523);
    }

    Student(int rno, int phno){
        this.rno = rno;
        this.phno = phno;
    }

    // Garbage collector 
    // JAVA calls the garbage collector automatically,
    // There is no manual way of call distructor or start garbage collector 
    // Instead we can specify what todo whena object is distroyed 
    
    // whenever a obj is distroyd by the garbage collector this function will be called 
    @Override
    protected void finalize() throws Throwable{
        System.out.println("Object destroyed");
    }

}
