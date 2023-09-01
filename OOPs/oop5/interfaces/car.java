package oop5.interfaces;

public class car implements engine, media{


    @Override
    public void type() {
        System.out.println("petrol engine");
    }

    @Override
    public void speed() {
        System.out.println("200km");
    }

    @Override
    public void speaker() {
        System.out.println("BOSE");
    }
    
}
