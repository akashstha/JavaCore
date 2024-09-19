
/*
 * Enums: Enums are the constant class.
 */
enum Cars{
    SuperCar, LuxuryCar, SportsCar, LegacyCar
}

public class Enums {
    public static void main(String[] args) {
        Cars[] car = Cars.values();

        for(Cars c: car){

            System.out.println(c +" : "+ c.ordinal());
        }
        // System.err.println(car.ordinal());
        
    }
}
