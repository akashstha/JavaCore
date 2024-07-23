public class multiDimensionalArray{
    public static void main(String[] args) {
        int arr[][] = new int[3][4];


        

        for(int i = 0;i<=2;i++){
            for(int j = 0;j<=3;j++){
                arr[i][j] = (int)(Math.random()*10); 
                // System.out.print(arr[i][j] + " "); 
            }
                // System.out.println();
        }

        for(int a[]:arr){
            for(int n:a){
                System.out.print(n + " ");
            }
                System.out.println();
        }
}
}