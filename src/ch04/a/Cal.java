package ch04.a;

public class Cal {
    void add(){
        // 리턴 앞에 아무것도 없으면 디폴트 접근제어자
        // 같은 패키지에서만 접근 가능하다
        System.out.println("더하기 메서드");
    }
    public void minus(){
        System.out.println("빼기 메서드");
    }
    private void mul(){
        System.out.println("곱하기 메서드");
    }
    void devide(){
        mul();  //mul이 프라이빗이여도 같은 클래스니까 사용가능하다
    }
}
