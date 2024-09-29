@FunctionalInterface
interface Number{
    int add(int i, int j);
}

public class LamdaReturn {
   
public static void main(String[] args) {
    
    Number obj = (i,j) -> i+j;

    int results = obj.add(5,5);
    System.out.println(results);


}
}
