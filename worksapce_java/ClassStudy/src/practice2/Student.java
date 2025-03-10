package practice2;

public class Student {
  private String name;
  private int age;
  private String grade;
  private String tel; //"010-1111-2222"

  public Student(String name, int age, String grade, String tel) {
    this.name = name;
    this.age = age;
    this.grade = grade;
    this.tel = tel;
  }

  public void printStudent(){
    System.out.println("이름 : " + name);
    System.out.println("나이 : " + age);
    System.out.println("학점 : " + grade);
    System.out.println("연락처 : " + tel);
  }

}
