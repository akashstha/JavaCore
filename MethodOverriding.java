//Method overriding: if the 2 classes has the same method, then the preference will be given to the child class method

class Calculator{

    public int add(int n1, int n2){
        return n1+n2;
    }
}

class AdvanceCalculator extends Calculator{

    public int add(int n1, int n2){
        return n1+n2+10;
    }
}


public class MethodOverriding {
    public static void main(String[] args) {
     AdvanceCalculator obj = new AdvanceCalculator();
     int addValue = obj.add(5, 5);
    System.out.println(addValue);        
    }
}
