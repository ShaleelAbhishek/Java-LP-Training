

public class InnerClasses {
    public static void main(String[] args) {

  
      	MemberClassExample m1 = new MemberClassExample();
        MemberClassExample.MemberClass m2 = m1.new MemberClass();
        m2.print();

  	NestedClass n1 = new NestedClass();
        NestedClass.NestedEx n2 = new NestedClass.NestedEx();
        n2.print();


        Anonymous a1 = new Anonymous(){
        public void print(){
            System.out.println("Hi");
        }
        };
        a1.print();
    }
}