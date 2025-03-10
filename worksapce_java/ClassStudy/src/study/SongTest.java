package study;

//song.initSong("java", "김자바", "1집", 2025, new String[]{"김자바", "이자바", "박자바"});
public class SongTest {
  public static void main(String[] args) {
    Song song = new Song();
    String[] composer = {"김자바", "이자바", "박자바"};
    song.initSong("java", "김자바", "1집", 2025, composer);
    song.printSong();

  }
}
