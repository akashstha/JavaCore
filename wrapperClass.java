public class wrapperClass {
    public static void main(String[] args) {
        
        int num = 8;
        Integer num1 = num;
    
        // System.out.print(num1); // auto-boxing


        
        // Integer num2 = 5;
        int num3 = num1;
        // System.out.print(num); // auto-boxing
        
        
        String b = "10";
        int convert = Integer.parseInt(b);
        
        System.out.print(convert*2); // auto-boxing
    }
}
