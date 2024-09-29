/*
 * Expection : expection handles the run time error. Exception returns the object in the runtime error!
 */

public class Exception {
    public static void main(String[] args) {
        
        int i = 0;
        int j = 0;

        try
        {
            j = 18/i;
        }
        catch(java.lang.Exception e)
        {
            System.out.println("Something went wrong!!");
        }


         System.err.println(j);
         System.err.println("Last Statement");


    }
}
