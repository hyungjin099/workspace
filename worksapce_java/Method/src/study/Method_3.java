package study;

/*
* 매개변수가 있는 메서드
* 매개변수 : 메서드의 정의 부분에 () 영역에 작성한 변수를 매개변수
* 매개변수가 하는 역할 : 메서드 내에서 기능을 구현 할 때
*                      특정 데이터가 필요하다면, 그 데이터를
*                      매개변수로 작성!
* */
public class Method_3 {
  public static void main(String[] args) {
    printNum(5);
    printNum(10);
    printNum(20);

  }

  //원하는 숫자를 출력하는 메서드 정의
  public static void printNum(int num){//int num = 10;
    System.out.println(num);
  }
}
