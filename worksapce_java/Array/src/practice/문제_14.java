package practice;
//초기값을 5,4,3,2,1로 갖는 배열 arr을 만들자.
// 그리고 길이가 5인 새로운 정수형 배열 newArr을 만든 후
// arr이 가진 값을 newArr로 복사하여 보자.
// 복사 결과는 출력을 통해 확인한다.
public class 문제_14 {
  public static void main(String[] args) {
    int[] arr = {7, 10, 11, 15, 2, 9};
    int[] newArr = new int[arr.length];

    for(int i = 0 ; i < arr.length ; i++){
      newArr[i] = arr[i];
    }

    for(int i = 0 ; i < newArr.length ; i++){
      System.out.print(newArr[i]+ " ");
    }


  }
}
