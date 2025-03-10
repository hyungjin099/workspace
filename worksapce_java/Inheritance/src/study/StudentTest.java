package study;

public class StudentTest {
  public static void main(String[] args) {
    int[] arr1 = {1,2,3};
    int[] arr2 = arr1;
    arr2[0] = 5;
    System.out.println(arr1[0]); //5
    System.out.println(arr2[0]); //5

    String a = "java";
    String b = a;
    b = "python";
    System.out.println(a);//java
    System.out.println(b);//python




    //String 데이터는 메모리 공간 낭비를 최소화활수 있도록 설계
    String str1 = "react";
    String str2 = "react";
    str2 = "coffee";
    System.out.println("str1 = " + str1);
    System.out.println("str2 = " + str2);

    String str3 = new String("java");
    String str4 = new String("java");

    // == 두 객체가 주소값이 같은지 비교하는 연산
    // 숫자 비교 연산에서 사용
    if(str1 == str2){
      System.out.println("str1과 st2는 같습니다.");
    }

    if(str3 == str4){
      System.out.println("str3과 st4는 같습니다.");
    }





  }
}
