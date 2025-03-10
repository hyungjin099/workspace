package practice;

public class 문제_2_3 {
  public static void main(String[] args) {

  }

  //5.
  public static String test5(int num){
    if(num >= 90){
      return "A";
    }
    else if(num >= 70){
      return "B";
    }
    else{
      return "C";
    }
  }


  //두 정수를 매개변수로 받아,
  //두 정수 중 큰 숫자를 리턴하는 메소드를 선언하고 사용해보세요.
  public static int test3(int a, int b){
    return a > b ? a : b;
  }




}
