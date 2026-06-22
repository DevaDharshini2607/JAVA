import java.util.Scanner;
public class Nestedloop {
    public static void main(String[] args) {
        // for(int i=1;i<6;i++)
        // {
        //     for(int j=1;j<6;j++){        //repeation
        //         System.out.print(j+" ");
                
        //     }
        // }
        Scanner n=new Scanner(System.in);
         int a= n.nextInt();
         char b=n.next().charAt(0);
        // for(int i=1;i<=a;i++)
        //     {
        //       for(int j=1;j<=a;j++){
        //           System.out.print(b+" ");        //printing square
                
        //      }
        //      System.out.println(" ");
        //  }
        //  for(int i=1;i<=a;i++)
        //       {
        //        for(int j=1;j<=i;j++){
        //             System.out.print(j+" ");     //printing Triangle "numbers"
                
        //       }
        //       System.out.println(" ");
        //  }
        // for(int i=a;i>=1;i--)
        //       {
        //        for(int j=1;j<=i;j++){
        //             System.out.print(j+" ");     //printing reverse Triangle "numbers"
                
        //       }
        //       System.out.println(" ");
        //  }
    //     for(int i=0 ;i<=a;i++)
    //           {
    //            for(int j=1;j<= a-i;j++){
    //                 System.out.print(j+" ");     //printing  Triangle numberswith space
    //                                             //different method using formula              }
    //      }
    //                    System.out.println(" ");
    // }
     for(int i=1 ;i<=a;i--)
              {
               for(int j=1;j<=a-i;j++){
                    System.out.print(" ");     //printing reverse Triangle numbers
                                                //different method using formula              }
               }
                for(int j=1;j<=(i*2-1);j++){
                    System.out.print("*");
                 }
                       System.out.println();
                 
    }
    
 }
}

