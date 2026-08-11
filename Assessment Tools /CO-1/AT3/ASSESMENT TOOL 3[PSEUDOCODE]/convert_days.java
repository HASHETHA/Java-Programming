import java.util.Scanner;

public class DaysConvert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int days, years, months, weeks, rem;

        System.out.print("Enter number of days: ");
        days = sc.nextInt();

        years = days / 365;
        rem = days % 365;

        months = rem / 30;
        rem = rem % 30;

        weeks = rem / 7;
        rem = rem % 7;

        System.out.println("Years = " + years);
        System.out.println("Months = " + months);
        System.out.println("Weeks = " + weeks);
        System.out.println("Days = " + rem);
    }
}
