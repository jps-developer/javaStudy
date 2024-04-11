package oop.musicplayer;

public class MusicPlayerStore {
    public static Player finPlayer(String option){
        if(option.equals("Apple")){
            return new AppleMusic();
        }

        else if (option.equals("Youtube"))
        {
            return new YoutubeMusic();
        }
        else if(option.equals("Melon"))
        {
            return new MelonMusic();
        }
        else{
            return null;
        }
    }
}
