package practice;

public class 문제_7 {
  public static void main(String[] args) {
    //정수를 10개 저장할 수 있는 배열을 생성하고,
    // 각 요소에 1 ~ 10까지 차례대로 넣어보라.
    // 그리고 값이 잘 들어갔는지 확인해보라.
    int[] arr = new int[10];

    // 각 요소에 1 ~ 10까지 차례대로 넣어
    for(int i = 0 ; i < arr.length ; i++){
      arr[i] = i + 1;
    }

    //출력
    for(int i = 0 ; i < arr.length ; i++){
      System.out.print(arr[i] + " ");
    }




  }
}
