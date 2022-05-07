public abstract class Item {
    // 아이템 이름이랑 power
    public String name;
    public int power;
    // 생성자
    public Item(String name, int power) {
        this.name = name;
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    // 아이템 상세정보 보여주기
    public void show_item() {
        System.out.printf("아이템 : %s | 능력 : %d\n", name, power);
    }
}
// 아이템 추상클래스를 상속받은 클래스들
// 간식들
class tunaCan extends Item{

    public tunaCan(String name, int power) {
        super(name, power);
    }
}
class churu extends Item{

    public churu(String name, int power) {
        super(name, power);
    }
}

class fish extends Item{

    public fish(String name, int power) {
        super(name, power);
    }
}
class jurkey extends Item{

    public jurkey(String name, int power) {
        super(name, power);
    }
}
// 선물들
class stone extends Item{
    public stone(String name, int power) {
        super(name, power);
    }
}
class diamond extends Item{
    public diamond(String name, int power) {
        super(name, power);
    }
}
class bug extends Item{
    public bug(String name, int power) {
        super(name, power);
    }
}
