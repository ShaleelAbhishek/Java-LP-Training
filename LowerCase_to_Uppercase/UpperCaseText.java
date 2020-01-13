/********Integer Reversing********/
/**********12.01.2019*************/
/*******Shaleel Abhishek**********/


import java.io.FileReader;
import java.io.BufferedReader;

/*******************************/

public class UpperCaseText {
    public static void main(String[] args) {

        int i = 0;
        String tmp = "";                                                                                        // variable initialization

        	try {
           	 FileReader fileReader = new FileReader("C:\\Users\\Shaleel\\Desktop\\Test.txt");

            	BufferedReader bufferedReader = new BufferedReader(fileReader);
           	tmp = bufferedReader.readLine();                                                                //reading the file

            	fileReader.close();
            	bufferedReader.close();

        	} catch (Exception E) {
            	System.out.println(E);
       		}

        System.out.println("LowerCase Text: "+tmp);

        String UpperCase = "";
        char ch = ' ';

       	 	for (int j = 0; j < tmp.length(); j++) {
            		if (tmp.charAt(j) >= 'a' && tmp.charAt(j) <= 'z') {               			 //checking char by char if its lowercase
                	ch = (char) (tmp.charAt(j) - 32);                               			 // if yes, convert it to uppercase
            		
			} else {
                	ch = (char) (tmp.charAt(j));                                    			 //if char is not a lowercase keep it as it is
            		}

            	UpperCase += ch;                                                    				 //get all converted text to variable UpperCase char by char
        	}

        System.out.print("Converted Text: ");
        System.out.print(UpperCase);

    }
}
