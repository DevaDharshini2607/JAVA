import java.util.Scanner;

public class Condition {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int a = n.nextInt(); 
        int b = n.nextInt();
        int c = n.nextInt();
        if (a>b && a>c){
            System.out.println("a is larger");
                   
        }
        else if (b>a && b>c){
            System.out.println("b is larger");
        }
            
        else{

            System.out.println("c is larger");
        }

    }
    
}

