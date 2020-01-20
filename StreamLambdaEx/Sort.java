import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sort {
    public static void main(String[] args) {

        List<Student> st1 = new ArrayList<>();

        st1.add(new Student("Abhi",55));
        st1.add(new Student("Don",72));
        st1.add(new Student("Jakee",69));


        Comparator<Student> comparator =
                (s1,s2) -> (s1.getMark()>s2.getMark()?+1 : (s1.getMark()<s2.getMark())?-1:0);

        Collections.sort(st1,comparator);
        System.out.println(st1);
    }
}