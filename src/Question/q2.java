package Question;

import java.util.Scanner;
public class q2 {
    public static void main(String[] args){
        int[] n = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자를 입력하세요>> ");

        for(int i = 0; i < n.length; i++){
            n[i] = sc.nextInt();
        }

        for(int i = 0; i < 10; i++){
            if(n[i] % 3 == 0){
                System.out.println(n[i] + " ");
            }
        }
    }
}
