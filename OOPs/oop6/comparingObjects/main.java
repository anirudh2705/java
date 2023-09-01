package oop6.comparingObjects;

public class main {

    public static void main(String[] args) {
    student sai= new student(01, 20);
    student hari = new student(02, 30);

    //if(hari > sai){ // it throws error bcoz student method have two objects roll and marks it confuses whichone to compare
        // to overcome this we use compareto operator
    if(hari.compareTo(sai) < 0){
        System.out.println("sai is greater");
    }
    }

}
