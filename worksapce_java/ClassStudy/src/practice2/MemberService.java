package practice2;

public class MemberService {
  public boolean login(String id, String password){
    return id.equals("hong") && password.equals("12345") ? true : false;
  }

  public void logout(String id){
    System.out.println("로그아웃 되었습니다.");
  }
}
