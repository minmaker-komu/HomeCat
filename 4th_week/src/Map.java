import java.util.Scanner;

public class Map{
    Cat cat;
    public Map (Cat cat){
        this.cat = cat;
    }
    fishman fishman = new fishman(cat);
    kid kid = new kid(cat);
    worker worker = new worker(cat);
    puppy puppy = new puppy(cat);
    Scanner scan = new Scanner(System.in);
    void show_map(){

    }

}
class stores extends Map{
    public stores(Cat cat) {
        super(cat);
    }

    @Override
    void show_map() {
        // 상점가
        System.out.println("▶ 상점가입니다.");
        System.out.println("1. 선물 찾기");
        System.out.println("2. 그냥 돌아다니기");
        int answer_where = scan.nextInt();
        switch (answer_where){
            case 1:
                System.out.println("바닥에 무언가가 떨어져있습니다.");
                System.out.println("주울까요?");
                System.out.println("1. 네");
                System.out.println("2. 아니요");
                int answer_pick = scan.nextInt();
                if(answer_pick == 1){
                    cat.pickGift();
                }
                else {
                    break;
                }
                break;
            case 2:
                System.out.println("▶ 생선가게 앞에 아저씨가 있습니다.");
                System.out.println("▶ 생선가게로 가겠습니까?");
                System.out.println("1. 네");
                System.out.println("2. 아니오");
                int answer_fishShop = scan.nextInt();
                switch (answer_fishShop){
                    case 1:
                        // 생선가게아저씨
                        fishman.show();
                        fishman.show_whatToDo();
                        break;
                    case 2:
                        System.out.println("▶ 지도로 돌아갑니다.");
                        break;
                }
                break;
        }
    }
}
