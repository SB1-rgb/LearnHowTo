package mdNew.java;

public class ExecutionService {
    public static void main(String[] args) {

        Customer marcelCustomer = new Customer();
        marcelCustomer.setId(DataGeneratorUtils.generateRandomvalue(99999));
        marcelCustomer.setName("Marcel");
        marcelCustomer.setAge(DataGeneratorUtils.generateRandomvalue(120));
        marcelCustomer.setAdress("petricani 1");


        Customer ionelCustomer = new Customer();
        ionelCustomer.setId(DataGeneratorUtils.generateRandomvalue(99999));
        ionelCustomer.setName("Ionel");
        ionelCustomer.setAge(DataGeneratorUtils.generateRandomvalue(120));
        ionelCustomer.setAdress("petricani 2");

        System.out.println(ionelCustomer.getAge());
        System.out.println(marcelCustomer.getId());
        System.out.println(marcelCustomer.getAge());
        System.out.println(ionelCustomer.getId());
        System.out.println(DataGeneratorUtils.generateRandomUUID("gmail.md"));


    }
}
