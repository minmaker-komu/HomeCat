import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class Cat extends Character{
    // 아이템 전역변수
    Item item;
    // 체력
    public int hp;
    // 기술
    public String skill;
    // 간식 목록
    ArrayList<Item> items = new ArrayList<>();
    // 선물 목록
    ArrayList<Item> gifts = new ArrayList<>();
    // 올린 호감도(랜덤으로 올라감)
    Random random = new Random();
    int heartUp;
    int result = 0;
    // 호감도 올리기
    public int heartAttack(){

        heartUp = random.nextInt(30)+1;

        if(hp<heartUp) {
            System.out.println("체력이 부족합니다.");
            System.out.println("체력을 채워서 도전해주세요.");
            result=0;
        }
        else {
            hp = hp - heartUp;
            System.out.println("체력이"+(heartUp)+"감소했습니다.");
            System.out.println("현재 체력은"+hp+"입니다.");
            result=1;
        }
        return result;
    }
    // 선물 줍기
    public void pickGift(){
        // 1,2,3중 랜덤으로 하나 골라서 나오게 선물 상자에 넣는다.
        int what = random.nextInt(30)+1;
        if(what<30){
            item = new stone("돌멩이",10);
            gifts.add(item);
            item.show_item();
        }
        else if(what==1){
            item = new bug("벌레",-10);
            gifts.add(item);
            item.show_item();
        }
        else if(what==2){
            item = new diamond("보석",50);
            gifts.add(item);
            item.show_item();
        }
    }

    // 주머니 속 간식 확인하기
    public void show_itemList(){
        System.out.println("* " + name + "의 주머니 속 간식들 *");
        Iterator<Item> e = items.iterator();
        while(e.hasNext()) {
            System.out.print(e.next().name + " | ");
        }
        System.out.println();
    }
    // 주머니 속 선물 확인하기
    public void show_giftList(){
        System.out.println("* " + name + "의 주머니 속 선물들 *");
        Iterator<Item> e = gifts.iterator();
        while(e.hasNext()) {
            System.out.print(e.next().name + " | ");
        }
        System.out.println();

    }
    // 선물 주기
    public void giveGift(){
        System.out.println("어떤 선물을 줄까요?");
        System.out.println("* " + name + "의 주머니 속 선물들 *");
        Iterator<Item> e = gifts.iterator();
        while(e.hasNext()) {
            System.out.print(e.next().name + " | ");
        }
        System.out.println();
        int gift=0;
        System.out.print("▶ 선물 선택(숫자로 표시) : ");
        gift = scan.nextInt() - 1;
        item = gifts.get(gift);
        item.show_item();
        gifts.remove(gift);
    }
    // 아이템 사용하기
    public void usingItem(){
        int pick= 0;
        System.out.print("▶ 간식 선택(숫자로 표시) : ");
        pick = scan.nextInt() - 1;
        item = items.get(pick);
        item.show_item();
        hp = hp + item.getPower();
        items.remove(pick);
    }
    // 낮잠자기
    public void napping(){
        if(hp+30 > 100){
            hp = 100;
        }
        else{
            hp = hp + 30;
        }
        System.out.println("　　　∧∧\n" +
                "　　（*･ω･）\n" +
                "　 ＿|　⊃／(＿＿_\n" +
                "／　└-(＿＿＿_／\n" +
                "￣￣￣￣￣￣￣");
        System.out.println("▶ 낮잠을 잤습니다. 고양이의 체력은 "+hp+"가 됐습니다.");
    }
    // 깊은 잠자기
    public void sleeping(){
        if(hp+50 > 100){
            hp = 100;
        }
        else{
            hp = hp + 50;
        }
        System.out.println("　　    ∧∧\n" +
                "　　(*✪ω✪)\n" +
                "　 ＿|　⊃／(＿＿_\n" +
                "／　└-(＿＿＿_／\n" +
                "￣￣￣￣￣￣￣");
        System.out.println("▶ 깊은잠을 잤습니다. 고양이의 체력은 "+hp+"가 됐습니다.");
    }

}
