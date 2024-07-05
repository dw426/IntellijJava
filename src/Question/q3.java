package Question;

public class q3 {
    public static void main(String[] args){
        for(int i = 1; i <= 100; i++) {
            int check1 = i / 10;
            int check2 = i % 10;
            int result = 0;

            if(check1 == 3 || check1 == 6 || check1 == 9) {
                result++;
            }
            if(check2 == 3 || check2 == 6 || check2 == 9) {
                result++;
            }
            if(result == 2) {
                System.out.println(i + " 박수두번->주의");
            } else if(result == 1) {
                System.out.println(i + " 박수한번");
            }
        }
    }
}
