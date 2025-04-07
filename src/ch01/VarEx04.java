package ch01;



class Note1{
    static int num =1;
    static int time=1015;
    static int price =3000;
}
public class VarEx04 {
    public static void main(String[] args) {

    }
}

/*
* MyVar 값을 static으로 저장하면 아래와 같은 단점이 있다
* 프로그램 시작 전부터 종료할때까지 메모리에 존재한다
* 많은 데이터를 저장하고 싶을때는 클래스 자료형을 여러개 만들어야 한다
* static은 자바 프로그램이 시작하기 전에 생성되기 때문에 프로그램 중간에 추가로 static에 넣을 수 없다
* 즉 static은 정적이다 -> 프로그램 시작된 후 관리가 불가능하다
*
* 동적인 방법을 찾아야 한다
*
* */