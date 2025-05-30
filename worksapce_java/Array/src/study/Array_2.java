package study;

//배열 생성 추가 내용 및 또 다른 배열 생성 방법
public class Array_2 {
  public static void main(String[] args) {
    //정수를 3개 저장할 수 있는 배열 arr1 생성
    //정수형 배열을 생성하면 모든 공간은 0으로 초기화 된다
    int[] arr1 = new int[3];

    //실수를 5개 저장할 수 있는 배열 arr2 생성
    //실수형 배열을 생성하면 모든 공간은 0.0으로 초기화 된다
    double[] arr2 = new double[5];

    //String 배열을 생성하면 null로 초기화된다.
    //null : 값이 정해지지 않음
    //boolean 배열을 생성하면 false로 초기화된다.

    //배열의 또 다른 생성 방법(잘 사용하지 않음)
    //배열의 생성과 동시에 특정 값으로 초기화하는 방법

    //정수 1,3,5로 초기화된 배열 생성
    int[] arr3 = {1, 3, 5};

    //특정 값으로 초기화 시키는 생성 방법은
    //선언 및 생성을 별도로 진행 할 수 없다.
    int[] arr6;
    //arr6 = {1, 3, 5}; 오류 발생!!


    //문자열 "java", "c++", "python"으로 초기화된 배열 생성
    String[] arr4 = {"java", "c++", "python"};

    //실수형 배열
    double[] arr5 = {1.1, 2,2, 5.5, 3.3};
  }
}
