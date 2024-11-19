package src.varable;

public class Var8 {
    public static void main(String[] args) {
        //정수
        byte b =127; // -128 ~ 127
        short c = 32767; // -32768 ~ 32767
        int d = 1243123;  // - 2,147,483,648 ~ 2,147,483,647 (약 20억)
        long e  = 9324222224L; // 엄청 많은 큰 숫자를 담을 수 있음 이때, 뒤에 소문자 l 또는 대문자 L을 마지막에 붙여주어야 함,
        // 대문자 L을 권장함

        //실수
        float f = 10.94f; // 뒤에 f를 붙여주어야 함
        double k = 20.5; // double이 더 큰 숫자를 커버가 가능함

        // 실무에서 자주 사용하늩 아비은 int(정수),long(정수의 범위가 클 때), double(실수), String(문자 또는 문자열), boolean(true 또는 false)
    }
}
