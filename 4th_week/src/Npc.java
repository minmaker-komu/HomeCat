import java.util.Iterator;

public class Npc extends Character{
    Cat cat;
    Item item;
    // 호감도
    public int heart;
    // 간식
    String snack;
    // 무엇을 할 것인지
    public Npc (Cat cat){
        this.cat = cat;
    }
    void gaming(){

    }
    Item feeding(){
        return item;
    }
    void ending(){
        System.out.println("▶ "+name+"을 집사로 간택하겠습니까?");
        System.out.println("1. 네 집사로 간택하겠습니다.");
        System.out.println("2. 아니요 그냥 마을에서 살게요~!");
        int answer_final = scan.nextInt();
        if(answer_final==1){
            System.out.println("˚∧＿∧  　+        —̳͟͞͞\uD83D\uDC97\n" +
                    "(  •‿• )つ  —̳͟͞͞ \uD83D\uDC97         —̳͟͞͞\uD83D\uDC97 +\n" +
                    "(つ　 <                —̳͟͞͞\uD83D\uDC97\n" +
                    "｜　 _つ      +  —̳͟͞͞\uD83D\uDC97         —̳͟͞͞\uD83D\uDC97 ˚\n" +
                    "`し´");
            System.out.println(name+"이 당신의 집사가 되었습니다!");
            System.out.println("행복하게 사세요~!");
            System.out.println("███████╗███╗   ██╗██████╗ \n" +
                    "██╔════╝████╗  ██║██╔══██╗\n" +
                    "█████╗  ██╔██╗ ██║██║  ██║\n" +
                    "██╔══╝  ██║╚██╗██║██║  ██║\n" +
                    "███████╗██║ ╚████║██████╔╝\n" +
                    "╚══════╝╚═╝  ╚═══╝╚═════╝ \n" +
                    "                          \n");
            System.exit(0);
        }
        else {
            System.out.println("　　 ∧＿∧　♪\n" +
                    "　　(´･ω･`)　　♪\n" +
                    "　　（ つ　つ\n" +
                    "((　（⌒ __)　))\n" +
                    "　　　し' っ");
            System.out.println("▶ 마을 고양이를 선택하셨군요!");
            System.out.println("▶ 마을의 마스코트가 되어주세요~!");
            System.out.println("███████╗███╗   ██╗██████╗ \n" +
                    "██╔════╝████╗  ██║██╔══██╗\n" +
                    "█████╗  ██╔██╗ ██║██║  ██║\n" +
                    "██╔══╝  ██║╚██╗██║██║  ██║\n" +
                    "███████╗██║ ╚████║██████╔╝\n" +
                    "╚══════╝╚═╝  ╚═══╝╚═════╝ \n" +
                    "                          \n");
            System.exit(0);
        }
    }

