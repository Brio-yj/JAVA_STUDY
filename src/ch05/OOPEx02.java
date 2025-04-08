package ch05;
class Engine{
    int power =2000;
}
class Car{ // 자동차는 엔진이 아니니까 상속 안된다.
    //컴포지션
    Engine e;

    public Car(Engine e) {
        this.e = e;
    }
}
class Hamburger{
    String name ="기본 햄버거";
    String 재료1 ="양상추";
}
// 상속은 상태와 행위를 물려 받을 수 있지만 꼭 타입이 일치 되어야 한다.!!
class CheeseHamburger extends Hamburger{    //치즈 햄버거는 햄버거이다.!!
    //겹치지 않은 상태(필드)만 물려 받는다.
    String name ="치즈 햄버거";
}
class ChickenHamburger{
    String name = "치킨햄버거";
    //이건 컴포지션
    Hamburger h;
    public ChickenHamburger(Hamburger h) {
        this.h = h;
    }
}
public class OOPEx02 {
    public static void main(String[] args) {
        Engine e = new Engine();
        Car c1 = new Car(e);
        System.out.println(c1.e.power);

        Hamburger h1 = new CheeseHamburger();
        System.out.println(h1.name);

        Hamburger h2 = new Hamburger();
        ChickenHamburger ck1 = new ChickenHamburger(h2);
        System.out.println(ck1.name);
    }
}
