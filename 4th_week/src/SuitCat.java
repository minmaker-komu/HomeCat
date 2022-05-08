import java.util.Random;

public class SuitCat extends Cat{

    @Override
    public void show() {
        name = "턱시도 고양이";
        skill = "얼굴 비비기";
        hp = 40;
        System.out.println("▶ " + name + "를 선택하셨습니다!");
        System.out.println("▶ "+name+"는 "+skill+"를 할 수 있습니다!");
        System.out.println("▶ "+name+"의 체력은 "+hp+"입니다!");

    }
    @Override
    public int heartAttack() {

        // 호감도 올린 만큼 체력 감소
        heartUp = random.nextInt(30)+1;

        if(hp<heartUp) {
            System.out.println("체력이 부족합니다.");
            System.out.println("체력을 채워서 도전해주세요.");
            result=0;
        }
        else {
            System.out.println("ฅ(• ɪ •)ฅ");
            System.out.println("얼굴 비비기를 했습니다.");
            hp = hp - heartUp;
            System.out.println("체력이 "+(heartUp)+"감소했습니다.");
            System.out.println("현재 체력은 "+hp+"입니다.");
            result=1;
        }
        return result;
    }
    // 고양이 고유 기술 간식 기술
    // 운이 좋은 고양이
    // 호감도를 높이지 않아도 작은 간식을 얻을 수 있다.
    public void snackSkill(){
        // 땅에서 간식 줍기
        Random rand = new Random();
        int randSnack = rand.nextInt(40);
        if(randSnack <10){
            System.out.println("운이 좋으시네요~!!");
            System.out.println("땅에서 간식을 발견했습니다!!");
            item = new jurkey("육포",20);
            items.add(item);
            item.show_item();
        }
        else if (randSnack < 20){
            item = new jurkey("육포",20);
            items.add(item);
            item.show_item();

        }
        else if(randSnack < 30){
            item = new jurkey("육포",20);
            items.add(item);
            item.show_item();
        }
        else if(randSnack < 40){
            item = new jurkey("육포",20);
            items.add(item);
            item.show_item();
        }
    }
}
