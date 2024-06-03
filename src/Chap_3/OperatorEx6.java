package Chap_3;

public class OperatorEx6 {
    public static void main(String[] args){
        byte a = 10;
        byte b = 20;
        byte c = (byte)(a + b); // 명시적으로 형변환을 해줘야 한다.
        System.out.println(c);
    }
}
