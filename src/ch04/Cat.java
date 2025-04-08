package ch04;
//값을 초기화 하지 않는 이유는 new 할때마다 새로운 값을 주기 위해서다.
//초기화 안하면 null
public class Cat {
    //여기서 초기화 하지말고, 생성자를 통해서 초기화 하자
    String name;
    String color;

    public Cat() {
        //디폴트 생성자, 원래는 개발자가 생략해도 된다
        //만약 생성자를 임의로 추가하면 디폴트 생성자는 필수다.!!
        System.out.println("디폴트 생성자");
    }
    public Cat(String name,String color) {
        //매개변수는 stack에 존재
        //개발자가 생성자 구현함 = 디폴트 생성자 추가해줘야 한다.
        System.out.println(name+color);
        //stack에 있는 값을 heap으로 옮겨 오랫동안 보관
        this.name = name;
        this.color=color;
    }
}
