
/*Abstract class: Abstract method can only be defined in abstract class.
 Abstrach class cannot be used as object instead it is inherited by other concrete class
 Abstract class can have both abstract method and normal methods
 */


abstract class Car{
    public abstract void drive();
    public abstract void fly();
    
    public void playMusic(){
        System.out.println("Playing music");
    }
}

abstract class BMW extends Car{
public void drive(){
    System.out.println("BMW is Driving");
}
}

class X5 extends BMW{
    public void fly(){
        System.out.println("X5 car can fly");
    }
}

public class Abstract{
    public static void main(String[] args) {

        X5 obj = new X5();
        obj.drive();
        obj.fly();
        obj.playMusic();
        
    }
}