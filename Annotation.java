
class Car{

    public void drive(){
        System.out.println("This car has 4 wheels");
    }
}

class BMW extends Car{
@Override
    public void drive(){
        System.out.println("BMW is a smooth car!!");
    }
}

public class Annotation {
    public static void main(String[] args) {
        Car cars = new BMW();
        cars.drive();

        Car cars1Car = new Car();
        cars1Car.drive();
    }
}


