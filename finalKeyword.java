//Final: final keyword lock the variable, method or class and does not allow it to be used again. In another words, it is a CONSTANT

class Calculator{
   final public void show(){
    System.out.println("This is make in Calculator");
   }
   public void add(){
    System.out.println("This will add the numder");
   }
}

class AdvanceCalculator extends Calculator{ 
    // public void show(){
    //     System.out.println("This is make in AdvanceCalculator");
    //    }
}


public class finalKeyword {
    public static void main(String[] args) {
        AdvanceCalculator obj = new AdvanceCalculator();
        obj.show();
    }
}
