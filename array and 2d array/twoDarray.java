public class twoDarray {
    public static void main(String[] args) {
        int arr[][]={{2,3},{5,3,4,8},{4,2}};
        System.out.println("2d array elements are");
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
    
}
