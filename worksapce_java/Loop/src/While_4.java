public class While_4 {
  public static void main(String[] args) {
    //2 4 6 8 10 을 while을 사용해서 출력
    int num = 2;

    while(num < 11){
      if(num % 2 == 0){
        System.out.println(num);
      }

      num++;
    }


  }
}
