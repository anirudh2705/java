package oop4;

public class objectdemo {

    
    // writtens a string implemntation of the objects 
    @Override
    public String toString() {
        return super.toString();
    }

    // used as a garbage collector, to specify a task when a object is destroyed [refer - oops.oop1 ]
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
    
    //it creates a hash value of the object
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    // compares the value of a two object [refer line 44 ]
    @Override
    public boolean equals(Object obj) {
       // return super.equals(obj);
       return this.a == ((objectdemo)obj).a; // casting
    }

    int a;
    public objectdemo(int a){
        this.a = a;
    }

    public static void main(String[] args) {
        
        objectdemo obj1 = new objectdemo(12);
        objectdemo obj2 = new objectdemo(12);

        if (obj1 == obj2){ // it compares the adderess of two objects
            System.out.println("comparing the address of two objects");
        }

        if (obj1.equals(obj2)){ // it compares the value of two objects
            System.out.println("comparing the value of two objects");
        }

        System.out.println(obj1.getClass());// prints which class the object belongs [it is used to get information of class] , it is stored in heap.


    }
}
