//constructor: constructor is a method that holds the default value of the class and always loads when class is being called by the object. constructor name should be the same as a Class name.

class Human{
    private int age;
    private String name;

    public Human(){
        age = 40;
        name = "Kyle";
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
public class constructor{
    public static void main(String[] args) {
        
         Human obj = new Human();
         Human obj1 = new Human();

        System.out.println(obj.getAge());
        System.out.println(obj.getName());

        System.out.println(obj1.getAge());
        System.out.println(obj1.getName());

    
    }
}