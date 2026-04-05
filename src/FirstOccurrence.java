import java.util.*;

public class FirstOccurrence {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read N and K
        int n = sc.nextInt();
        int k = sc.nextInt();

        // Read array elements
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Find first occurrence
        int position = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == k) {
                position = i + 1; // 1-based index
                break;
            }
        }

        // Print result
        System.out.println(position);

        sc.close();
    }
}