 //Typecasting - Upcasting is making object call to the parent. Downcasting is making parent to understand the child object
 
 class A{
    
    public void show(){
        System.out.println("From Class A");
    }
}
 class B extends A{
    
    public void show1(){
        System.out.println("From Class B");
    }
}

public class Typecasting {
    public static void main(String[] args) {
        A ob1 = (A) new B();
        ob1.show();

        B ob2 =(B) ob1;

        ob2.show1();
    }
}
