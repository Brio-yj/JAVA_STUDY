package ch05;

// ✅ [인터페이스] CanAble: "대화할 수 있는 능력"만을 명시 → SRP에 적합
interface CanAble {
    void talk();
}

// ✅ [추상 클래스] 홀직원: 홀에서 일하는 직원의 공통 기능 정의
// - 공통 기능: talk() 구현 (손님과 대화)
// - SRP에 따라 "홀직원 역할"에만 집중
abstract class 홀직원 implements CanAble {
    abstract void 청소();

    @Override
    public void talk() {
        System.out.println("손님과 대화");
    }
}

// ✅ 종업원: 홀직원의 하위 역할 (서빙과 주문)
// - 역할 구분 명확 → SRP에 부합
abstract class 종업원 extends 홀직원 {
    void 서빙() {
        System.out.println("서빙");
    }
    void 주문() {
        System.out.println("주문받기");
    }
}

// ✅ 캐셔: 홀직원의 다른 하위 역할 (정산과 계산)
abstract class 캐셔 extends 홀직원 {
    void 정산하기() {
        System.out.println("정산하기");
    }
    void 계산하기() {
        System.out.println("계산하기");
    }
}

// ✅ 요리장인: 홀과 무관한 역할 (talk 기능 없음)
// - talk을 구현하지 않음 → CanAble과 분리 → SRP 명확
abstract class 요리장인 {
    abstract void 요리();
}

// ✅ 기: 종업원 역할 수행
class 기 extends 종업원 {
    @Override
    void 청소() {
        System.out.println("기 청소");
    }
}

class 니 extends 종업원 {
    @Override
    void 청소() {
        System.out.println("니 청소");
    }
}

class 디 extends 캐셔 {
    @Override
    void 청소() {
        System.out.println("디 계산");
    }
}

class 리 extends 캐셔 {
    @Override
    void 청소() {
        System.out.println("리 계산");
    }
}

class 미 extends 요리장인 {
    @Override
    void 요리() {
        System.out.println("미 요리");
    }
}

class 비 extends 요리장인 {
    @Override
    void 요리() {
        System.out.println("비 요리");
    }
}

// ✅ DIP 적용: 상위 모듈이 인터페이스(CanAble)에 의존하고 구현체는 몰라도 됨
class 응대매니저 {
    // 상위 모듈은 "대화할 수 있는 능력(CanAble)"에만 의존
    // 기, 디 등의 구체 클래스에 의존하지 않음
    public void 응대하기(CanAble staff) {
        staff.talk(); // 이 staff가 누구든 talk()만 있으면 됨
    }
}

public class OOPEx10 {
    public static void main(String[] args) {
        // 구체적인 구현체를 인터페이스 타입으로 다루기
        // => 구현이 바뀌더라도 응대매니저 코드는 변경될 필요가 없음
        CanAble staff1 = new 기();
        CanAble staff2 = new 디();

        응대매니저 manager = new 응대매니저();
        manager.응대하기(staff1);
        manager.응대하기(staff2);
    }
}

/*
✅ SRP (Single Responsibility Principle, 단일 책임 원칙)
- 각 클래스가 "하나의 역할"만을 책임지도록 설계됨
    - 종업원: 서빙 & 주문
    - 캐셔: 정산 & 계산
    - 요리장인: 요리만
    - 인터페이스 CanAble은 "talk"이라는 기능만을 명세함

✅ DIP (Dependency Inversion Principle, 의존 역전 원칙)
- 기존: 상위 모듈이 하위 구현 클래스(기, 디 등)에 직접 의존하면 유연성이 떨어짐
- 개선: 상위 모듈(응대매니저)은 인터페이스(CanAble)에만 의존
    - 구체 클래스가 바뀌어도 응대매니저는 전혀 영향을 받지 않음
    - ex) 새로운 대화 가능한 클래스가 추가되면 그대로 확장 가능
    - 이는 코드의 확장성, 유지보수성, 테스트 용이성을 향상시킴
*/
