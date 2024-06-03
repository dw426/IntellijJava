package Chap_3;

import java.util.Scanner;

public class q2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int x;
        int y;

        System.out.print("x: ");
        x = sc.nextInt();
        System.out.print("y: ");
        y = sc.nextInt();

        System.out.println("두 수의 합: " + (x+y));
        System.out.println("두 수의 차: " + (x-y));
        System.out.println("두 수의 곱: " + (x*y));
        System.out.println("두 수의 평균: " + ((x+y) / 2));

        int max = ( x > y) ? x : y;
        System.out.println("큰 수: " + max);

        int min = (x < y) ? x : y;
        System.out.println("작은 수: " + min);
    }
}
