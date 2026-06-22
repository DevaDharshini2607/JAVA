import java.util.Scanner;

public class SimpleIntrest {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int p = n.nextInt();
        int r = n.nextInt();
        int t = n.nextInt();
       int SI=(p*r*t)/100;
        System.out.println(SI);
    }
    
}
