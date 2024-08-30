//ObjectClass = Every Class extends to the Object class. Every class has access to the meethod of the Object. In below example, I have used the method of Object: toString() and equals()

class Laptop{
 int price;
 String name;

 

 @Override
public String toString() {
    return "Laptop [price=" + price + ", name=" + name + "]";
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
        Laptop other = (Laptop) obj;
	if (name == null) {
		if (other.name != null)
			return false;
	} else if (!name.equals(other.name))
		return false;
	return true;
}



public void show(){
    System.out.println(name +" will cost : " + price);
 }

}

public class ObjectClass {
    public static void main(String[] args) {
        Laptop obj1 = new Laptop();
        obj1.price = 1000;
        obj1.name = "Mac";

        Laptop obj3 = new Laptop();
        obj3.price = 1000;
        obj3.name = "Mac";

        // obj1.show();
        System.out.println(obj1.equals(obj3));
    }
}
