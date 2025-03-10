// 한 줄 주석입니다.
/*
 * 여러줄 주석
 * 자바 코드 작성을 위해서는 src 폴더에서 class 파일을 생성
 * class 파일의 이름은 반드시 대문자로 시작
 * 자바의 모든 코드는 클래스 안에 있는 main 메서드(method)에 작성한다.
 * 코드는 'main 메서드'의 위에서부터 아래로 차례대로 해석된다.
 * */

import java.util.Scanner;

public class Hello {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    try{
      System.out.println("첫번째 수 :");
      int a = sc.nextInt();
      System.out.println("두번째 수 :");
      int b = sc.nextInt();

      System.out.println(a / b);
    }catch(Exception e){
      System.out.println("오류 발생");
    }finally {
      System.out.println("오류 발생 여부 상관없이 무조건 실행");
    }


    System.out.println("시스템 종료");

    String name = "hong";

    char first = name.charAt(0); // 'h'
    char second = name.charAt(1); // 'h'

  }
}









