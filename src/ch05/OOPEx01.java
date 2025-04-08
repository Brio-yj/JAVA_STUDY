package ch05;

class Player {
    String name;
    private int thirsty;
    public Player(String name, int thirsty) {
        this.name = name;
        this.thirsty = thirsty;
    }
    void 물마시기(){    //행위 = 메서드 = 값을 변경
        this.thirsty-=50;
    }
    int 목마름상태확인(){
        return this.thirsty;
    }
}
public class OOPEx01 {
    public static void main(String[] args) {
        Player p1 = new Player("a", 100);
        System.out.println(p1.name);
        // 마법 : 원인없이 변화 발생
        // p1.name="b";
        // 실수 가능한 코드
        // p1.물마시기();
        // p1.thirsty=50
        p1.물마시기();
        System.out.println(p1.목마름상태확인());
    }
}

