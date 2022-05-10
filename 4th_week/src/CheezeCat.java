public class CheezeCat extends Cat{



    @Override
    public void show() throws InterruptedException {
        name = "치즈 고양이";
        skill = "꾹꾹이";
        hp = 50;
        System.out.println("▶ " + name + "를 선택하셨습니다!");
        Thread.sleep(700);
        System.out.println("▶ "+name+"는 "+skill+"를 할 수 있습니다!");
        Thread.sleep(700);
        System.out.println("▶ "+name+"는 낮잠을 자도 시간이 줄어들지 않습니다!");
        Thread.sleep(700);
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
            System.out.println("ฅ(^◕ᴥ◕^)ฅ");
            System.out.println("꾹꾹이를 했습니다.");
            hp = hp - heartUp;
            System.out.println("체력이 "+(heartUp)+" 감소했습니다.");
            System.out.println("현재 체력은 "+hp+"입니다.");
            result=1;
        }
        return result;
    }
    // 고양이 고유의 기술
    // 게으른 고양이
    // 식빵 굽기 // 잠을 자도 시간이 안간다.
    public void special_skill(){
        // 자고 일어나도 시간이 가지않게

    }
}
