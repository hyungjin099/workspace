package test;

public class Member {
    private String id;
    private String pw;
    private String name;
    private int age;

    public void setInfo(String id, String pw, String name, int age) {
        this.id = id;
        this.pw = pw;
        this.name = name;
        this.age = age;
    }

    public void showInfo() {
        System.out.println(this);
    }

    public boolean isLogin(String id, String pw) {
        return this.id.equals(id) && this.pw.equals(pw);
    }

    @Override
    public String toString() {
        return "Member{" +
                "id='" + id + '\'' +
                ", pw='" + pw + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
