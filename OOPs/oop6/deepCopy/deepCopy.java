package oop6.deepCopy;

public class deepCopy implements Cloneable {
    int price;
    String car;
    int[] arr;
    
    public deepCopy(int price, String car){
        this.price = price;
        this.car = car;
        this.arr = new int[] {1,2,3};
    }

    public Object clone() throws CloneNotSupportedException{
        deepCopy car2 = (deepCopy)super.clone(); // shallow copy
        car2.arr = new int[car2.arr.length];// resolving shallow copy
        for (int i = 0; i < car2.arr.length; i++) { // created a copy of non primitive obj for the copyed obj.
            car2.arr[i] = this.arr[i]; // it copies the object from the parent andcreate a new object [deep copy]
        }
        return car2;

    }
}
