import java.util.Scanner;

public class ScannerTest {

    public static void main(String[] args){

        // this will allow user to enter any character from their console.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character:");
        char c = scanner.next().charAt(0);
        System.out.println("value =" + c);

    }
}
