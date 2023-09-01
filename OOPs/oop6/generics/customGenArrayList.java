package oop6.generics;

import java.util.Arrays;

// here <T extends number> only allows the number class and its sub class as type [known as wildcards]
public class customGenArrayList<T extends Number> {
    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public customGenArrayList(){
        this.data = new Object[DEFAULT_SIZE];
    }

    public void add(T num){
        if (isFull()){
            resize();
        }
        data[size++]=num;
    }

    private void resize() {
        Object [] temp = new Object[data.length * 2];

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

    public T remove(){
        T removed = (T)(data[--size]);
        return removed;
    }

    public T get ( int index){
        return (T)(data[index]);
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
        customGenArrayList<Integer> array = new customGenArrayList<>();
        for (int i = 0; i < 18; i++) {
            array.add(i);
        }
        System.out.println(array);
    }
}

