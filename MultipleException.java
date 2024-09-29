/*
 * Multiple Exception :  we can use mutiple catch block with the specific expection error. Parents expection should be used on the last statement.
 */
public class MultipleException {
    public static void main(String[] args) {
        
        int i = 2;
        int j = 0;
        int arr[] = new int[5];
        String k = null;

        try {
            j = 18/i;
            System.out.println(k.length());
            System.out.println(arr[5]);
        } 
        catch(ArithmeticException e){
            System.err.println("This error is :" + e);
        }
        catch(IndexOutOfBoundsException e){
        System.err.println("this error is from : "  +e);
        }
        catch (java.lang.Exception e) {
            System.out.println("Something went wrong from Parents Exceptions!!" + e);
        }

        System.out.println("Last Statement!");

    }
}
