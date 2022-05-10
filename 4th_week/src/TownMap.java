import java.util.Scanner;

public class TownMap {
    Scanner scan = new Scanner(System.in);
    public void show_map(){

    }
}
class store extends TownMap{
    @Override
    public void show_map() {
        System.out.println("▶ 상점가입니다.");
        System.out.println("1. 선물 찾기");
        System.out.println("2. 그냥 돌아다니기");
        //int answer_stores = scan.nextInt();
        Music click3 = new Music("086_팝.mp3",false);
        click3.start();
    }
}
