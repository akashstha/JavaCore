public class jaggedArray{
    public static void main(String[] args) {
        int arr [][] = new int [3][];
        arr[0] = new int[3];
        arr[1] = new int[4];
        arr[2] = new int[2];

        // System.err.println(arr[1].length); 
        for(int i = 0;i< arr.length;i++){
            for(int j = 0;j<arr[i].length;j++){
             arr[i][j] = (int)(Math.random()*10);
            }
        }

        for(int a[]:arr){
            for(int n:a){
                System.out.print( " " +n);
            }
            System.out.println();
        }
    }
}