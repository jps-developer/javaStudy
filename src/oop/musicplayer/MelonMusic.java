package oop.musicplayer;

public class MelonMusic implements Player{
    @Override
    public void musicStart() {
        System.out.println("Melon Music 음악을 재생 합니다.");
    }

    @Override
    public void musicStop() {
        System.out.println("Melon Music 음악을 정지 합니다.");
    }
}
