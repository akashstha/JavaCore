public class forLoop{
    public static void main(String[] args) {
        
        for(int i = 0;i<6;i++){
            System.out.println("Days"+ i);
            for(int j = 0;j<9;j++){
                System.out.println("working hours -- " + (j+9)+ "--"+ (j+10));
            }
        }
    }
}