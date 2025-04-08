package ch04;

public class DogApp {
    public static void main(String[] args) {
        Dog d = new Dog();
        System.out.println(d.age);
        System.out.println(d.name);
        System.out.println(d.color);
        d.age+=1;
        d.name="aa";
        //d.color"bb";  불가
    }
}