    public void show_whatToDo(){
        while(true){
            System.out.println("▶ 무엇을 할까?");
            System.out.println("1. 호감도 확인하기");
            System.out.println("2. 애정표현하기");
            System.out.println("3. 선물 주기");
            System.out.println("4. 간식 요청하기");
            System.out.println("5. 미니게임 도전하기");
            System.out.println("6. 나가기");
            int answer_npc = scan.nextInt();

            switch (answer_npc){
                case 1:
                    Music click16 = new Music("086_팝.mp3",false);
                    click16.start();
                    // 호감도 보여주기
                    System.out.println("▶ 현재 " + name + "의 호감도는 " + heart + "입니다.");
                    break;
                case 2:
                    Music click17 = new Music("086_팝.mp3",false);
                    click17.start();
                    // 기술쓰기(애정표현하기)
                    // 호감도를 올릴 수 있음
                    System.out.println("$$$$$");
                    cat.heartAttack();
                    if(cat.result ==1 ){
                        heart = heart + cat.heartUp;
                        System.out.println("▶ "+name + "의 호감도는 " + heart + "입니다.");
                    }
                    else {
                        System.out.println("▶ "+name + "의 호감도는 " + heart + "입니다.");
                    }
                    break;
                case 3:
                    Music click18 = new Music("086_팝.mp3",false);
                    click18.start();
                    // 선물주기
                    if(heart < 50){
                        System.out.println("▶ 선물주기는 호감도가 50이상 되어야줄 수 있습니다.");
                        // 어떤 선물인지에 따라 호감도가 내려가거나 올라갈 수 있음

                    }
                    else {
                        cat.giveGift();
                        //heart = heart + item.getPower();
                        heart = heart + 10;
                        System.out.println("▶ "+name + "의 호감도는 " + heart + "입니다.");
                    }
                    break;
                case 4:
                    Music click19 = new Music("086_팝.mp3",false);
                    click19.start();
                    // 간식 요청하기
                    if(heart < 40){
                        System.out.println("▶ 호감도 40이상부터 간식을 요청할 수 있습니다.");
                    }
                    else{
                        System.out.println("▶ "+name + "에게 간식을 달라고 해봅시다.");
                        System.out.println("▶ 간식을 요청하려면 꼬리흔들기를 하면 됩니다.");
                        System.out.println("▶ 꼬리흔들기를 하려면 0을 다섯번 입력해주세요");
                        // 꼬리 흔들기
                        String tail = scan.next();
                        if(tail.equals("00000")){
                            feeding();
                            System.out.println("▶ 간식을 획득했습니다");
                            System.out.println("▶ 간식은 주머니에서 확인해주세요.");
                        }
                        else{
                            System.out.println("▶ 간식 얻기에 실패했습니다...");
                        }
                    }

                    break;
                case 5:
                    Music click20 = new Music("086_팝.mp3",false);
                    click20.start();
                    // 미니게임 도전하기
                    // 호감도 80이상일때 가능
                    if (heart >= 80) {
                        gaming();
                    } else {
                        System.out.println("▶ 호감도 80이상부터 미니게임에 도전할 수 있습니다.");
                    }
                    break;
                case 6:
                    Music click21 = new Music("086_팝.mp3",false);
                    click21.start();
                    break;
            }
            if (answer_npc == 6) {
                break;
            }
        }
    }
}
class fishman extends Npc{
    public fishman(Cat cat) {
        super(cat);
    }
    
    public void show() throws InterruptedException {
        System.out.println("▶ 생선가게 입니다.");
        Thread.sleep(700);
        System.out.println("▶ 어떤 아저씨가 생선을 들고 있습니다.");
        Thread.sleep(700);
        name = "김종완";
        System.out.println("▶ 생선가게 주인 " + name + "입니다.");
        Thread.sleep(700);
        snack = "생선";
        System.out.println("▶ "+name + "은 간식으로 " + snack + "을 가지고 있습니다.");
        Thread.sleep(700);
    }
    // 미니게임
    public void gaming(){
        MiniGame1 game1 = new MiniGame1();
        game1.play();
        System.out.println("▶ 미니게임이 종료되었습니다.");
        if(game1.result==1){
            System.out.println("▶ 미니게임에 성공했습니다!");
            ending();
        }
        else {
            System.out.println("다음에 다시 도전해주세요.");
        }
    }


    Item feeding() {
        item = new fish("생선",40);
        cat.items.add(item);
        item.show_item();
        return item;
    }
}
class kid extends Npc{

    public kid(Cat cat) {
        super(cat);
    }

    public void show() throws InterruptedException {
        System.out.println("▶ 초등학교 앞 입니다.");
        Thread.sleep(700);
        System.out.println("▶ 저기 누군가가 당신에게 오고 있습니다.");
        Thread.sleep(700);
        name = "김성규";
        System.out.println("▶ 초등학생 "+name+"입니다.");
        Thread.sleep(700);
        snack = "참치캔";
        System.out.println("▶ "+name+"은 간식으로 "+snack+"을 가지고 있습니다.");
        Thread.sleep(700);

    }
    // 미니게임
    public void gaming(){
        MiniGame2 game2 = new MiniGame2();
        game2.play();
        System.out.println("▶ 미니게임이 종료되었습니다.");
        if(game2.result==1){
            System.out.println("▶ 미니게임에 성공했습니다!");
            ending();
        }
        else {
            System.out.println("▶ 다음에 다시 도전해주세요.");
        }
    }
    Item feeding() {
        item = new tunaCan("참치캔",20);
        cat.items.add(item);
        item.show_item();
        return item;
    }

}
class worker extends Npc{
    public worker(Cat cat) {
        super(cat);
    }

