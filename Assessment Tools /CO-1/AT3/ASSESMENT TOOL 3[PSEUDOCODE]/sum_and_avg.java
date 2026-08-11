import java.util.Scanner;

public class SumAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1, n2, n3, n4, n5, sum;
        float avg;

        System.out.print("Enter five numbers: ");
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        n3 = sc.nextInt();
        n4 = sc.nextInt();
        n5 = sc.nextInt();

        sum = n1 + n2 + n3 + n4 + n5;
        avg = sum / 5.0f;

        System.out.println("Sum = " + sum);
        System.out.println("Average = " + avg);
    }
}
