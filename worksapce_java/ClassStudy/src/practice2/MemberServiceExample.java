package practice2;

public class MemberServiceExample {
  public static void main(String[] args) {
    MemberService memberService = new MemberService();
    boolean result = memberService.login("hong", "1111");

    if(result){
      System.out.println("로그인 되었습니다");
      memberService.logout("hong");
    }
    else{
      System.out.println("id 또는 pw 불일치");
    }

  }
}
