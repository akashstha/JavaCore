
//DynamicMethodDispatching : it is the project of defining the variable of the object at the run time. Object can refernce to its super class and can be assigned to it sub class.

class A{

    public void show(){
        System.out.println("Print of A");
    }
}
class B extends A{

    public void show(){
        System.out.println("Print of B");
    }
}
class C extends A{

    public void show(){
        System.out.println("Print of C");
    }
}


public class DynamicDispatch {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();

        obj = new B();
        obj.show();

        obj = new C();
        obj.show();
    }
    
}
