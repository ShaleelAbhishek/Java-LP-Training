import java.util.Scanner;

public class DisCal {
    public void  DisCal() {
        int Distance;
        int time;

        Scanner input = new Scanner(System.in);            //creating new object in scanner method
        System.out.print("Enter Time: ");
        time = input.nextInt();

        int time1 = time;
        time1 = time1 / 8;

        if (time % 8 == 0) {
            System.out.println("Distance for " + time + "s is " + (time1 * 9)+"m");
        }else if(time%8==1){
            System.out.println("Distance for " + time + "s is " + ((time1 * 9)+5)+"m");
        }else if((time%8==3)||(time%8==2)){
            System.out.println("Distance for " + time + "s is " + ((time1 * 9)+8)+"m");
        }else{
            System.out.println("Distance for " + time + "s is " + ((time1 * 9)+9)+"m");
        }

    }
}
