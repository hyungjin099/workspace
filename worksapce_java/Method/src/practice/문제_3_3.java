package practice;

public class 문제_3_3 {
  public static void main(String[] args) {
    int result = test3();
    System.out.println(result);

    System.out.println(test3());
  }

  //Math.random() 메소드를 활용하여
  //1~ 50의 수 중 랜덤한 정수를 리턴하는 메소드
  public static int test3(){
    // 1.0 <= x < 51.0 실수 리턴
    return (int)(Math.random() * 50 + 1);
  }



}
