import java.util.Random;
import java.util.Scanner;

public class MiniGame1 extends Thread {
    public boolean inputCheck;
    Scanner scan = new Scanner(System.in);
    Random random = new Random();
    // 게임 결과
    int result = 0;
    int play(){
        // 가위바위보 게임
        int randomNum = random.nextInt(30)+1;
        String rsp;
        if(randomNum < 10){
            rsp = "가위";
        }
        else if(randomNum < 20 && randomNum > 10){
            rsp = "바위";
        }
        else {
            rsp = "보";
        }
        System.out.println("▶ 가위바위보 게임입니다.");
        System.out.println("가위 바위 보!");
        System.out.println("1. 가위");
        System.out.println("2. 바위");
        System.out.println("3. 보");
        int answer1 = scan.nextInt();
        inputCheck = true;
        switch (answer1){
            case 1:
                if(rsp.equals("가위")){
                    System.out.println("비겼습니다!");
                    result = 0;
                }
                else if(rsp.equals("바위")){
                    System.out.println("졌습니다!");
                    result = 0;
                }
                else {
                    System.out.println("이겼습니다!");
                    result = 1;
                }
                break;
            case 2:
                if(rsp.equals("가위")){
                    System.out.println("이겼습니다!");
                    result = 1;
                }
                else if(rsp.equals("바위")){
                    System.out.println("비겼습니다!");
                    result = 0;
                }
                else {
                    System.out.println("졌습니다!");
                    result = 0;
                }
                break;
            case 3:
                if(rsp.equals("가위")){
                    System.out.println("졌습니다!");
                    result = 0;
                }
                else if(rsp.equals("바위")){
                    System.out.println("이겼습니다!");
                    result = 1;
                }
                else {
                    System.out.println("비겼습니다!");
                    result = 0;
                }
                break;
        }
        return result;
    }
}