    public void show() throws InterruptedException {

        System.out.println("▶ 버스정류장입니다.");
        Thread.sleep(700);
        System.out.println("▶ 누군가 서류가방을 들고 있습니다.");
        Thread.sleep(700);
        name = "권현빈";
        System.out.println("▶ 회사원 "+name+"입니다.");
        Thread.sleep(700);
        snack = "츄르";
        System.out.println("▶ "+name+"은 간식으로 "+snack+"을 가지고 있습니다.");
        Thread.sleep(700);
    }
    // 미니게임
    public void gaming(){
        MiniGame3 game3 = new MiniGame3();
        game3.play();
        System.out.println("▶ 미니게임이 종료되었습니다.");
        if(game3.result==1){
            System.out.println("▶ 미니게임에 성공했습니다!");
            ending();
        }
        else {
            System.out.println("▶ 다음에 다시 도전해주세요.");
        }
    }
    Item feeding() {
        item = new churu("츄르",30);
        cat.items.add(item);
        item.show_item();
        return item;

    }

}

class puppy extends Npc{
    public puppy(Cat cat) {
        super(cat);
    }

    public void show() throws InterruptedException {
        System.out.println("▶ 분수대입니다.");
        Thread.sleep(700);
        System.out.println("▶ 강아지가 물놀이를 하고 있습니다.");
        Thread.sleep(700);
        name = "코코";
        System.out.println("U・ᴥ・U");
        System.out.println("▶ 강아지 "+name+"입니다.");
        Thread.sleep(700);
        snack = "육포";
        System.out.println("▶ "+name+"은 간식으로 "+snack+"을 가지고 있습니다.");
        Thread.sleep(700);
    }
    // 미니게임
    public void gaming(){
        MiniGame4 game4 = new MiniGame4();
        game4.play();
        System.out.println("▶ 미니게임이 종료되었습니다.");
        if(game4.result==1){
            System.out.println("▶ 미니게임에 성공했습니다!");
            System.out.println("▶ "+name+"을 파트너로 선택하시겠습니까?");
            System.out.println("1. 네 같이 다닐게요~!.");
            System.out.println("2. 아니요 그냥 혼자 다닐래요~!");
            int answer_final = scan.nextInt();
            if(answer_final==1){

                System.out.println("˚∧＿∧  　+        —̳͟͞͞\uD83D\uDC97\n" +
                        "(  •‿• )つ  —̳͟͞͞ \uD83D\uDC97         —̳͟͞͞\uD83D\uDC97 +\n" +
                        "(つ　 <                —̳͟͞͞\uD83D\uDC97\n" +
                        "｜　 _つ      +  —̳͟͞͞\uD83D\uDC97         —̳͟͞͞\uD83D\uDC97 ˚\n" +
                        "`し´");
                System.out.println("▶ "+name+"이 당신의 파트너가 되었습니다!");
                System.out.println("▶"+name+"과 사이좋게 지내세요!");
                System.out.println("███████╗███╗   ██╗██████╗ \n" +
                        "██╔════╝████╗  ██║██╔══██╗\n" +
                        "█████╗  ██╔██╗ ██║██║  ██║\n" +
                        "██╔══╝  ██║╚██╗██║██║  ██║\n" +
                        "███████╗██║ ╚████║██████╔╝\n" +
                        "╚══════╝╚═╝  ╚═══╝╚═════╝ \n" +
                        "                          \n");
                System.exit(0);
            }
            else {
                System.out.println("　　 ∧＿∧　♪\n" +
                        "　　(´･ω･`)　　♪\n" +
                        "　　（ つ　つ\n" +
                        "((　（⌒ __)　))\n" +
                        "　　　し' っ");
                System.out.println("▶ 마을 고양이를 선택하셨군요!");
                System.out.println("▶ 마을의 마스코트가 되어주세요~!");
                System.out.println("███████╗███╗   ██╗██████╗ \n" +
                        "██╔════╝████╗  ██║██╔══██╗\n" +
                        "█████╗  ██╔██╗ ██║██║  ██║\n" +
                        "██╔══╝  ██║╚██╗██║██║  ██║\n" +
                        "███████╗██║ ╚████║██████╔╝\n" +
                        "╚══════╝╚═╝  ╚═══╝╚═════╝ \n" +
                        "                          \n");
                System.exit(0);
            }
        }
        else {
            System.out.println("▶ 다음에 다시 도전해주세요.");
        }
    }
    Item feeding() {
        item = new jurkey("육포",20);
        cat.items.add(item);
        item.show_item();
        return item;
    }

}
