import java.util.Scanner;

public class BitReset {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int A = scanner.nextInt();
        int i = scanner.nextInt();
        
        int result = A & (~((1 << i) - 1));
        
        System.out.println(result);
    }
}
