import java.util.Scanner;

public class Start {

    public String start(){
        String value="";
        Scanner input = new Scanner(System.in);            //creating new object in scanner method
        System.out.print("Type \"Time\" to get Distance");
        System.out.print("Type \"Distance\" to get Time");
        System.out.print("Type \"Exit\" to Exit");
        value = input.next();
        return value;
    }
}
