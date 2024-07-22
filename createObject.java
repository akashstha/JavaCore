class Calculator{

    public int add(int num1 , int num2){
        int result = num1 + num2;
        return result;
    }
}
 public class createObject{
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int num1 = 15;
        int num2 = 10;
        int result = calc.add(num1, num2);
        System.out.println(result);
    }
}