/*
 * Throw: Throw keyword are used to throw the exception on the catch block.
 */
public class ThrowKeyboard {
    public static void main(String[] args) {
        
        int i = 20;
        int j = 0;
        try{
            j = 13/i;
            if(j ==0) throw new ArithmeticException("this is from throw!");
        }
        catch(ArithmeticException e){
            System.out.println("Message:" + e);
        }
        catch(java.lang.Exception e){
            System.out.println("This is common exception" + e);
        }

        System.out.println("Print last statement!");
    }
}
