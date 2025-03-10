package com.green.First;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

//anotaion 어노테이션
@RestController
public class TestController {

  // localhost:8080/t1
  @GetMapping("/t1")
  public String test1(){
    return "java";
  }

  //http://localhost:8080/t2
  @GetMapping("/t2")
  public int test2(){
    return 10;
  }

  @GetMapping("/t3")
  public Person test3(){
    //Person 클래스에 대한 객체를 하나 생성!
    //클래스명 객체명 = new 생성자호출;
    Person p = new Person("kim", 20, "울산시");
    return p;
  }

  @GetMapping("/t4")
  public List<Person> test4(){
    //Person 클래스에 대한 객체를 다수 저장할 수 있는 리스트 생성
    List<Person> list = new ArrayList<>();

    Person p1 = new Person("kim", 20, "울산시");
    Person p2 = new Person("lee", 30, "부산시");
    Person p3 = new Person("hong", 40, "대구시");

    list.add(p1);
    list.add(p2);
    list.add(p3);

    return list;
  }

  @GetMapping("/t5")  //axios.get()
  public List<Student> test5(){
    List<Student> studentList = new ArrayList<>();

    studentList.add(new Student("kim", 80, 70, 75));
    studentList.add(new Student("lee", 60, 70, 100));
    studentList.add(new Student("hong", 80, 90, 75));
    studentList.add(new Student("park", 80, 80, 50));
    studentList.add(new Student("choi", 65, 70, 85));

    return studentList;
  }

  //react에서 전달하는 데이터를 자바에서 받는 문법은 2가지 존재
  //1. 클래스를 활용하는 방법
  // react에서 전달하는 객체의 key와
  // 자바에서 데이터를 받기 위해 매개변수에 선언한 클래스의 변수명이
  // 동일하면 데이터를 자동으로 받아옴
  //2. Collection Framework의 Map을 활용하는 방법
  @PostMapping("/t6")
  public void test6(@RequestBody Student student){
    System.out.println(student.toString());
  }

  @PostMapping("/t7")
  public int test7(@RequestBody PhoneDTO phoneDTO){
    System.out.println(phoneDTO.toString());
    return 10;
  }

  @PostMapping("/t8")
  public int test8(@RequestBody Student student){
    int sum = student.getKorScore() + student.getEngScore() + student.getMathScore();
    return sum;
  }

  @PostMapping("/t9")
  public void test9(@RequestBody OrderDTO orderDTO){
    System.out.println(orderDTO.toString());
  }

  @GetMapping("/getLottoNum")
  public int getLottoNum(){
    int num = (int)(Math.random() * 45 + 1);
    return num;
  }

  @GetMapping("/getBoardList")
  public List<Board> sendBoardList(){
    List<Board> boardList = new ArrayList<>();
    boardList.add(new Board(1, "제목1", "김자바", 5, "제목1 내용입니다"));
    boardList.add(new Board(2, "제목2", "김자바", 0, "제목2 내용입니다"));
    boardList.add(new Board(3, "제목3", "김자바", 1, "제목3 내용입니다"));
    boardList.add(new Board(4, "제목4", "김자바", 3, "제목4 내용입니다"));
    boardList.add(new Board(5, "제목5", "김자바", 10, "제목5 내용입니다"));

    return boardList;
  }

}








