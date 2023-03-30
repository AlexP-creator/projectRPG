package view.playmusic;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import javax.swing.JOptionPane;
//import sun.audio.AudioPlayer;
//import sun.audio.AudioStream;
public class PlayMusic {
    public static void main(String[] args) {
        playMusic("C:\\Users\\alexa\\OneDrive\\Documents\\A1\\JAVA\\projectRPG\\src\\main\\java\\view\\playmusic\\Harry-Potter-20th-Anniversary-Return-to-Hogwarts-Soundtrack-Hedwig’s-Theme-John-Williams.wav");
    }

    public static void playMusic(String filepath) {
        InputStream music;
        try
        {
            music = new FileInputStream(new File(filepath));
    //        AudioStream audios=new AudioStream(music);
     //       AudioPlayer.player.start(audios);
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error");
        }

    }
    
    
}

