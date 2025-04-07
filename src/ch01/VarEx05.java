package ch01;

//VarEx05 -> main
//Note -> X
class Note{
    int price = 2000;
}
public class VarEx05 {
    public static void main(String[] args) {
        new Note(); //heap 공간에 Note클래스가 가지고 있는 모든 데이터를 할당해!, 대신 static은 제외하고
        Note note1 = new Note();
        int age =25; //main stack에 생성
        System.out.println(note1.price);
        note1.price=1;
        System.out.println(note1.price);
    }
}
/*
* static->[VarEx05(main),Note]
* stack->[main(age=25)]
*
* new Note()실행되면 아래처럼 heap에 Note공간 생성된다
*
* heap
* [
* Note(price=2000)
* Note(price=2000) = note1
* ]
*
* */
