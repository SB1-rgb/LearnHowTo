package md.java.classesandobjects.autoservicetask;

public class Car {
    String mark;
    String color;
    int doors;
    int motorCapacity;

    public Car (String newMark, String colorOfTheCar, int numberofTheDoors){
        mark =newMark;
        color = colorOfTheCar;
        doors = numberofTheDoors;
        System.out.println("this is first car created");
    }
}
