package ch02;
///레퍼런스(참조) 변수, 일반 변수
// new가 되어서 힙에 할당이 되야 사이즈를 알 수 있다.(즉, 프로그램 실행될때 = Runtime 일때 알 수 있다.)
class MyData{
    int id=1;           //4byte
    int price =1000;    //4byte
}
public class VarRefEx01 {
    public static void main(String[] args) {
        int num =10;//일반변수, 크기가 정해져 있음(크기가 정해져 있는것 = 컴파일 시점)
        MyData d = new MyData(); // 레퍼런스 변수(크기가 정해져 있지 않은것 = 컴파일 시점)
    }
}
//일반변수 : 값을 가진다 -> 컴파일 할때 크기 확인 가능
//참조변수 : 주소를 가진다 -> 런타임 할때 크기 확인 가능 -> 주소가 가리키는 heap에 값이 있다
