 //Super: every constructore has super constructor that points to its parents constructore. It can be default or parameterized constructor.
 //this: this keyword in constructore will point to default constructore of the class.
 //Object: Object is a class and every class inherites the features of the Object
 
 class A extends Object{
    public A(){
        super();
        System.out.println("A Default");
    }

    public A(int num){
        super();
        System.out.println("A parameterized!");
    }

}
class B extends A{
public B(){
    super();
    System.out.println("B default");
}

public B(int n){
    this();
    System.out.println("Parameterized B");
}
}

public class thisAndSuper {
    public static void main(String[] args) {
        
        B obj = new B(5);
    }
}
