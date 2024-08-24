public class stringBuffer{

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("This is Core Java Project");

        sb.append(" which is awesome!");
        sb.delete(8, 13);

        System.out.println(sb);


    }
}