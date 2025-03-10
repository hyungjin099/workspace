package practice;

public class 문제_1_12 {
  public static void main(String[] args) {
    int a = 5;
    int b = 15;
    test13(a, b);
  }

  public static void test13(int first, int second){
    //두 수 중 큰 수, 작은 수를 구분
    int max = first > second ? first : second;
    int min = first < second ? first : second;

    //min = 1,    max = 10     2 ~ 9
    for(int i = min + 1 ; i < max ; i++){
      System.out.print(i + " ");
    }

  }









  //한 정수를 매개변수로 받아, 0부터 입력받은 숫자까지
  // 출력하는 메소드를 선언 및 호출해보세요.
  public static void test12(int num){
    for(int i = 0 ; i < num + 1 ; i++){
      System.out.print(i + " ");
    }
  }

}
