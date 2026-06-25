import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {
        // int[] array= new int[5];
        // int[] arr1 ={1,2,3,4,5};   //normal initializing
        Scanner in = new Scanner(System.in);
        int[] array= new int[5];           
        for(int j=0; j<array.length;j++){        
            array[j]=in.nextInt();
         }   

        // int[] arr1 ={1,2,3,4,5}; 
        // for (int i=0;i<5;i++){       //for(i=0; i<arr1;i++)if array size is unknown
        //     System.out.print(arr1[i]+" ");

        // // }
        // int max = array[0];
        // for(int i=0;i<array.length;i++){
        //     if(max<array[i]){        //maximum value
        //         max=array[i];
        //     }
        // }System.out.println(max);
    }
    
}         


      
