import java.io.*;
import java.util.*;

// printing stars horizontally and vertically

public class NStars {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // Print stars on the same line with spaces
        for (int i = 0; i < n; i++) {
            System.out.print("* ");
        }
        System.out.println(); // Move to the next line after the first pattern

        // Print stars on separate lines
        for (int i = 0; i < n; i++) {
            System.out.println("*");
        }
        sc.close();
    }
}
