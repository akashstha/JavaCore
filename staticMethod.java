 class Mobile{
    String brand;
    int price;
    static String name;

    public void show()
    {
        System.out.println(brand + " : "+ price+ " : " + name);
    }

    public static void staticShow(Mobile obj)
    {
        System.out.println("This is a static Method call: "+obj.brand + " : "+ obj.price+ " : " + name);
    }
}

public class staticMethod{
    public static void main(String[] args) {

        Mobile obj1= new Mobile();
        obj1.brand = "Iphone";
        obj1.price = 1500;

        Mobile obj2 = new Mobile();
        obj2.brand = "Smasung";
        obj2.price = 1700;

        Mobile.name = "Smart Phone"; // static variable will be common among all the object
        obj1.show();
        obj2.show();

        Mobile.staticShow(obj1);
        Mobile.staticShow(obj2);
        
    }
}