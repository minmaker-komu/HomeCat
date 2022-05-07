import java.util.Random;
import java.util.Scanner;

public class MiniGame4 {
    // 21 게임
    Scanner scan = new Scanner(System.in);
    Random random = new Random();
    int result =0;
    void play(){

        int randomNum = random.nextInt(21)+1;
        int user_num1 = random.nextInt(13)+1;
        int user_num2 = random.nextInt(13)+1;
        System.out.println("▶ 21 게임입니다.");
        System.out.println("▶ 카드의 합이 21 또는 21에 가장 가까운 숫자를 가지는 쪽이 이기는 게임입니다.");
        System.out.println("▶ 숫자가 같을 경우에는 집니다.");
        System.out.println("첫번째카드는 "+user_num1+"입니다. 카드를 더 뽑으시겠습니까?");
        System.out.println("1. 네");
        System.out.println("2. 아니오");
        int answer = scan.nextInt();
        if(answer == 1){
            System.out.println("두번째카드는 "+user_num2+"입니다.");
            if(randomNum < user_num1+user_num2 && user_num1 + user_num2 <21){
                System.out.println("당신의 결과는 "+(user_num1+user_num2)+"입니다!");
                System.out.println("00의 결과는 "+randomNum+"입니다!");
                System.out.println("이겼습니다!");
                result = 1;
            }
            else if(user_num1 + user_num2 > 21){
                System.out.println("당신의 결과는 "+(user_num1+user_num2)+"입니다!");
                System.out.println("00의 결과는 "+randomNum+"입니다!");
                System.out.println("21이 넘었습니다.");
                System.out.println("졌습니다!");
                result = 0;
            }
            else if(randomNum > user_num1+user_num2){
                System.out.println("당신의 결과는 "+(user_num1+user_num2)+"입니다!");
                System.out.println("00의 결과는 "+randomNum+"입니다!");
                System.out.println("졌습니다!");
                result = 0;
            }
            else if(randomNum == user_num1+user_num2){
                System.out.println("당신의 결과는 "+(user_num1+user_num2)+"입니다!");
                System.out.println("00의 결과는 "+randomNum+"입니다!");
                System.out.println("졌습니다!");
                result = 0;
            }
        }
        else {
            System.out.println("당신의 결과는 "+user_num1+"입니다!");
            if(randomNum < user_num1){
                System.out.println("당신의 결과는 "+user_num1+"입니다!");
                System.out.println("00의 결과는 "+randomNum+"입니다!");
                System.out.println("이겼습니다!");
                result = 1;
            }
            else if(randomNum > user_num1){
                System.out.println("당신의 결과는 "+user_num1+"입니다!");
                System.out.println("00의 결과는 "+randomNum+"입니다!");
                System.out.println("졌습니다!");
                result = 0;
            }
            else if(randomNum == user_num1){
                System.out.println("당신의 결과는 "+user_num1+"입니다!");
                System.out.println("00의 결과는 "+randomNum+"입니다!");
                System.out.println("졌습니다!");
                result = 0;
            }
        }
    }
}
