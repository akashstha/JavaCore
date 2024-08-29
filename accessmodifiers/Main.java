//public: public can be accessible from anywhere. in and out the pacakage
//private : private can only be accessible from the same class only. not in or out the pacakage.class 
//Default : default can be accessible only the same package but can be access in different classes
//Protected: Procted class can only be accessed to non same package file through sub package or inheritance


package accessmodifiers;

import accessmodifiers.utils.AdvanceCalculator;

class SuperCalculator extends AdvanceCalculator{
      int test = addition;
}

public class Main {
    public static void main(String[] args) {
        //public
        AdvanceCalculator obj = new AdvanceCalculator();
        Calculator obj1 = new Calculator();
        SuperCalculator obj2 = new SuperCalculator();
        int r1 = obj.add;
        obj.action();

        //private
        // int test = obj1.sub;

        // Protected
        int test = obj2.test;
        System.out.println(test);
    }
}
