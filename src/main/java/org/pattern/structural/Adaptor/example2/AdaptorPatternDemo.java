package org.pattern.structural.Adaptor.example2;

public class AdaptorPatternDemo {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "mp3file.mp3");
        audioPlayer.play("vlc", "vlcFile.vlc");
        audioPlayer.play("mp4", "mp4File.mp4");
        audioPlayer.play("avi", "video.avi");
    }
}
