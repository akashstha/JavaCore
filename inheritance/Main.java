//Inheritance: inheritance is a features to expends the feature of the parents class in the child class. its used the keyword called "Extends" to acquire the feautes of super class

public class Main {
    public static void main(String[] args) {
        TopLevelCalculator obj = new TopLevelCalculator();
        int r1 = obj.addition(2,2);
        int r2 = obj.subtraction(6,2);
        int r3 = obj.multiplication(2,2);
        int r4 = obj.division(20,2);
        double r5 = obj.power(20,2);

        System.out.println("Addition:" + r1);
        System.out.println("subtraction:" + r2);
        System.out.println("Muliplication:" + r3);
        System.out.println("Division:" + r4);
        System.out.println("Power:" + r5);

    }
}
