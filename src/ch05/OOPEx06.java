package ch05;
class 프로{
    String name ="프로";
    void 공격(프로 e){
        System.out.println("프로 메서드");
    }
    String 이름확인(){
        return "프로";
    }

}
class 질럿 extends 프로{
    String name ="질럿";
    //오버 라이드 = 무효화, 부모의 메서드를 무효화 한다
    void 공격(프로 e){
        System.out.println("타깃 :"+e.이름확인()+"실행 : "+this.name);
    }
    //오버 라이드 = 무효화, 부모의 메서드를 무효화 한다
    String 이름확인(){
        return name;
    }
}
class 드라 extends 프로{
    String name ="드라";
    void 공격(프로 e){
        System.out.println("타깃 :"+e.이름확인()+"실행 : "+this.name);
    }
    String 이름확인(){
        return name;
    }
}
class 다크 extends 프로{
    String name ="다크";
    void 공격(프로 e){
        System.out.println("타깃 :"+e.이름확인()+"실행 : "+this.name);
    }
    //🔥함수명 다르게하면 제대로 오버라이딩 안된다🔥
    String 이름체크(){
        return name;
    }
}
public class OOPEx06 {
    public static void main(String[] args) {
        프로 u1 = new 질럿();
        프로 u2 = new 드라();
        프로 u3 = new 다크();

        u1.공격(u2);
        u2.공격(u3);
        u3.공격(u1);
    }
}
