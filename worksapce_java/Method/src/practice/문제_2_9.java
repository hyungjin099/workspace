package practice;

public class 문제_2_9 {
  public static void main(String[] args) {

  }


  //매개변수로 문자열 데이터 하나를 받아,
  // 해당 문자열의 길이가 짝수 일 때는 true를 리턴하고,
  //홀수 일 때는 false를 리턴하는 메서드
  public static boolean test10(String a){
    return a.length() % 2 == 0;
  }


  //한 정수를 매개변수로 받아,
  //1부터 매개변수로 받은 수까지 중 홀수의 합을 리턴하는 메소드
  public static int test9(int num){
    int sum = 0;
    for(int i = 1 ; i < num + 1 ; i++){
      if(i % 2 == 1){
        sum = sum + i;
      }
    }
    return sum;
  }


}
