package ch05;
abstract class 육{
    void 걷기(){
        System.out.println("육 걷기");
    }
    abstract void 공격();
}
class 뱀 extends 육{
    @Override
    void 공격() {
        System.out.println("뱀 공격");
    }
}
class 늑 extends 육{
    @Override
    void 공격() {
        System.out.println("늑 공격");
    }
}
public class OOPEx08 {
    public static void main(String[] args) {
        육 u1 = new 뱀();
        u1.걷기();
        //동적 바인딩
        u1.공격();
    }
}
