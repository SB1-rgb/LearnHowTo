package mdNew.java;

public class Customer {
    private int id;
    private String name;
    private int age;
    private String address;

    public Customer(int id, String name, String adress) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public Customer() {

    }

    //SETTERS
    public void setId(int idFormalParam) {
        id = idFormalParam;
    }

    public void setName(String nameFormalParam) {
        name = nameFormalParam;
    }

    public void setAge(int ageInput) {
        if ((ageInput > 0) && (ageInput <= 115)) {
            age = ageInput;
        } else {
            System.out.println("The value of the customer's age" + " " + age + " " + "is invalid, please input a valid age");
        }
    }

    public void setAdress(String address) {
        this.address = address;
    }

    //GETTERS
    public String getAdress() {
        return this.address;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }
}
