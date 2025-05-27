package Templates;

import java.util.Scanner;

public class Simpletemplate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            System.out.println(solution(n, m));
        }
    }

    static int solution(int n, int m) {
        return 0;
    }
}
