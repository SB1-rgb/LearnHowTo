package md.java.classesandobjects.autoservicetask;

public class ManageAutoService {
    public static void main(String[] args) {

        Garage masterLuxobject = new Garage("Stefan cel mare", 5, 250.00);
        System.out.println( masterLuxobject.adress);

        Car myCar = new Car("tesla", "white", 5);

        Tool hummer = new Tool("hummer");
        Worker theBestOne = new Worker("Gicu");
        System.out.println(theBestOne.name);
    }

}
