
/*
 * Interface can extends after interface
 * class will implement the interface
 * class can implement multiple interface
 */
 
 
 interface Car{

    void drive();
    void ride();
}

interface Wheel{
    void run();
}

interface Screws extends Wheel{

}

class BMW implements Car,Screws{
    public void drive(){
        System.out.println("BMW drives very smooth");
    }

    public void ride(){
        System.out.println("BMW can ride fasater");
    }
    public void run(){
        System.out.println("BMW can run with the wheels");
    }
}


public class MultipleInterface {
    public static void main(String[] args) {
        
        Car obj = new BMW();
        obj.drive();
        obj.ride();
        Screws obj1 = new BMW();
        obj1.run();
        // obj.run()
    }

    
}
