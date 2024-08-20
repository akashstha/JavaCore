public class stringExample{

    public static void main(String[] args) {
        String x1 = "this is a good code";
        String p1 = "this is a good code";
        String s1 = new String("this is another example");
        String f1 = new String("tthis is a good code");

        System.out.println(x1);;
        System.out.println(s1);;
        System.out.println(x1 == f1);;
        System.out.println(x1 == p1);
        System.out.println(x1.hashCode());
        System.out.println(x1.concat(" and " + s1));
    }
}