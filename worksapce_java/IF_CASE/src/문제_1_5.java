import java.util.Scanner;

public class 문제_1_5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int score;
    String grade;

    System.out.print("점수 입력 : ");
    score = sc.nextInt();

    if(score > 90 && score <= 100){
      grade = "A";
    }
    else if(score > 80){
      grade = "B";
    }
    else{
      grade = "C";
    }

    System.out.println("학점은 " + grade + "입니다");

  }
}
