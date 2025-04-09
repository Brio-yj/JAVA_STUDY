package ch05;

interface MoveAble {
    //제어자 안적어주면 public, abstract 2개가 생략되어 있다.
    void 위();
}
interface MoveAble2 {
    //제어자 안적어주면 public, abstract 2개가 생략되어 있다.
    void 위();
    void 땅();
}
/*
만약 추상 클래스가 아닌 일반 클래스가 implement 하면 오류발생한다
interface의 메서드는 반드시 구현해줘야 하는데
추상 클래스와 달리 일반 클래스 이미 완성되어 있기 때문에 implement 할 수 없다.

따라서 추상클래스가 interface를 impelments하면
자식 클래스가 interface의 메서드를 구현해야 하는데,
추상클래스가 대신해서 구현하면 상관없다.
 */
//추상 클래스가 자식 클래스 대신 interface 메서드를 구현한 예시
abstract class 사나운 implements MoveAble {
    abstract void 공격();
    @Override
    public void 위() {
        System.out.println("사나운 위로");
    }
}
class 사자 extends 사나운 {
    @Override//어노테이션 : JVM이 실행시에 분석해서 확인 = JVM의 힌트
    void 공격() {
        System.out.println("사자 공격");
    }
    public void 위(){
        System.out.println("사자 위로");
    }
}
abstract class 온순한 implements MoveAble2 {
    abstract void 채집();
}
//자식 클래스가 interface의 메서드를 구현한 예시
class 소 extends 온순한 {
    @Override
    void 채집() {}
    @Override
    public void 위() {}
    @Override
    public void 땅() {}
}
public class OOPEx09 {
    /*
        이 메서드의 매개변수 타입은 사나운입니다.
        이 함수는 사나운 타입이거나 그 하위 클래스 객체를 받을 수 있습니다.
        ✅ 즉, 컴파일러는 매개변수를 받을 때 "사자냐?"가 아니라 "사나운이냐, 혹은 그 자식이냐?"를 기준으로 봅니다.
     */
    static void 조이스틱(사나운 u) {}
    public static void main(String[] args) {
        /*
            👉 기능(행위)에만 관심이 있다면, 상위 타입(추상 클래스나 인터페이스)으로 선언하세요.
            👉 사자의 고유한 기능(오직 사자만의 메서드 등)에 접근해야 한다면, 사자 타입으로 선언하세요.
         */
        사자 uu = new 사자();
        uu.공격();
    }
}
