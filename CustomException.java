class CustomExceptions extends java.lang.Exception{
    public CustomExceptions(String str){
        super(str);
    }
}

public class CustomException {
    public static void main(String[] args) {
        int i = 20;
        int j = 0;
        try{
            j = 13/i;
            if(j ==0) throw new CustomExceptions("this is from throw!");
        }
        catch(ArithmeticException e){
            System.out.println("Message:" + e);
        }
        catch(CustomExceptions e){
            System.out.println("Custom Exception:" + e);
        }
        catch(java.lang.Exception e){
            System.out.println("This is common exception" + e);
        }

        System.out.println("Print last statement!");
    }
}
