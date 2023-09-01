package oop3.inheritance;

public class Boxweight extends Box{
    double weight;
    private double v=10.9; // defining a variable with private is also refered as data hiding

    public Boxweight(){
        this(4,7,5,6);
    }
    
    public double getv() {
        return v;
    }

    public Boxweight (int l,int w,int h,int weight){
        super(l,w,h); // calls parent class constructor
        this.weight=weight;
    }
}

