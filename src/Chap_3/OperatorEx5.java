package Chap_3;

public class OperatorEx5 { //사칙연산
    public static void main(String[] args){
        int a = 10;
        int b = 4;

        System.out.printf("%d + %d = %d\n", a, b, a + b);
        System.out.printf("%d - %d = %d\n", a, b, a - b);
        System.out.printf("%d * %d = %d\n", a, b, a * b);
        System.out.printf("%d / %d = %d\n", a, b, a/b);
        System.out.printf("%d / %f = %f\n", a, (float)b, a / (float)b);

    }
}
