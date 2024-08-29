//Packages: Packages are process to bind the java folder and share with other folder. Package name shoudl be uniques while exporting to others.


import utils.tools.AdvanceCalculator;
import utils.tools.Calculator;
import utils.tools.TopLevelCalculator;

public class Main {
    public static void main(String[] args) {
        TopLevelCalculator obj = new TopLevelCalculator();
        Calculator obj1 = new Calculator();
        AdvanceCalculator obj2 = new AdvanceCalculator();

       int r1 = obj1.addition(2, 2);
       System.out.println(r1);

    }
}
