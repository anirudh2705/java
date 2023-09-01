package oop6.generics;

// Generics refers to parameterise types it basically allows us to specify a parameter to the methods, class and interface.
// generics is not implemented here [refer :- oop6.generics.customGenArrayList]

import java.lang.reflect.Array;
import java.util.Arrays;

public class customArraylist {
    private int[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public customArraylist(){
        this.data = new int[DEFAULT_SIZE];
    }

    public void add(int num){
        if (isFull()){
            resize();
        }
        data[size++]=num;
    }

    private void resize() {
        int [] temp = new int[data.length * 2];

        // the size of the array is doubled
        // copy the elements of the previous array to new array
        
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    private boolean isFull() {
        return size == data.length;
    }

    public int remove(){
        int removed = data[--size];
        return removed;
    }

    public int get ( int index){
        return data[index];
    }

    public void set ( int index, int value){
        data[index] = value; 
    }

    public int size (){
        return size;
    }

    @Override
    public String toString(){
        return "customArraylist{" + "data=" + Arrays.toString(data) + ", size=" + size + '}';
    }

       
    public static void main(String[] args) {
        customArraylist array = new customArraylist();
        array.add(9);
        array.add(2);
        System.out.println(array);
    }
}
