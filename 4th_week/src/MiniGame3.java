import java.util.Random;
import java.util.Scanner;

public class MiniGame3 {
    public static boolean inputCheck;
    // 구구단 게임
    Scanner scan = new Scanner(System.in);
    Random random = new Random();
    int result =0;
    void play(){
        GameTimer gt = new GameTimer();
        System.out.println("▶ 구구단 게임을 시작합니다.");
        int a = random.nextInt(9)+1;
        int b = random.nextInt(9)+1;
        System.out.println(a+"x"+b+"= ?");
        // 카운트 다운 스레드 실행
        gt.start();
        int answer = scan.nextInt();
        if(inputCheck == false){
            return;
        }
        inputCheck = true;
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
class GameTimer extends Thread{
    @Override
    public void run() {
        for(int i=5; i>=1; i--){
            if(MiniGame3.inputCheck==true){
                return;
            }
            //System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("시간이 초과되었습니다.");
        System.out.println("졌습니다. 게임을 종료하려면 0을 눌러주세요");
        return;
    }
}
