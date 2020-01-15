import java.io.IOException;
import java.util.Scanner;

public class John {
    public static void main(String[] args) {

        System.out.println("Type \"1\" to get Distance");
        System.out.println("Type \"2\" to get Time");
        System.out.println("Type \"3\" to Exit");

        int value=0;

            while(value!=3) {
                System.out.println("Type 1/2/3");
                Scanner input = new Scanner(System.in);            //creating new object in scanner method
                value = input.nextInt();



                if (value == 1) {
                    TimeCal timeCal = new TimeCal();
                    timeCal.TimeCal();
                 }

                if (value == 2) {
                     DisCal disCal = new DisCal();
                     disCal.DisCal();
                }

            }
    }
}

