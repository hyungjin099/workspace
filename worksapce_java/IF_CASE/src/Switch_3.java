public class Switch_3 {
  public static void main(String[] args) {
    /*
    * 0~100사이의 임의의 정수를 변수에 저장하고
    * 90 <= x <= 100  -> 문자열 'A' 출력
    * 80 <= x <= 89  -> 문자열 'B' 출력
    * 70 <= x <= 79  -> 문자열 'C' 출력
    * x <= 69  -> 문자열 'D' 출력
    * switch case break
    * */

    int score = 85;

    switch(score / 10){
      case 10:
      case 9:
        System.out.println("A");
        break;
      case 8:
        System.out.println("B");
        break;
      case 7:
        System.out.println("C");
        break;
      default:
        System.out.println("D");
    }

    // 숫자 비교 '=='
    // 문자열 비교 '==' 로 비교 불가
    String a = "java";
    String b = "java";
    if(   a.equals(b)       ){
    }

    String c = "java";
    if(    c.equals("java")      ){
    }

    if(    "java".equals("dfsf")      ){

    }





  }
}
