package ch02;

import java.util.Stack;

public class StackEx02 {
    static int sum =20;//전역변수(static)
    int value = 10;//전역변수(heap)
    static void a(){
        int n1= 1;  //지역변수(a 메서드의 스택영역에 저장된다)
        System.out.println(n1);

        //static int n2 =2; 이건 불가능, static은 main메서드 실행전에 할당이 끝나야 하기 때문
    }
    public static void main(String[] args) {
        a();
        int num =30;
        System.out.println(sum);
        StackEx02 s = new StackEx02();
        System.out.println(s.value);
//        System.out.println(s.num);
        System.out.println("여기 부터는 더이상 s 참조하지 않기 때문에 " +
                "heap에있는 value가 자동 삭제 된다");
    }
}
