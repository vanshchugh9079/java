package visiblity;
public class Visible{
 public class Test {
    protected Test(){
        System.out.println("hello");
    }
}
 public class Test2 extends Test {
    Test2(){
        super(); // Call the constructor of the superclass Test
        System.out.println("test2");
    }
}
    public static void main(String[] args) {
        new Test2(); // Create an instance of Test2
        new Test();
    }
}
