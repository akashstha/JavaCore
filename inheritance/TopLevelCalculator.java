// Multilevel Inheritance: Multilevel inheritance allows object to access feaure of the super or parents clasess that will be extending the features from thier parents of super class.

public class TopLevelCalculator extends AdvanceCalculator {
    public double power(int num1, int num2){
        return Math.pow(num1, num2);
    }
}
