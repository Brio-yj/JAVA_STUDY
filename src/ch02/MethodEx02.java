package ch02;

public class MethodEx02 {
    static int add(){  //호출되면 중괄호 내부가 실행된다. add stack이 call stack에 만들어진다
        int sum= 5;
        System.out.println(sum);    //출력
        return sum; // return 된다는건 add stack에 존재하는 sum의 값이 main stack의 result 값으로 옮겨간다

    }
    public static void main(String[] args) {
        int result =add();  //add() 메서드 호출
        System.out.println(result);
    }
}
