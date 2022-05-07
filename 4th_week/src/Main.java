import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //게임시작
        System.out.println("██╗  ██╗ ██████╗ ███╗   ███╗███████╗     ██████╗ █████╗ ████████╗\n" +
                "██║  ██║██╔═══██╗████╗ ████║██╔════╝    ██╔════╝██╔══██╗╚══██╔══╝\n" +
                "███████║██║   ██║██╔████╔██║█████╗      ██║     ███████║   ██║   \n" +
                "██╔══██║██║   ██║██║╚██╔╝██║██╔══╝      ██║     ██╔══██║   ██║   \n" +
                "██║  ██║╚██████╔╝██║ ╚═╝ ██║███████╗    ╚██████╗██║  ██║   ██║   \n" +
                "╚═╝  ╚═╝ ╚═════╝ ╚═╝     ╚═╝╚══════╝     ╚═════╝╚═╝  ╚═╝   ╚═╝");



        System.out.println("▶ 도전! 집냥이");
        System.out.println("▶ 고양이들이 사는 마을로 출발합니다!");
        // 마을 이름
        String nameTown;
        // 마을 이름 정하기
        System.out.println("▶ 어떤 마을에 갈까요?");
        System.out.println("▶ 마을 이름을 정해주세요");
        while(true){
            nameTown = scan.next();
            System.out.println("마을 이름을 "+nameTown+"로 정하시겠습니까?");
            System.out.println("1. 네");
            System.out.println("2. 아니오 다시 정할래요");
            int answer_TownName = scan.nextInt();
            if(answer_TownName == 1){
                System.out.println(nameTown+"마을로 갑니다!");
                break;
            }
            else{
                System.out.println("마을 이름을 다시 정해주세요!");
            }
        }
        // 마을 가는 중....
        System.out.println(nameTown+"마을에 도착했습니다!");
        // 고양이 고르기
        System.out.println("　 ＿＿ ∧ ∧\n" +
                " ／＼　 (*ﾟ∀ﾟ)＼\n" +
                " ＼／|￣￣∪ ∪￣|＼\n" +
                "　＼|　　〓〓　 |\n" +
                "　　 ￣￣￣￣￣");
        System.out.println("엇 저기 상자에 무언가가 있는 것 같습니다.");
        System.out.println("가까이 가보니 고양이 세마리가 있네요.");
        System.out.println("이 중 한마리를 골라봅시다!");
        System.out.println("고양이 별로 행동 특성이 다릅니다.");
        System.out.println("신중하게 생각해주세요");
        System.out.println("1. 치즈 고양이   (＾• ω •＾)");
        System.out.println("2. 삼색 고양이   (=◉ᆽ◉=)");
        System.out.println("3. 턱시도 고양이  (=\uD83D\uDF66 ༝ \uD83D\uDF66=)");

        int answer_Cat = scan.nextInt();
        // 고양이 생성
        Cat cat = new Cat();
        switch (answer_Cat){
            case 1:
                // 치즈 고양이
                cat = new CheezeCat();
                cat.show();
                break;
            case 2:
                // 삼색 고양이
                cat = new ThreeColorsCat();
                cat.show();
                break;
            case 3:
                // 턱시도 고양이
                cat = new SuitCat();
                cat.show();
        }
        // npc 생성
        fishman fishman = new fishman(cat);
        kid kid = new kid(cat);
        worker worker = new worker(cat);
        puppy puppy = new puppy(cat);

        // 게임 진행 메뉴얼
        while(true){
            System.out.println("---------홈 메뉴--------");
            System.out.println("    1. 지도열기");
            System.out.println("    2. 아이템 주머니 열기");
            System.out.println("    3. 상자로 돌아가기");
            System.out.println("    4. 게임 설명 보기");
            System.out.println("    5. 게임 종료하기");
            System.out.println("-----------------------");
            int answer_menu = scan.nextInt();

            switch (answer_menu){
                // 지도 열기
                case 1:
                    System.out.println("▶ 지도를 열었다.");
                    System.out.println("▶ 어디로 갈까?");
                    System.out.println("--------지도-------");
                    System.out.println("    1. 상점가");
                    System.out.println("    2. 주택가");
                    System.out.println("    3. 도심");
                    System.out.println("    4. 공원");
                    System.out.println("------------------");

                    int answer_place = scan.nextInt();
                    switch (answer_place){
                        case 1:
                            // 상점가
                            System.out.println("▶ 상점가입니다.");
                            System.out.println("1. 선물 찾기");
                            System.out.println("2. 그냥 돌아다니기");
                            int answer_stores = scan.nextInt();
                            switch (answer_stores){
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
                            break;
                        case 2:
                            // 주택가
                            System.out.println("▶ 주택가입니다.");
                            System.out.println("1. 선물 찾기");
                            System.out.println("2. 그냥 돌아다니기");
                            int answer_house = scan.nextInt();
                            switch (answer_house){
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
                                    System.out.println("▶ 학교 앞에 아이가 있습니다.");
                                    System.out.println("▶ 학교 앞으로 가겠습니까?");
                                    System.out.println("1. 네");
                                    System.out.println("2. 아니오");
                                    int answer_school = scan.nextInt();
                                    switch (answer_school){
                                        case 1:
                                            // 초등학생
                                            kid.show();
                                            kid.show_whatToDo();
                                            break;
                                        case 2:
                                            System.out.println("▶ 지도로 돌아갑니다.");
                                            break;
                                    }
                                    break;
                            }

                            break;
                        case 3:
                            // 도심
                            System.out.println("▶ 도심입니다.");
                            System.out.println("1. 선물 찾기");
                            System.out.println("2. 그냥 돌아다니기");
                            int answer_town = scan.nextInt();
                            switch (answer_town){
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
                                    System.out.println("▶ 버스정류장에 누군가가 있습니다.");
                                    System.out.println("▶ 버스정류장으로 가겠습니까?");
                                    System.out.println("1. 네");
                                    System.out.println("2. 아니오");
                                    int answer_busStop = scan.nextInt();
                                    switch (answer_busStop){
                                        case 1:
                                            // 회사원
                                            worker.show();
                                            worker.show_whatToDo();
                                            break;
                                        case 2:
                                            // 지도로 돌아가기
                                            System.out.println("▶ 지도로 돌아갑니다.");
                                            break;
                                    }
                                    break;
                            }
                            break;
                        case 4:
                            // 공원
                            System.out.println("▶ 공원입니다.");
                            System.out.println("1. 선물 찾기");
                            System.out.println("2. 그냥 돌아다니기");
                            int answer_park = scan.nextInt();
                            switch (answer_park){
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
                                    System.out.println("▶ 분수대 앞에 강아지가 있습니다.");
                                    System.out.println("▶ 분수대로 가겠습니까?");
                                    System.out.println("1. 네");
                                    System.out.println("2. 아니오");
                                    int answer_fountain = scan.nextInt();
                                    switch (answer_fountain){
                                        case 1:
                                            // 강아지
                                            puppy.show();
                                            puppy.show_whatToDo();
                                            break;
                                        case 2:
                                            // 지도로 돌아가기
                                            System.out.println("▶ 지도로 돌아갑니다.");
                                            break;
                                    }
                                    break;
                            }
                    }
                    break;
                // 아이템 주머니 열기
                case 2:
                    System.out.println("▶ 주머니 속에 뭐가 있는지 확인해봅시다!");
                    System.out.println("1. 간식 확인하기");
                    System.out.println("2. 선물 확인하기");
                    int pocket = scan.nextInt();
                    switch (pocket){
                        case 1:
                            cat.show_itemList();
                            if(cat.items.isEmpty()){
                                System.out.println("아이템이 하나도 없습니다..");
                            }
                            else {
                                System.out.println("▶ 아이템을 사용하시겠습니까?");
                                System.out.println("1. 네");
                                System.out.println("2. 아니요");
                                int answer_item = scan.nextInt();
                                if(answer_item == 1){
                                    // 아이템 사용하기
                                    cat.usingItem();
                                    System.out.println("  ∧ ∧\n" +
                                            " (´･ω･)  =3\n" +
                                            " /　 ⌒ヽ\n" +
                                            "(人＿＿つ_つ");
                                    System.out.println("▶ 체력이 올랐습니다.");
                                    System.out.println("▶ 체력은 상자에서 확인해주세요");
                                }
                                else {
                                    break;
                                }

                            }
                            break;
                        case 2:
                            cat.show_giftList();
                            if(cat.gifts.isEmpty()){
                                System.out.println("선물이 하나도 없습니다..");
                            }
                            break;
                    }



                    break;
                // 상자로 돌아가기
                case 3:
                    System.out.println("▶ 상자로 돌아왔습니다. 무엇을 할까요?");
                    System.out.println("1. 체력확인하기");
                    System.out.println("2. 낮잠 자기"); // 3시간 정도 지남
                    System.out.println("3. 깊은 잠자기"); // 다음날로 바뀜
                    int answer_sleep = scan.nextInt();
                    switch (answer_sleep){
                        case 1:
                            // 체력확인하기
                            System.out.println("▶ 현재 고양이의 체력은 "+cat.hp+"입니다.");
                            break;
                        case 2:
                            // 낮잠자기
                            cat.napping();
                            break;
                        case 3:
                            // 깊은 잠자기
                            cat.sleeping();
                            break;
                    }
                    break;
                // 게임설명 보기
                case 4:
                    System.out.println("----------------게임설명----------------");
                    System.out.println("▶ 고양이가 되어 집사를 간택해보세요");
                    System.out.println("▶ 집사가 될 수 있는 마을 사람들은 지도에서 확인할 수 있습니다.");
                    System.out.println("▶ 지도를 통해서 마을 사람들이 있는 곳에 가보세요!");
                    System.out.println("▶ 마을 사람들의 호감도를 채우면 미니게임에 도전할 수 있습니다.");
                    System.out.println("▶ 미니게임을 성공하면 집사로 간택할 수 있습니다.");
                    System.out.println("▶ 마을을 돌아다니다 보면 체력이 떨어집니다.");
                    System.out.println("▶ 상자에서 낮잠을 자거나 간식을 먹으면 체력을 채울 수 있습니다.");
                    System.out.println("▶ 그럼 일주일동안 화이팅하세요!!");
                    break;
                // 게임 종료하기
                case 5:
                    System.exit(0);
                    break;
            }
        }
    }
}