package oop5.interfaces;

public class petrolengine implements engine {

    @Override
    public void type() {
        System.out.println("this is petrol engine");
    }


    @Override
    public void speed() {
        System.out.println("petrol engeen speed 250km");
    }
    
}
