public class 문제_6_For {
  public static void main(String[] args) {
    //1 ~ 100까지 숫자 중 3의 배수인 수의 개수를 구하세요
    int cnt = 0;

    for(int i = 1 ; i < 101 ; i++){
      if(i % 3 == 0){
        cnt++;
      }
    }
    System.out.println(cnt);


  }
}
