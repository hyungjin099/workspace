import java.util.Scanner;

public class 정수입력받기 {
  public static void main(String[] args) {
    //키보드 입력을 받기 위한 변수(복사해서 사용!)
    Scanner sc = new Scanner(System.in);

    //정수 입력 출력
    System.out.print("정수 입력 : ");

    //정수를 입력받아,선언한 a변수에 저장
    int a = sc.nextInt();

    //a변수의 값 출력
    System.out.println("입력받은 정수 : " + a);


  }
}
