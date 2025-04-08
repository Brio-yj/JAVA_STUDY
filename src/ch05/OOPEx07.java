package ch05;
abstract class Animal{
    //추상 메서드는 중괄호 필요없다. 어차피 안쓰이기도 하니까
    abstract void speak();
    //추상클래스 안에 추상 메서드만 있어야 하는건 아니다
    void hello(){
        System.out.println("hi");
    }
}
class Dog extends Animal{
    void speak(){
        System.out.println("멍");
    }
}
class Cat extends Animal{
    //부모가 추상메서드를 가지고 있으면 자식은 추상메서드를 반드시 상속해야한다
    //강제성이 있기 때문에 실수 할 수가 없다!!!!!!
    @Override
    void speak() {
        System.out.println("옹");
    }
}
public class OOPEx07 {
    public static void main(String[] args) {
        Animal a1 = new Dog();
        a1.hello();

        //동적 바인딩!!
        a1.speak();
        //Animal a3 = new Animal(); -> 불가, 추상클래스는 new 할 수 없다.
    }
}
