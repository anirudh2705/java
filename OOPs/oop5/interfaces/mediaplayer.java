package oop5.interfaces;

public class mediaplayer implements media {

    @Override
    public void type() {
        System.out.println(" inside media player class");
    }

    @Override
    public void speed() {
        System.out.println("media start");
       
    }

    @Override
    public void speaker() {
        System.out.println("media stop");
        
    }
    
}
