package test;

public class MemberTest {
    public static void main(String[] args) {
        var member = new Member();
        member.setInfo("java", "1234", "kim", 20);
        member.showInfo();
        tryLogin(member, "java", "1234");
        tryLogin(member, "java", "1111");
    }

    private static void tryLogin(Member member, String id, String pw) {
        var message = member.isLogin(id, pw) ? "로그인 가능" : "로그인 불가능";
        System.out.println(message);
    }
}
