 class Mobile{
    String brand;
    int price;
    static String name;

    public Mobile(){
        brand="DefaultPhone";
        price = 0;
        System.out.println("constructor"+ brand + " : "+ price+ " : " + name);

    }

    public void show()
    {
        System.out.println(brand + " : "+ price+ " : " + name);
    }

    public static void staticShow(Mobile obj)
    {
        System.out.println("This is a static Method call: "+obj.brand + " : "+ obj.price+ " : " + name);
    }
}

public class staticBlock{
    public static void main(String[] args) {

        Mobile obj1= new Mobile();
        obj1.brand = "Iphone";
        obj1.price = 1500;
        obj1.show();

        
    }
}