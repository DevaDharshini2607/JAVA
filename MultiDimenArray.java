import java .util.Scanner;
public class MultiDimenArray {
    public static void main(String[] args) {
        //Scanner 
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int m= sc.nextInt();
        int [][] arr= new int[n][m];
        //input
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        //output loop
        // for(int i=0;i<n;i++){
        //     for(int j=0; j<m ; j++){
        //         System.out.print(arr[i][j]+" ");
        //     }
        //     System.out.println();
        // }
        
        // int sum=0;
        // for(int i=0;i<n;i++){
        //     for(int j=0; j<m ; j++){         //sum of all element
        //      sum += arr[i][j];
        //     }
           
        // }
        //  System.out.println(sum);
        
        // for(int i=0;i<n;i++){
        //     int rowsum=0;
        //     for(int j=0; j<m ; j++){
        //       rowsum += arr[i][j];                      //Row sum
        //     }
        //    System.out.println(rowsum);
        // }
         
         
        for(int j=0;j<n;j++){
            int colsum=0;
            for(int i=0; i<m ; i++){
                
                colsum += arr[i][j];      //colsum
            }
            System.out.println(colsum);
        }
         
    }
    
}
