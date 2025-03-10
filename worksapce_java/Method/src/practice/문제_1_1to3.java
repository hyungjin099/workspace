package practice;

import java.util.Scanner;

public class 문제_1_1to3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("정수 입력 : ");
    int num = sc.nextInt();
    test8(num);
  }

  //8.키보드로 입력받은 정수를 매수변수로 받아,
  //해당 정수를 출력하는 메소드를 선언, 호출해보세요
  public static void test8(int num){
    System.out.println(num);
  }

  //2.정수 하나를 매개변수로 받아, 그 값을 출력하는 메소드를 선언
  public static void test2(int num){
    System.out.println(num);
  }

  //1.‘안녕하세요’ 라는 문자열를 출력하는 기능을 가진 메소드를 선언
  public static void test1(){
    System.out.println("안녕하세요");
  }


}
