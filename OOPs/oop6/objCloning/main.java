package oop6.objCloning;

public class main {
    public static void main(String[] args) throws CloneNotSupportedException {
        human anirudh = new human(23, "anirudh");
        human twin = new human(anirudh);

        // creating twin takes lots of processing time bcoz the object is created using new keyword.
        // to overcome this object cloning is used.
        // object cloning creates a exact copy of a object.

        // object cloning is done by interface [cloneable]
        human twin1 = (human)anirudh.clone();
        System.out.println(twin1.age);
    }
}
