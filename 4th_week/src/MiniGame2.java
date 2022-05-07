import java.util.Random;
import java.util.Scanner;

public class MiniGame2 {
    Scanner scan = new Scanner(System.in);
    Random random = new Random();
    int result = 0;
    void play(){
        // 홀짝 게임
        int randomNum = random.nextInt(30)+1;
        System.out.println("▶ 홀짝 게임입니다.");
        System.out.println("▶ 1~30까지의 숫자중 랜덤으로 숫자가 뽑힙니다.");
        System.out.println("▶ 홀인지 짝인지 맞춰주세요~!");
        System.out.println("홀~짝!");
        System.out.println("1. 홀");
        System.out.println("2. 짝");
        int answer_odd = scan.nextInt();
        if(randomNum%2==0){
            System.out.println(randomNum);
            System.out.println("▶ 짝입니다.");
            if(answer_odd==2){
                System.out.println("▶ 정답입니다!!");
                result = 1;
            }
            else {
                System.out.println("▶ 틀렸습니다..");
                System.out.println("▶ 다음에 다시 도전해주세요");
                result = 0;
            }
        }
        else {
            System.out.println(randomNum);
            System.out.println("▶ 홀입니다.");
            if(answer_odd==1){
                System.out.println("▶ 정답입니다!!");
                result = 1;
            }
            else {
                System.out.println("▶ 틀렸습니다..");
                System.out.println("▶ 다음에 다시 도전해주세요");
                result = 0;
            }
        }
    }
}
