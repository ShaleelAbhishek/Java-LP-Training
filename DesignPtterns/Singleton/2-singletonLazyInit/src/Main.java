public class Main {
    public static void main(String[] args) {

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                Employee employee1 = Employee.getInstance();
                System.out.println("from thread 1 - "+employee1);
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                Employee employee2 = Employee.getInstance();
                System.out.println("from thread 2 - "+employee2);
            }
        });

        t1.start();
        t2.start();


//        Employee employee1 = Employee.getInstance();
//        Employee employee2 = Employee.getInstance();

//        System.out.println(employee1);
//        System.out.println(employee2);


//        System.out.println(employee1.hello());


    }
}
