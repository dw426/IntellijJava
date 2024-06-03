package Chap_3;

public class OperatorEx14 {
    public static void main(String[] args){
        char c = 'a';
        for(int i = 0; i<26; i++){
            System.out.print(c++);
        }
        System.out.println(); // 줄 바꿈

        c = 'A';
        for (int i = 0; i < 26; i++){
            System.out.print(c++);
        }
        System.out.println(); // 줄 바꿈

        c = '0';
        for (int i = 0; i < 10; i++){
            System.out.print(c++);
        }
        System.out.println(); // 줄 바꿈
    }
}
