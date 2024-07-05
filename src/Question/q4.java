package Question;
import java.util.Scanner;
public class q4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] student = new int[31];
        int check = 0;
        for (int i = 1; i < 29; i++) {
            check = sc.nextInt();
            student[check] = 1;
        }

        for (int i = 1; i < student.length; i++) {
            if (student[i] != 1) {
                System.out.println(i);
            }
        }
    }
}