class methodCalling{

    public int add(int n1, int n2){
    return n1+n2;
    }
    public int add(int n1, int n2, int n3){
    return n1+n2+n3;
    }
    public double  add(double  n1, int n2, int n3){
    return n1+n2+n3;
    }

}

public class methodOverloading{
    public static void main(String[] args) {
        methodCalling obj = new methodCalling();
        System.out.println(obj.add(5, 12));
        System.out.println(obj.add(5, 12, 5));
        System.out.println(obj.add(5, 12, 1000));

    }
}