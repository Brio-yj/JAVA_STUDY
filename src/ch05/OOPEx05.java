package ch05;
class 전사{//검
    String name ="전사";
    void 기본공격(궁수 e1){
        System.out.println(e1.name+"검으로 공격");
    }
    void 기본공격2(광전사 e1){
        System.out.println(e1.name+"검으로 공격");
    }
}
class 궁수{//활
    String name ="궁수";
    void 기본공격(광전사 e1){
        System.out.println(e1.name+"활로 공격");
    }
    void 기본공격(전사 e1){
        System.out.println(e1.name+"활로 공격");
    }
}
class 광전사{//도끼
    String name ="광전사";
}

public class OOPEx05 {
    public static void main(String[] args) {
        전사 u1 = new 전사();
        궁수 u2 = new 궁수();
        광전사 u3 = new 광전사();

        //오버로딩 안하면 할때마다 함수 이름 기억해야한다
        u1.기본공격(u2);
        u1.기본공격2(u3);

        //오버로딩 하면 기억해야할게 매개변수만 기억하면 된다.
        u2.기본공격(u3);
    }
}
