//Encapsulation: Encapulation is a process of not sharing the variable of a class directly to other classes or object, instead encapsulation uses the method to share those details. 

class Human{
    private int age;
    private String name;

    public void setAge(int a){
     age = a;
    }

    public int getAge(){
        return age;
    }

    public void setName(String n){
        name = n;
    }
    public String getName(){
        return name;
    }
}

public class encapsulation{
    public static void main(String[] args) {
        Human obj = new Human();
        obj.setAge(32);
        obj.setName("John");

        System.out.println(obj.getAge());
        System.out.println(obj.getName());
    }
}