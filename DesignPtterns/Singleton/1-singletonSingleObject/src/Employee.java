public class Employee {
        //creating a single object which is static
    private  static  Employee employee = new Employee();

        //private constructor won't allow to create an Employee instance outside the class
    private Employee(){
        System.out.println("Instance created");
    }

        //getting the created only object
    public static Employee getInstance(){
        return employee;
    }

    public String hello(){
        return "Singleton-Single Instance";
    }
}


