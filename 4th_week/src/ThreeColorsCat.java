import java.util.Random;

public class ThreeColorsCat extends Cat {



    /*public ThreeColorsCat(Item item) {
        super(item);
    }*/

    @Override
    public void show() throws InterruptedException {
        name = "삼색 고양이";
        skill = "배 보여주기";
        hp = 60;
        System.out.println("▶ " + name + "를 선택하셨습니다!");
        Thread.sleep(100);
        System.out.println("▶ "+name+"는 "+skill+"를 할 수 있습니다!");
        Thread.sleep(100);
        System.out.println("▶ "+name+"는 스스로 일정 체력을 자동 회복할 수 있습니다!");
        Thread.sleep(100);
        System.out.println("▶ "+name+"의 체력은 "+hp+"입니다!");

    }
    @Override
    public int heartAttack() {
        // 기술다름
        // 호감도 올린 만큼 체력 감소
        heartUp = random.nextInt(30)+1;

        if(hp<heartUp) {
            System.out.println("체력이 부족합니다.");
            System.out.println("체력을 채워서 도전해주세요.");
            result=0;
        }
        else {
            System.out.println("（=´∇｀=）");
            System.out.println("배 보여주기를 했습니다.");
            hp = hp - heartUp;
            System.out.println("체력이 "+(heartUp)+" 감소했습니다.");
            System.out.println("현재 체력은 "+hp+"입니다.");
            result=1;
        }
        return result;
    }
    // 고양이 고유 기술 체력 회복
    // 건강한 고양이
    // 간식을 먹지 않아도 체력회복이 일정수준 가능하다.
    public void special_skill(){
        // 시간에 따라 회복
        //hp = hp + 5;

    }
}
