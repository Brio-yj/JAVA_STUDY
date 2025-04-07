package ch04;

import recipe.Mysoup;

import java.util.Random;

//JDK 설치 - JDK(javac-컴파일 도구,java-실행 도구),JRE(라이브러리),JVM(자바 가상머신-자바 실행 엔진)
public class LibEx01 {
    public static void main(String[] args) {
        Mysoup m = new Mysoup();
        m.김치찌개();

        Random r = new Random();
        System.out.println(r.nextInt());
    }
}
