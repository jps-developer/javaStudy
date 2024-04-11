package oop.musicplayer;

public class AppleMusic implements Player{
    @Override
    public void musicStart() {
        System.out.println("Apple Music 음악을 재생 합니다.");
    }

    @Override
    public void musicStop() {
        System.out.println("Apple Music 음악을 정지 합니다.");
    }
}
