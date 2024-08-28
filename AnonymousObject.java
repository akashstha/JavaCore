//Anonymous Object: Anonymous object do not have a reference object and its can be called from the class.But every time, you will have to call the a anonymous object as a whole becuase we dont have any reference oject to point it out.
class Person{

    public Person(){
        System.out.println("Constructor has been called!!");
    }

    public void show(){
        System.out.println("Show message has been called!");
    }
}

public class AnonymousObject{
    public static void main(String[] args) {
        new Person();
        new Person().show();
        new Person().show();
        
        System.out.println("===============");
       //Reference object:
       Person obj1 = new Person();
       obj1.show();


        
    }
}