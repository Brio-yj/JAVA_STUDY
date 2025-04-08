package ch04;
class Food{
    String name;
    int price;
    Food(String name,int price){
        this.name=name;
        this.price=price;
    }
    void pprint(){
        System.out.println(name+price);
    }
}
public class Ex {
    public static void main(String[] args) {
        Food f1 = new Food("p",12);
        f1.pprint();
    }
}