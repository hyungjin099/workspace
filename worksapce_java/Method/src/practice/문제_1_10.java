package practice;

// 정수를 매개변수로 받아, 그 정수가 짝수이면 ‘짝수입니다’,
//홀수이면 ‘홀수입니다’를 출력하는 메소드
public class 문제_1_10 {
  public static void main(String[] args) {
    //test10() 메서드의 인자로 5가 전달되었다.
    //test10(5);
    test11(7, 5);
  }

  public static void test11(int a, int b) {
    if (a % 2 == 0 && b % 2 == 0) {
      System.out.println("짝수");
    }
    else if (a % 2 == 1 && b % 2 == 1) {
      System.out.println("홀수");
    }
    else{
      System.out.println("하나만 짝수");
    }
  }








  // 조건 ? 참일 때 실행 내용 : 거짓을 때 실행 내용;
  public static void test10(int a){
    System.out.println( a % 2 == 0 ? "짝수입니다" : "홀수입니다" );
  }

}
