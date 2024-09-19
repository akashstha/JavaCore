/*
 * interface : interface is a design or instruction.
 * Interface is like abstract class where its methods are implemented in a class.
 * Variables in interface are final and static that cannot be overriden.
 * 
 */

interface Car{

    int year = 2024;
    String model = "M-Series";
    void drive();
    void ride();
}

class BMW implements Car{
    public void drive(){
        System.out.println("BMW drives very smooth");
    }

    public void ride(){
        System.out.println("BMW can ride fasater");
    }
}


public class Interface {
    public static void main(String[] args) {
        
        BMW obj = new BMW();
        obj.drive();
        obj.ride();
        System.out.println("Car year is : " + BMW.year);
        System.out.println("Car mode is : " + BMW.model);
    }

    
}
