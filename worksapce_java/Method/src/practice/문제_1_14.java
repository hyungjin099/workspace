package practice;

public class 문제_1_14 {
  public static void main(String[] args) {
    test15("java", 5);
  }

  //한 문자열과 정수를 매개변수로 받아,
  //매개변수로 받은 문자열을 매개변수로 받은 숫자만큼 반복 출력
  public static void test15(String str, int num){
    for(int i = 0 ; i < num ; i++){
      System.out.println(str);
    }
  }









  //두 정수를 매개변수로 받아,
  // 두 정수 사이의 5의 배수의 개수를 출력하는 메소드
  public static void test14(int a, int b){
    int max = a > b ? a : b;
    int min = a < b ? a : b;
    int cnt = 0;

    for(int i = min + 1 ; i < max ; i++){
      if(i % 5 == 0){
        cnt++;
      }
    }
    System.out.println(cnt);
  }


}
