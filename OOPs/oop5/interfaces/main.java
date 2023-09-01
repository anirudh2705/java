package oop5.interfaces;

public class main {
    public static void main(String[] args) {
        car car = new car();
        media carmedia = new car();

        // here the interface media and engine contains both type and speed so it is overridden
        // in order to overcome this issue we need to creata a seperate class which only implements media
        // thas having differnt data for different class even having same method name 
        car.type();
        car.speed();
        car.speaker();

        newcar car1 = new newcar();
        car1.type();

    }
}
