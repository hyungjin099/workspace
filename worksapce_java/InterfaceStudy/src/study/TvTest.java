package study;

//국제 tv 연합 기구
public class TvTest {
  public static void main(String[] args) {
    Tv tv = new LgTV();
    tv.turnOn();
    tv.volumeDown();
    tv.volumeUp();
    tv.turnOff();

    SamsungTV[] a = new SamsungTV[3];
    a[0] = new SamsungTV();
    //a[1] = new LgTV();

    Tv[] c = new Tv[3];
    c[0] = new SamsungTV();
    c[1] = new LgTV();


  }
}








