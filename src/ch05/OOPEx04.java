package ch05;
class 임꺽정{
    void 달리기(){
        System.out.println("달리기1");
    }
    //과적재=overloading 사용
    void 달리기(int speed){
        System.out.println("달리기2");
    }
}
public class OOPEx04 {
    public static void main(String[] args) {
        임꺽정 e = new 임꺽정();
        e.달리기();
        e.달리기(1);
    }
}
