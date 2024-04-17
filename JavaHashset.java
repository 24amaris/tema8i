import javafx.util.Pair;
import java.util.HashSet;
import java.util.Scanner;

public class JavaHashset {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        int T = scanner.nextInt();  
        scanner.nextLine();  // Consuming the newline after integer input
        
        var pairs = new HashSet;
        
        for (int i = 0; i < T; i++) {
            var line = scanner.nextLine();
            var parts = line.split(" ");
            
            pairs.add(pair);
            
            System.out.println(pairs.size());
        }
        
        scanner.close();
    }
}
