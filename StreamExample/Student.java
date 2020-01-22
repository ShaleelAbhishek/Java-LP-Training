/*******Map/Stream/LambdaEx*******/
/**********21.01.2019*************/
/*******Shaleel Abhishek**********/

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;


public class Student {

    public static void main(String[] args) {

        HashMap<String,Integer> hashmap= new HashMap<>();
        hashmap.put("Abhi",65);
        hashmap.put("Kasun",45);
        hashmap.put("Nimal",55);
        hashmap.put("Amal",75);
        
        System.out.println(hashmap);
	System.out.println();
        List<String> student=hashmap.keySet().stream().filter((s) ->  hashmap.get(s) > 60).sorted().collect(Collectors.toList());
       
	System.out.print("Students with mark above 60 : ");
	System.out.print(student);
 }
}