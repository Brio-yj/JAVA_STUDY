package ch01;

//MyVar은 클래스 자료형 = 개발자가 만드는 커스텀 자료형
//여러가지 데이터를 가지고 있는 클래스를 Beans 라고 한다.
//즉 MyVar은 Beans이다.
class MyVar{
    static int n1 =10;
    static char c1='A';
}
public class VarEx03 {

    static int num = 500;
    public static void main(String[] args) {
        System.out.println(MyVar.n1); // . : 주소를 찾아가는 연결 연산자
        System.out.println(num);
        System.out.println(VarEx03.num);
    }
}

/*
* static->{MyVar(n1=10,c1='A'),VarEx03(main,num)}
* stack->{main}
* num이랑 VarEx03.num이랑 사실상 같다, VarEx03 생략 가능
*
* */