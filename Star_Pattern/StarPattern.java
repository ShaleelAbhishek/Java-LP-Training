/**********Star Pattern***********/
/**********14.01.2019*************/
/*******Shaleel Abhishek**********/

import java.util.Scanner;


/********************************/


public class StarPattern {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number of Rows : ");
        int rows = scanner.nextInt();

            for (int a=1; a<=rows; a++){			//give condition to print enterd number of rows
                 for (int b=rows; b>a; b--){
                        System.out.print(" ");
                 }
                 for (int c=1; c<=(a * 2) -1; c++){		//stars should be odd number every time. so (number*2)-1 gives 
                         System.out.print("*");			//an odd number every time.
                 }
                System.out.println();
             }

            for (int a=rows-1; a>=1; a--){
                 for (int b=rows-1; b>=a; b--){
                     System.out.print(" ");
                 }
                 for (int c=1; c<=(a * 2) -1; c++){
                     System.out.print("*");
                 }
                System.out.println();
             }
    }
}