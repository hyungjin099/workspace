package study;

import java.util.Arrays;

//기본자료형을 제외한 모든 자료형은 기본 초기값 : null
public class Song {
  String title;
  String artist;
  String album;
  int year;
  String[] composer;//작곡가는 3명

  //모든 필드를 초기화하는 메서드
  public void initSong(String title, String artist, String album, int year, String[] composer){
    this.title = title;
    this.artist = artist;
    this.album = album;
    this.year = year;
    this.composer = composer;
  }

  //노래 정보를 출력하는 메서드
  public void printSong(){
    System.out.println("제목 : " + title);
    System.out.println("가수 : " + artist);
    System.out.println("앨범 : " + album);
    System.out.println("발표년도 : " + year);
    System.out.println("작곡가 : " + Arrays.toString(composer));
  }

}
