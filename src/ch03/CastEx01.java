package ch03;

public class CastEx01 {
    public static void main(String[] args) {
        int n1 = 100;   //4byte
        double d1 =n1;  //8byte
        System.out.println(d1);//업캐스팅(작은크기를 큰 용량에 넣기, 그냥 허용해준다)
        double d2 = 100.8;
        //int n2 = d2;  double을 int로 변환할 수 없다
        //명시적 변환 (int) 다운 캐스팅
        int n2=(int)d2; //단점 : 데이터 유실 위험 있다
        System.out.println(n2);
    }
}
