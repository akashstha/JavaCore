public class whileLoop{

    public static void main(String[] args) {
        int i = 1;
        while (i<=4) { 
            System.out.println("Print the First Loop");
            var j = 2;
            while(j <=3){
                System.out.println("Print the Second Loop for 2 times!");
                j++;
            }
            i++;
        }
    }
}