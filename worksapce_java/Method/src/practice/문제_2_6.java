package practice;

public class 문제_2_6 {
  public static void main(String[] args) {
    double a = 10;
  }

  //세 정수를 매개변수로 받아,
  // 세 정수의 평균을 리턴하는 메소드를 선언하고 사용해보세요.
  public static double test8(int a, int b, int c){
    return (a + b+ c) / 3.0;
  }


  //실수를 매개변수로 받아,
  // 그 수의 제곱 값을 리턴하는 메소드를 만들고 사용해보세요
  public static double test7(double d){
    return d * d;
  }


  //매개변수로 정수를 입력받아,
  //입력받은 정수를 문자열로 리턴하는 메소드
  public static String test5(int num){
    //숫자 -> 문자열
    String a = String.valueOf(10);
    //문자열 -> 정수
    int b = Integer.parseInt("10");

    return String.valueOf(num);
    //return num + "";
  }



}
