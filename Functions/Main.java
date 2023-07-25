package Functions;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
    
    
        // System.out.print("Enter the first no. ");
        // int num1 = in.nextInt();
        // System.out.print("Enter the second no. ");
        // int num2 = in.nextInt();
        // int sum = num1 + num2;
        // System.out.println("The sum of the two no. is " + sum);
        sum();

    }

    static void sum() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter no. 1 ");
        int num1 = in.nextInt();
        System.out.println("Enter no. 2 ");
        int num2 = in.nextInt();
        int add = num1 +num2;
        System.out.println("The sum is "+ add);
    }
}