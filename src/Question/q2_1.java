package Question;

public class q2_1 {
    public static void main(String[] args){
        for(int i = 1; i <= 100; i++){
            int check1 = i / 10;
            int check2 = i % 10;
            int result = 0;

            switch(check1){
                case 3:
                case 6:
                case 9:
                    result++;
                    break;
                default:
                    break;
            }
            switch(check2){
                case 3:
                case 6:
                case 9:
                    result++;
                    break;
                default:
                    break;
            }
            switch(result){
                case 2:
                    System.out.println(i + "박수두번->주의");
                    break;
                case 1:
                    System.out.println(i + "박수한번");
                    break;
                default:
                    break;
            }
        }
    }
}
