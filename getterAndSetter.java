
//Getter and Setter: getter and setter are methods that are called to get or set the variable of a class.

class Human{
    private int age;
    private String name;
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
public class getterAndSetter{
    public static void main(String[] args) {
        
         Human obj = new Human();
        obj.setAge(32);
        obj.setName("John");

        System.out.println(obj.getAge());
        System.out.println(obj.getName());
    }
}