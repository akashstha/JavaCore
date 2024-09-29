/*
 * Lamda Expresion :  Lamda Expression is the sugar syntatical syntax that will cut down the code.
 */

@FunctionalInterface
interface Car{
    void drive(int i);
}

public class LamdaExpression {
    public static void main(String[] args) {
        Car obj = i -> System.out.println("Drive the car!!" + i);
        obj.drive(5);
    }  
}
