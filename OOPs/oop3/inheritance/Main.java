package oop3.inheritance;
 
// hybrid and multiple inheritance is not supported in java
// we can achieve using interfaces [refer oop.oop5]

public class Main {
    public static void main(String[] args) {
        Boxweight box1 = new Boxweight(0, 0, 0, 4);
        Boxweight box3 = new Boxweight();

        Box box6 = new Boxweight(2,3,4,5);
        System.out.println(box6.w + " from box 6");

        System.out.println(box1.h+ " " + box1.weight);
        System.out.println(box3.h+ " " + box3.weight);
        

        box3.getv(); // accessing private method through a public method ofs same class.
        System.out.println(box3.getv());
        System.out.println(box1 instanceof Box); // checks whether the obj is the instance of the given class or not.
        System.out.println(box1.getClass()); // prints which class the object belongs.
    }

}
