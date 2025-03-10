package study;

//이름, 나이, 주소
public class Man {
  String name;
  int age;
  String address;

  //맴버변수의 모든 값을 초기화 할 수 있는 메소드
  public void initMember(String name, int age, String address){
    this.name = name;
    this.age = age;
    this.address = address;
  }

  public void setName(String name){
    this.name = name;
  }

  public void setAge(int age){
    this.age = age;
  }

  public void setAddress(String address){
    this.address = address;
  }

  public int getAge(){
    return age;
  }

  public String getAddress(){
    return address;
  }

  public String getName(){
    return name;
  }

  //맴버변수의 모든 정보를 출력하는 메소드
  public void printInfo(){
    System.out.println("이름 : " + name);
    System.out.println("나이 : " + age);
    System.out.println("주소 : " + address);
  }








}
