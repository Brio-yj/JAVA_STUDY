package ch01;

public class VarEx02 {
    static int n2 =20;
    public static void main(String[] args) {
        int n1 =10; //여기가 실행될때 10이라는 숫자가 n1에 저장된다
        System.out.println(n1); //main이라는 stack에 있는 n1
        System.out.println(n2); //VarEx02라는 static에 있는 n2
    }
}
