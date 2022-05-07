import java.util.Random;
import java.util.Scanner;

public class MiniGame3 {
    // 구구단 게임
    Scanner scan = new Scanner(System.in);
    Random random = new Random();
    int result =0;
    void play(){
        System.out.println("▶ 구구단 게임을 시작합니다.");
        int a = random.nextInt(9)+1;
        int b = random.nextInt(9)+1;
        System.out.println(a+"x"+b+"= ?");
        int answer = scan.nextInt();
        int c = a*b;
        if(answer == c){
            System.out.println("정답입니다!");
            result =1;
        }
        else{
            System.out.println("틀렸습니다..");
            System.out.println("답은"+c+"입니다");
            result =0;
        }
    }
}
