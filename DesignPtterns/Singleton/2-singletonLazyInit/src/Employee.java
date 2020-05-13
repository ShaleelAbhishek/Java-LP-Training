public class Employee {

    private static Employee employee;

    private Employee(){
        System.out.println("Instance created");
    }

        /****if you use this code, it will create the two different instances empooyee1 & emloyee2.
        *****we do't want that to happen in this concept. it's better to use lazy initialization. */
//    public static Employee getInstance(){
//        employee = new Employee();
//        return employee;
//    }

        /****lazy initialization - here the problem is if you have two threads running in same time(t1 & t2) and try to use this single employee
        ****instance, you will again create two different instances in two running threads. to avoid that double locking method is used.*/
//        public static Employee getInstance(){
//            if(employee ==null){
//                employee = new Employee();
//            }
//            return employee;
//        }



        /****double locking method - when you use two threads running at same time and try to create this employee instance,
        *****it will create the instance only once by using following code. */
    public static Employee getInstance(){
        if(employee ==null){
            synchronized (Employee.class){
                if(employee == null) {
                    employee = new Employee();
                }
            }
        }

        return employee;
    }

    public String hello(){
        return "Singleton-Lazy Initialization Method";
    }
}
