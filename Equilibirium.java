import java.util.Scanner;

public class Equilibirium {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc. nextInt();
        int[] arr= new int[n];
        for(int i=0; i<n;i++){
            arr[i]=sc.nextInt();
        }
        
        for(int i=1;i<n-1;i++){
            int sumL=0;
             int sumR=0;
            for(int j=i-1;j>=0;j--){
                sumL+= arr[j];

            }
            for(int l=i+1;l<n;l++){
                sumR +=arr[l];

            }
            if(sumL==sumR){
                System.out.println(i);
                break;
            }
        } 
    }
    
}
