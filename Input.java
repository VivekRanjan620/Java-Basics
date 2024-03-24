import java.util.*;

class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // System.in is a standard input stream
        System.out.print("Enter Your age ");
        int age = sc.nextInt();
        // System.out.print("Enter second number- ");
        // int b = sc.nextInt();
        // System.out.print("Enter third number- ");
        // int c = sc.nextInt();
        // int d = a + b + c;
        if (age > 18) {
            System.out.println("Adult");
        } else {
            System.out.println("Not adult");
        }
    }
}