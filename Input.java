import java.util.Scanner;

public class Input {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter first grade: ");
        int n1 = sc.nextInt();
        
        System.out.print("Enter second grade: ");
        int n2 = sc.nextInt();
        
        System.out.print("Enter the third grade: ");
        int n3 = sc.nextInt();
        
        System.out.println("The mean is " + (n1 + n2 + n3) / 3);
        
        sc.close();
    }
}
