import java.util.Scanner;

public class polynomial {

    // Function to add two polynomials
    static int[] add(int[] p1, int[] p2, int maxDegree) {
        int[] res = new int[maxDegree + 1];
        for (int i = 0; i <= maxDegree; i++) {
            res[i] = p1[i] + p2[i];
        }
        return res;
    }

    static void display(int[] p, int maxDegree) {
        for (int i = maxDegree; i >= 0; i--) {
            if (i == 0) {
                System.out.print(p[i] + "x^" + i);
            } else {
                System.out.print(p[i] + "x^" + i + "+");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] p1 = new int[100];
        int[] p2 = new int[100];
        int maxDegree = 2;

        System.out.println("Enter first polynomial:\n");
        for (int i = 0; i <= maxDegree; i++) {
            System.out.print("Enter the coefficient of x^" + i + ": ");
            p1[i] = sc.nextInt();
        }

        System.out.println("Enter second polynomial:\n");
        for (int i = 0; i <= maxDegree; i++) {
            System.out.print("Enter the coefficient of x^" + i + ": ");
            p2[i] = sc.nextInt();
        }

        int[] res = add(p1, p2, maxDegree);

        display(p1, maxDegree);
        display(p2, maxDegree);
        display(res, maxDegree);

        sc.close();
    }
}

