
//This keyword: this keyword refer to the object that is calling the method of the class

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
public class thisKeyword{
    public static void main(String[] args) {
        
         Human obj = new Human();
        obj.setAge(32);
        obj.setName("John");

         Human obj1 = new Human();
        obj1.setAge(52);
        obj1.setName("Tom");

        System.out.println(obj.getAge());
        System.out.println(obj.getName());

        System.out.println(obj1.getAge());
        System.out.println(obj1.getName());
    }
}