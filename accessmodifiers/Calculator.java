package accessmodifiers;

public class Calculator {
     private int sub = 4;
}

class Demo{
    Calculator obj1 = new Calculator();
    // int r1 = obj1.sub; cannot be accessible
}
