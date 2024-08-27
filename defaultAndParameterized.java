//Default and Parameterized constructor: default constructors comes by itself in a class. Parameterized constructor expect the value from the object.

class Human{
    private int age;
    private String name;


    public Human() {
        age = 63;
    }
    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

   
}
public class defaultAndParameterized{
    public static void main(String[] args) {
        
         Human obj = new Human(20,"secondPerson");
         Human obj1 = new Human();

        System.out.println(obj.getAge());
        System.out.println(obj.getName());

        System.out.println(obj1.getAge());
        System.out.println(obj1.getName());

    
    }
}