package study;

/*
* 자동차를 객체로 만들기 위해 자동차 설계도를 작성!!
* 클래스의 구성 요소 : 데이터(변수), 기능(메서드의 정의), 생성자
* 클래스 안에서 선언한 변수 : 맴버변수, 필드
* 메서드 안에서 선언한 변수 : 지역변수(local variable)
* 맴버변수 vs 지역변수
*  - 지역변수는 반드시 초기화 필요!
*  - 맴버변수는 초기화하지 않으면 기본값으로 초기화가 자동 진행
* */
public class Car {
  String carName; //자동자명
  int price; //자동차 가격

  public void powerOn(){
    System.out.println(carName);
  }



}






