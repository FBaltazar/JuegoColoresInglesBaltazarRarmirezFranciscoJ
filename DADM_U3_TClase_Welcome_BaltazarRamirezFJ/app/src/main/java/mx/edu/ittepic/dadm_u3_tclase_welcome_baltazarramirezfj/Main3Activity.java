package mx.edu.ittepic.dadm_u3_tclase_welcome_baltazarramirezfj;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Main3Activity extends AppCompatActivity {
    MediaPlayer player;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new Lienzo3(this));
    }
    public void audioAmarillo()//
    {
        player = MediaPlayer.create(this, R.raw.audioyellow);
        player.start();
    }
    public void audioAzul()//
    {
        player = MediaPlayer.create(this, R.raw.bluee);
        player.start();
    }
    public void audioBlack()//
    {
        player = MediaPlayer.create(this, R.raw.audioblack);
        player.start();
    }
    public void audioPink()//
    {
        player = MediaPlayer.create(this, R.raw.audiopink);
        player.start();
    }
    public void audioRojo()//
    {
        player = MediaPlayer.create(this, R.raw.audiored);
        player.start();
    }
    public void audioVerde()//
    {
        player = MediaPlayer.create(this, R.raw.audioverde);
        player.start();
    }
}
