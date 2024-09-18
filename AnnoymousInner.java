/*
 * Annoymous Inner class : we can create a annoymous inner class direclty from the instance of the class. 
 * no name is required for the class.
 */

class FirstClass{

    public void show(){
        System.out.print("This is from the First class");
    }
}


public class AnnoymousInner{
    public static void main(String[] args) {
        FirstClass obj = new FirstClass(){
                @Override
                public void show(){
                    System.out.println("This is call from annoymous Inner class");
                }
        };
        obj.show();
    }
}