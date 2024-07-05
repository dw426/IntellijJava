package Question;

import java.util.*;
import java.util.Random;

public class q1 {
        public static void main(String[] args) {
            Random r = new Random();
            Scanner sc = new Scanner(System.in);
            String conti;

            do {
                int k = r.nextInt(100);
                int num = -1;

                System.out.println("UP&DOWN 게임에 오신 것을 환영합니다!");
                System.out.println("0에서 99까지의 수를 맞춰보세요.");

                while (num != k) {
                    System.out.print("숫자를 입력하시오 : ");
                    num = sc.nextInt();

                    if (num < k) {
                        System.out.println("더 높게");
                    } else if (num > k) {
                        System.out.println("더 낮게");
                    } else {
                        System.out.println("정답입니다");
                    }
                }

                System.out.print("게임을 반복하시겠습니까? yes/no : ");
                conti = sc.next();

            } while (conti.equals("yes"));

            System.out.println("게임을 종료합니다.");
            sc.close();
        }
    }

