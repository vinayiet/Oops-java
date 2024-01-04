import java.util.Scanner;

// What is method ?
//A block of code which can be executed to perform a specific task and the same code is reusable
public class main {
    // method for the sum of the two numbers
    public static int add(int a, int b) {
        return a + b;
    }

    public static void main(String args[]) {
        System.out.println("Enter the two numbers");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(add(a, b));
    }

}
