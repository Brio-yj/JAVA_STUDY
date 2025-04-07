package ch04.b;

import ch04.a.Cal;

//main이 있는 파일이 실행파일이다.
public class App {
    //JVM이 main을 찾기 위해서는 항상 public이 있어야 한다.
    //main 메서드는 리턴 타입을 허용하지 않는다.
    public static void main(String[] args) {
        Cal c = new Cal();
        c.minus();
    }
}
