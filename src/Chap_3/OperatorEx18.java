package Chap_3;

public class OperatorEx18 {
    public static void main(String[] args){
        double pi = 3.141592;
        double shortPi = Math.round(pi * 1000) / 1000.0; // round메서드는 매개변수로 ㅂ다은 값을 소수점 첫째자리에서 반올림하고 그 결과를 정수로 출력
        System.out.println(shortPi);
    }
}
