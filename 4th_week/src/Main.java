import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner scan = new Scanner(System.in);
        // 배경음악

        Music introMusic = new Music("introMusic.mp3",true);
        introMusic.start();
        //게임시작
        System.out.println("\n\n\n");
        String start = ("██╗  ██╗ ██████╗ ███╗   ███╗███████╗     ██████╗ █████╗ ████████╗\n" +
                "██║  ██║██╔═══██╗████╗ ████║██╔════╝    ██╔════╝██╔══██╗╚══██╔══╝\n" +
                "███████║██║   ██║██╔████╔██║█████╗      ██║     ███████║   ██║   \n" +
                "██╔══██║██║   ██║██║╚██╔╝██║██╔══╝      ██║     ██╔══██║   ██║   \n" +
                "██║  ██║╚██████╔╝██║ ╚═╝ ██║███████╗    ╚██████╗██║  ██║   ██║   \n" +
                "╚═╝  ╚═╝ ╚═════╝ ╚═╝     ╚═╝╚══════╝     ╚═════╝╚═╝  ╚═╝   ╚═╝\n");
        for (int i = 0; i < start.length(); i++) { // 오프닝 스레드
            Thread.sleep(5);
            System.out.print( start.charAt(i) );
        }
        // 음악 출처 : 오늘의 일기


        Thread.sleep(1000);
        System.out.println("▶ 도전! 집냥이");
        Thread.sleep(1000);
        System.out.println("▶ 고양이가 되어 집사를 간택해보세요");
        Thread.sleep(1000);
        System.out.println("▶ 고양이들이 사는 마을로 출발합니다!");
        Thread.sleep(1000);

        System.out.println("○ 。\n" +
                "。 ┏━━┓  ○\n" +
                " ┏┛ㅁㅁ┗┓\n" +
                " ┗＠━━＠┛");
        System.out.println("");
        // 마을 이름
        String nameTown;
        // 마을 이름 정하기
        System.out.println("▶ 어떤 마을에 갈까요?");
        Thread.sleep(25);
        System.out.println("▶ 마을 이름을 정해주세요");
        Thread.sleep(25);
        while(true){
            nameTown = scan.next();
            System.out.println("마을 이름을 "+nameTown+"로 정하시겠습니까?");
            Thread.sleep(25);
            System.out.println("1. 네");
            System.out.println("2. 아니오 다시 정할래요");
            int answer_TownName = scan.nextInt();
            if(answer_TownName == 1){
                Thread.sleep(25);
                System.out.println(nameTown+"마을로 갑니다!");
                break;
            }
            else{
                Thread.sleep(25);
                System.out.println("마을 이름을 다시 정해주세요!");
            }
        }
        //마을 가는 중.... 로딩 스레드 넣기
        Thread.sleep(1000);
        System.out.println("");
        String loading;
        Music beepMusic = new Music("beep.mp3",false);
        System.out.println("。┏━━┓ Ｏ\n" +
                "┏┛ㅁㅁ┗┓⋆｡˚ ☁︎ ˚｡⋆｡˚☽˚｡⋆");
        System.out.println("");



        loading ="▶ ▶ ▶ ▶ ▶ ▶ ▶ ▶ ▶ ▶ ▶ ▶ ▶ ▶ 마을 가는 중 ▶ ▶ ▶ ▶ ▶ ▶ ▶ ▶ ▶ ▶ ▶ ▶ ▶ ▶ ▶";

        for (int i = 0; i < loading.length(); i++) { // 로딩 효과 스레드
            Thread.sleep(20);
            System.out.print( loading.charAt(i) );
        }
        beepMusic.start();
        Thread.sleep(1000);
        System.out.println("\n");
        System.out.println(nameTown+"마을에 도착했습니다!");
        System.out.println("° :.　 . • ○ ° ★　 .　 *　.\n" +
                "★ ° . .　　　　.　☾ °☆　 . * ● ¸ .\n" +
                "∩ │◥███◣ ╱◥███◣\n" +
                "╱◥◣ ◥████◣▓∩▓│∩ ║\n" +
                "│╱◥█◣║∩∩∩ ║◥█▓ ▓█◣\n" +
                "││∩│ ▓ ║∩田│║▓ ▓ ▓∩ ║\n");
        Thread.sleep(1000);
        System.out.println("엇 저기 상자에 무언가가 있는 것 같습니다.");
        // 고양이 고르기
        Thread.sleep(1000);
        System.out.println("가까이 가보니 고양이 세마리가 있네요.");

        /*System.out.println("　 ＿＿ ∧ ∧        　   ＿＿ ∧ ∧              ＿＿ ∧ ∧\n" +
                           " ／＼　 (*ﾟ∀ﾟ)＼       ／＼　 (・ω・)＼        ／＼　 (*ﾟーﾟ)＼\n" +
                           " ＼／|￣￣∪ ∪￣|＼      ＼／|￣￣∪ ∪￣|＼       ＼／|￣￣∪ ∪￣|＼\n" +
                           "　＼|　　〓〓　 |         ＼|　　〓〓　|          ＼|　　〓〓　|\n" +
                           "　　 ￣￣￣￣￣       　　   ￣￣￣￣￣              ￣￣￣￣￣");*/

        System.out.println("　 ＿＿ ∧ ∧        　     ＿＿∧    ∧            ＿＿∧    ∧\n" +
                " ／＼　 (*ﾟーﾟ)＼       ／＼(=◉ᆽ◉=)＼        ／＼(=\uD83D\uDF66 ༝ \uD83D\uDF66=)＼\n" +
                " ＼／|￣￣∪ ∪￣|＼      ＼／|￣￣∪ ∪￣|＼       ＼／|￣￣∪ ∪￣|＼\n" +
                "　＼|　　〓〓　 |         ＼|　　〓〓　|          ＼|　　〓〓　|\n" +
                "　　 ￣￣￣￣￣       　　   ￣￣￣￣￣              ￣￣￣￣￣");

        Thread.sleep(1000);
        System.out.println("이 중 한마리를 골라봅시다!");
        Thread.sleep(100);
        System.out.println("고양이 별로 행동 특성이 다릅니다.");
        Thread.sleep(100);
        System.out.println("신중하게 골라주세요\n");
        Thread.sleep(300);
        System.out.println("1. 치즈 고양이   (*ﾟーﾟ)");
        System.out.println("기본기술 : 꾹꾹이 | 특수기술 : ??? | 체력 : 50 | 게으른 고양이\n");
        System.out.println("2. 삼색 고양이   (=◉ᆽ◉=)");
        System.out.println("기본기술 : 배 보여주기 | 특수기술 : ??? | 체력 : 60 | 건강한 고양이\n");
        System.out.println("3. 턱시도 고양이  (=\uD83D\uDF66 ༝ \uD83D\uDF66=)");
        System.out.println("기본기술 : 얼굴 비비기 | 특수기술 : ??? | 체력 : 40 | 운이 좋은 고양이\n");

        int answer_Cat = scan.nextInt();
        // 고양이 생성
        Cat cat = new Cat();
        switch (answer_Cat){
            case 1:
                // 치즈 고양이
                cat = new CheezeCat();
                Music meow3 = new Music("meow2.mp3",false);
                meow3.start();
                System.out.println(
                        "　∧,,∧\n" +
                        "(๑＞◡╹๑)\n" +
                        "　(O O)\n" +
                        "　 し‐J\n");
                cat.show();

                break;
            case 2:
                // 삼색 고양이
                cat = new ThreeColorsCat();
                Music meow2 = new Music("meow2.mp3",false);
                meow2.start();
                System.out.println(
                               "　　　 ∧,,∧\n" +
                               "☆ヾ(ゝω・＊）찡긋-\n" +
                               "　　　(　 ⊂)\n" +
                               "　　　 し─Ｊ\n");
                cat.show();
                cat.special_skill();;
                break;
            case 3:
                // 턱시도 고양이
                cat = new SuitCat();
                Music meow1 = new Music("meow1.mp3",false);
                meow1.start();
                System.out.println(" 　　. ＼：／\n" +
                        "　・･･･☆･･･・\n" +
                        ". ⋀,,⋀. ∩.＼\n" +
                        "(*・ω・)/\n" +
                        ".(つ　 ﾉ\n" +
                        ".しーＪ\n");
                cat.show();
                break;

        }
        // npc 생성
        fishman fishman = new fishman(cat);
        kid kid = new kid(cat);
        worker worker = new worker(cat);
        puppy puppy = new puppy(cat);
        System.out.println();
        System.out.println("═════════════════════════게임 설명════════════════════════\n\n");
        // 게임 설명 타이핑 효과
        String explain =
                "▶ 고양이가 되어 집사를 간택해보세요\n\n"+
                "▶ 집사가 될 수 있는 마을 사람들은 지도에서 확인할 수 있습니다 \n\n"+
                "▶ 지도를 통해서 마을 사람들이 있는 곳에 가보세요!\n\n"+
                "▶ 마을 사람들의 호감도를 채우면 미니게임에 도전할 수 있습니다.\n\n" +
                "▶ 미니게임을 성공하면 집사로 간택할 수 있습니다\n\n" +
                "▶ 마을을 돌아다니다 보면 체력이 떨어집니다.\n\n" +
                "▶ 상자에서 잠을 자거나 간식을 먹으면 체력을 채울 수 있습니다.\n\n" +
                "▶ 그럼 일주일동안 화이팅하세요!! \n\n";
        for (int i = 0; i < explain.length(); i++) {
            Thread.sleep(50);
            System.out.print(explain.charAt(i));
        }
        System.out.println("═══════════════════════════════════════════════════════\n");
        // 인트로 뮤직 끝내기
        introMusic.close();
        ThreadTimer timer = new ThreadTimer(); // 시간 표시
        // 게임 진행 메뉴얼
        // 체력 자동 줄어들기
        cat.start();
        while(true){
            // 일주일 지나면 게임 종료
            if(timer.day()==7) {
                System.out.println("\n\n\n");
                System.out.println("일주일이 지났습니다.\n\n");
                Thread.sleep(1000);
                System.out.println("고양이는 집사를 찾지 못했습니다.");
                Thread.sleep(1000);
                System.out.println("\n" +
                        "　　∧＿∧ 쓰담쓰담\n" +
                        "　（´・ω・)つ＿ ∧\n" +
                        "　（つ　 / (・ω・｡)\n" +
                        "　 しーＪ　 (nnノ)\n");
                System.out.println("。　♡ 。　　♡。　　♡\n" +
                        "♡。　＼　　｜　　／。　♡\n" +
                        "　 마을 고양이로 살아가세요~!\n" +
                        "♡。　／　　｜　　＼。　♡\n" +
                        "。　♡。 　　。　　♡。\n");
                System.out.println("마을 고양이로 살아가세요~!");
                System.exit(0);
            }
            Music menuMusic = new Music("Pepperoni+Pizza.mp3",true);
            menuMusic.start();
            //Thread.sleep(100);
            System.out.println("╔═══*.·:·.☽✧  ✦  ✧☾.·:·.*═══╗");
            System.out.println("       1. 지도열기");
            System.out.println("       2. 아이템 주머니 열기");
            System.out.println("       3. 상자로 돌아가기");
            System.out.println("       4. 게임 설명 보기");
            System.out.println("       5. 게임 종료하기");
            System.out.println("╚═══*.·:·.☽✧  ✦  ✧☾.·:·.*═══╝");
            int answer_menu = scan.nextInt();
            menuMusic.close();
            // 선택 효과음
            Music click1 = new Music("086_팝.mp3",false);
            click1.start();
            switch (answer_menu){
                // 지도 열기
                case 1:
                    TownMap map = new TownMap();
                    System.out.println("▶ 지도를 열었다.");
                    System.out.println("▶ 어디로 갈까?");
                    if(cat.name.equals("턱시도 고양이")){
                        cat.special_skill();
                    }
                    System.out.println("══════════지도═════════");
                    System.out.println("       1. 상점가");
                    System.out.println("       2. 주택가");
                    System.out.println("       3. 도심");
                    System.out.println("       4. 공원");
                    System.out.println("══════════════════════");

                    int answer_place = scan.nextInt();
                    // 선택효과음
                    Music click2 = new Music("086_팝.mp3",false);
                    click2.start();

                    switch (answer_place){
                        case 1:
                            Music storeMusic = new Music("Dance+Dance.mp3",true);
                            storeMusic.start();
                            // 상점가
                            map = new store();
                            map.show_map();
                            //System.out.println("▶ 상점가입니다.");
                            //System.out.println("1. 선물 찾기");
                            //System.out.println("2. 그냥 돌아다니기");
                            int answer_stores = scan.nextInt();
                            Music click3 = new Music("086_팝.mp3",false);
                            click3.start();
                            switch (answer_stores){
                                case 1:
                                    System.out.println("바닥에 무언가가 떨어져있습니다.");
                                    System.out.println("주울까요?");
                                    System.out.println("1. 네");
                                    System.out.println("2. 아니요");
                                    int answer_pick = scan.nextInt();
                                    Music click4 = new Music("086_팝.mp3",false);
                                    click4.start();

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
                                    Music click5 = new Music("086_팝.mp3",false);
                                    click5.start();
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
                            storeMusic.close();
                            break;
                        case 2:
                            Music houseMusic = new Music("Fig+Yogurt.mp3",true);
                            houseMusic.start();
                            // 주택가
                            System.out.println("▶ 주택가입니다.");
                            System.out.println("1. 선물 찾기");
                            System.out.println("2. 그냥 돌아다니기");
                            int answer_house = scan.nextInt();
                            Music click6 = new Music("086_팝.mp3",false);
                            click6.start();
                            switch (answer_house){
                                case 1:
                                    System.out.println("바닥에 무언가가 떨어져있습니다.");
                                    System.out.println("주울까요?");
                                    System.out.println("1. 네");
                                    System.out.println("2. 아니요");
                                    int answer_pick = scan.nextInt();
                                    Music click7 = new Music("086_팝.mp3",false);
                                    click7.start();
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
                                    Music click8 = new Music("086_팝.mp3",false);
                                    click8.start();
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
                            houseMusic.close();
                            break;
                        case 3:
                            Music downTownMusic = new Music("08+Oneul+-+Subway+Travel.mp3",true);
                            downTownMusic.start();
                            // 도심
                            System.out.println("▶ 도심입니다.");
                            System.out.println("1. 선물 찾기");
                            System.out.println("2. 그냥 돌아다니기");
                            int answer_town = scan.nextInt();
                            Music click9 = new Music("086_팝.mp3",false);
                            click9.start();
                            switch (answer_town){
                                case 1:
                                    System.out.println("바닥에 무언가가 떨어져있습니다.");
                                    System.out.println("주울까요?");
                                    System.out.println("1. 네");
                                    System.out.println("2. 아니요");
                                    int answer_pick = scan.nextInt();
                                    Music click10 = new Music("086_팝.mp3",false);
                                    click10.start();
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
                                    Music click11 = new Music("086_팝.mp3",false);
                                    click11.start();
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
                            downTownMusic.close();
                            break;
                        case 4:
                            Music parkMusic = new Music("Oneul+-+Tangerine+Dance.mp3",true);
                            parkMusic.start();
                            // 공원
                            System.out.println("▶ 공원입니다.");
                            System.out.println("1. 선물 찾기");
                            System.out.println("2. 그냥 돌아다니기");
                            int answer_park = scan.nextInt();
                            Music click12 = new Music("086_팝.mp3",false);
                            click12.start();
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
                                    Music click13 = new Music("086_팝.mp3",false);
                                    click13.start();
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
                            parkMusic.close();
                    }
                    break;
                // 아이템 주머니 열기
                case 2:
                    Music pocketMusic = new Music("oneul+-+Winter+Glow.mp3",true);
                    pocketMusic.start();
                    System.out.println("▶ 주머니 속에 뭐가 있는지 확인해봅시다!");
                    System.out.println("1. 간식 확인하기");
                    System.out.println("2. 선물 확인하기");
                    int pocket = scan.nextInt();
                    Music click = new Music("086_팝.mp3",false);
                    click.start();
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
                                Music click14 = new Music("086_팝.mp3",false);
                                click14.start();
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
                    pocketMusic.close();
                    break;
                // 상자로 돌아가기
                case 3:
                    Music boxMusic = new Music("상자.mp3",true);
                    boxMusic.start();
                    System.out.println("▶ 상자로 돌아왔습니다. 무엇을 할까요?");
                    System.out.println("1. 체력확인하기");
                    System.out.println("2. 낮잠 자기"); // 3시간 정도 지남
                    System.out.println("3. 깊은 잠자기"); // 다음날로 바뀜
                    int answer_sleep = scan.nextInt();
                    Music click15 = new Music("086_팝.mp3",false);
                    click15.start();
                    switch (answer_sleep){
                        case 1:
                            // 체력확인하기
                            System.out.println("▶ 현재 고양이의 체력은 "+cat.hp+"입니다.");
                            break;
                        case 2:
                            // 낮잠자기
                            cat.napping();
                            // 시간 30초 지나기
                            if(cat.name.equals("치즈 고양이")){
                                System.out.println("。　♡ 。　　♡。　　♡\n" +
                                        "♡。　＼　　｜　　／。　♡\n" +
                                        "　      식빵굽기    \n" +
                                        "♡。　／　　｜　　＼。　♡\n" +
                                        "。　♡。 　　。　　♡。\n");
                                System.out.println("낮잠을 자도 시간이 줄어들지 않습니다");
                            }
                            else {
                                timer.n = timer.n +30;
                            }

                            break;
                        case 3:
                            // 깊은 잠자기
                            // 하루 지나기
                            cat.sleeping();
                            timer.day = timer.day +1;

                            break;
                    }
                    boxMusic.close();
                    break;
                // 게임설명 보기
                case 4:
                    Music explainMusic = new Music("Oneul+-+Happy+Avocado.mp3",true);
                    explainMusic.start();
                    System.out.println("═════════════════════════게임 설명════════════════════════\\n\\n");
                    System.out.println("▶ 고양이가 되어 집사를 간택해보세요");
                    System.out.println("▶ 집사가 될 수 있는 마을 사람들은 지도에서 확인할 수 있습니다.");
                    System.out.println("▶ 지도를 통해서 마을 사람들이 있는 곳에 가보세요!");
                    System.out.println("▶ 마을 사람들의 호감도를 채우면 미니게임에 도전할 수 있습니다.");
                    System.out.println("▶ 미니게임을 성공하면 집사로 간택할 수 있습니다.");
                    System.out.println("▶ 마을을 돌아다니다 보면 체력이 떨어집니다.");
                    System.out.println("▶ 상자에서 잠을 자거나 간식을 먹으면 체력을 채울 수 있습니다.");
                    System.out.println("▶ 그럼 일주일동안 화이팅하세요!!");
                    System.out.println("═══════════════════════════════════════════════════════");
                    explainMusic.close();
                    break;
                // 게임 종료하기
                case 5:
                    System.out.println("게임을 종료합니다.");
                    System.exit(0);
                    break;
            }
        }
    }
}
