import java.util.Scanner;

public class 문제_11_while {
  public static void main(String[] args) {
    //키보드로 두 정수를 입력받아
    //입력받은 두 정수 사이의 모든 정수의 합을 출력하여라.
    Scanner sc = new Scanner(System.in);
    int num1, num2;

    System.out.print("첫번째 수 : ");
    num1 = sc.nextInt();
    System.out.println("두번째 수 : ");
    num2 = sc.nextInt();

    //두 수 중 큰 수와 작은 수를 구분
    int min = num1 > num2 ? num2 : num1;
    int max = num1 > num2 ? num1 : num2;

    //num1 : 1, num2 : 10
    int i = min + 1;
    int sum = 0;

    while(i < max){
      sum = sum + i;
      i++;
    }

    System.out.println(sum);



  }
}
