import java.util.Scanner;

public class TimeCal {

        public void  TimeCal() {

            int distance;

            Scanner input = new Scanner(System.in);            //creating new object in scanner method
            System.out.print("Enter Distance: ");
            distance = input.nextInt();

            int distance1 = distance;
            distance1 = distance1 / 9;
            if (distance % 9 == 0) {
                System.out.println("Time for " + distance + "m is " + (distance1 * 8)+"s");
            }else if((1<=distance) && (distance<=5)){
                System.out.println("Time for " + distance + "m is " + ((distance1 * 8)+1)+"s");
            }else if((6<=distance) && (distance<=8)){
                System.out.println("Time for " + distance + "m is " + ((distance1 * 8)+3)+"s");
            }else{
                System.out.println("Time for " + distance + "m is " + ((distance1 * 8)+8)+"s");
            }

        }
    }


