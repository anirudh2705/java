package oop5.nestedinterface;

public class nested {
    public interface A {
        boolean isodd(int num);      
    }
}

class B implements nested.A{

    @Override
    public boolean isodd(int num) {
        return (num & 1)==1; // num%2==0 them even
    }
    
}