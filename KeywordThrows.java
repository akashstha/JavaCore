/*
 * Throws: throws keyword are used to pass the expection to upper hierachy that calling the methods
 */


class Car{
    public void drive() throws ClassNotFoundException{
        Class.forName("KeywordThrowsasdasda");
    }
}

public class KeywordThrows {
    static {
        System.out.println("Class got loaded!");
    }
    public static void main(String[] args) {
        Car obj =  new Car();
        try {
             obj.drive();
        } catch (ClassNotFoundException e) {
            System.out.println("Message from Exception");
        }
    }
}
