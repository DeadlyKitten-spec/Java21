import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class asd {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("text");
        Scanner scan = new Scanner(file);

        int a = scan.nextInt();
        int b = scan.nextInt();

        System.out.println(a + " " + b);
    }
}
