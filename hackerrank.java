import java.util.Scanner;

public class hackerrank{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for(int i = 0; i < n; i++){
            int sqre = i * i;
            System.out.println(sqre);
        }
    }
}