//변수(Variable)
//값 "하나"를 저장할 수 있는 공간

//변수를 사용하기 위해서는
//1. 변수의 선언
//  선언문법 : 자료형 변수명;
//  자료형 : 자료의 형태(숫자, 문자, 날짜)
//2. 변수의 초기화
//  변수 선언 후 최초에 값을 할당(저장)하는 행위

//변수명 정의법
//변수명은 소문자로 작성한다(관례)
//변수명은 명확해야하고, 복합어의 경우 카멜케이스(Camel Case)로 작성한다
public class 변수_1 {
  public static void main(String[] args) {
    //변수의 선언
    //int -> integer(정수)
    int num; //정수를 저장할 공간 num을 선언하겠다.

    //변수에 데이터를 저장
    // '=' : 우측의 값을 왼쪽에 저장한다.
    //2. 변수의 초기화
    num = 5;

    //변수에 데이터 저장
    num = 10;

    //출력문의 소괄호 안에 변수명을 넣으면 변수에 저장된 값을 출력
    System.out.println(num);
    System.out.println("num");
    System.out.println(num + 5); //1. 15


  }
}
