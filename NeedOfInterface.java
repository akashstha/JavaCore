/*
 * need of interface: we need interface as a abstract class
 * 
 */

interface Car{
    void drive();
}

class BMW implements Car{
    public void drive(){
        System.out.println("BMW can run very faster!");
    }
}

class Volvo implements Car{
    public void drive(){
        System.out.println("Volvo can run very safe!");
    }
}

class Driver{
    public void needs(Car vehicle){
        vehicle.drive();
    }
}

public class NeedOfInterface {
    public static void main(String[] args) {
        Car obj = new BMW();
        Car obj1 = new Volvo();
    Driver person = new Driver();
    person.needs(obj);
    person.needs(obj1);
    }

    
    
}
