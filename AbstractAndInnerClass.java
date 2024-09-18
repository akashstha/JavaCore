/*
 * Abstarct class : we can use the abstarct class in the annoymous inner class directly in the object instances without creating the sub class to inherite a super class.
 */

abstract class Car{
    public abstract  void drive();
    public abstract  void config();
    public void test(){
        System.out.println("this is test");
    }
    }
    
    // class BMW extends Car{
    //     public void drive(){
    //         System.out.println("this call is coming from BMW class");
    //     }
    // }


public class AbstractAndInnerClass {
    public static void main(String[] args) {
        Car obj1 = new Car(){
            public void drive(){
                System.out.println("call is coming for the inner class");
            }
            public void  config(){
                System.out.println("Call is coming from the config class");
            }
        };
        obj1.drive();
        obj1.config();
    }
    
}
