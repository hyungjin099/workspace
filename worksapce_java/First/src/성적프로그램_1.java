import java.util.Scanner;

/*
* 키보드로 국어, 영어, 수학 점수를 입력받은 후,
* 입력받은 국어, 영어, 수학 점수 및 총점,평균을 출력
* 단, 국어, 영어, 수학 점수는 정수만 저장된다고 가정
* */
public class 성적프로그램_1 {
  public static void main(String[] args) {
    //문제를 해결하기 위해 필요한 변수 생각!
    int korScore; //국어점수
    int engScore; //영어점수
    int mathScore;//수학점수
    int totalScore;//총점
    double avg;//평균

    //키보드 입력을 위한 생성
    Scanner sc = new Scanner(System.in);

    //국, 영, 수 점수 입력
    System.out.print("국어 점수 : ");
    korScore = sc.nextInt();

    System.out.print("영어 점수 : ");
    engScore = sc.nextInt();

    System.out.print("수학 점수 : ");
    mathScore = sc.nextInt();

    //총점 및 평균 계산
    totalScore = korScore + mathScore + engScore;

    //정수끼리의 연산결과는 무조건 정수로 나옴
    avg = totalScore / 3.0;

    //결과 출력
    System.out.println("국어점수 = " + korScore);
    System.out.println("수학점수 = " + mathScore);
    System.out.println("영어점수 = " + engScore);
    System.out.println("총점 = " + totalScore);
    System.out.println("평균 = " + avg);


  }
}
