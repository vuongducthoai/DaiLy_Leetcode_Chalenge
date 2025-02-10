package _SourceCode;

import org.w3c.dom.ls.LSOutput;

class Vehicle {
    public static final int a = 1;
    public void abc() {
        System.out.println("welcome");
    }
}

class Student {
    int id;
    String name;
    private final String PAN_CARD_NUMBER;

    static final int data;
    static {
        data = 50;
    }

    public Student() {
        PAN_CARD_NUMBER = "7777";
    }

    public static void main(String[] args) {
        System.out.println(Student.data);
    }
}


public class Bike6  {
    void message() {
        System.out.println("welcome to java");
        System.out.println(Vehicle.a);
    }

    void display() {
        message();
    }

    public static void main(String args[]) {
        Bike6 s = new Bike6();
        s.display();
    }
}
