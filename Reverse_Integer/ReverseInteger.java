/********Integer Reversing********/
/**********05.01.2019*************/
/*******Shaleel Abhishek**********/


import java.util.Scanner;					//importing Scanner class

/********************************/


public class ReverseInteger{
	public static void main(String[] args){
						
int num;							//variable declaration
int remainder;


	System.out.println("***Integer Reversing***");

	Scanner input = new Scanner(System.in);			//creating new object in scanner method
	System.out.print("Enter an Integer: ");			
	num = input.nextInt();					//getting int value
	
	System.out.print("Reversed Integer: ");							
		
		for(int i=1; 10<num;i++){					
			remainder = num%10;			//deviding number by 10 and set variable remainder to remaider
			num = num/10;				//Deviding number by 10 and set num to answer			
			System.out.print(remainder);		//print remainder in each step
		}

	System.out.print(num);					//print final answer of num


	}
}