/*
 * Inner Class: class can be a inner call
 * The parent class cannot be a static class
 *
 * 
 */


class FirstClass{

    public void firclassMethod(){
        System.out.println("FirstClass Method...");
    }

    class SecondClass{

        public void secondclassMethod(){
            System.out.println("SecondClass Method...");
        }

    }
    static class ThirdClass{
        public void thirdclassMethod(){
            System.out.print("ThirdClass Method...");
        }

    }
}


public class InnerClass {

    public static void main(String[] args) {
        
        FirstClass obj = new FirstClass();
        obj.firclassMethod();

    FirstClass.SecondClass  obj2 = obj.new SecondClass();
    obj2.secondclassMethod();

    //calling the static class
    FirstClass.ThirdClass obj3 = new FirstClass.ThirdClass();
    obj3.thirdclassMethod();
    }

    
}
