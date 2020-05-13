public class Main {
    public static void main(String[] args) {

        // creating a new object here will give a compile time error
        //Employee employee = new Employee();
        //you can only get the only object available
    Employee employee1 = Employee.getInstance();
    Employee employee2 = Employee.getInstance();

        //created two objects reference will be same
    System.out.println(employee1);
    System.out.println(employee2);
    System.out.println();

    System.out.println(employee1.hello());




    }
}
