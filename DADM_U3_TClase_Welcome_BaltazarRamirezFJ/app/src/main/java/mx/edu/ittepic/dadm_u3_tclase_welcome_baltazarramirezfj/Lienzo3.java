package mx.edu.ittepic.dadm_u3_tclase_welcome_baltazarramirezfj;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.media.MediaPlayer;
import android.view.MotionEvent;
import android.view.View;

import static mx.edu.ittepic.dadm_u3_tclase_welcome_baltazarramirezfj.R.raw.audioyellow;

public class Lienzo3 extends View
{
    Imagen3 imgAudioAmarillo,imgAudioAzul,imgAudioBlack,imgAudioPink,imgAudioRojo,imgAudioVerde,
            puntero,puntero2;
Main3Activity sonidito;
    public Lienzo3 (Context context)
    {
        super(context);
        imgAudioAmarillo = new Imagen3(R.drawable.imgaudioamarillo,50,60,this);
        imgAudioAzul = new Imagen3(R.drawable.imgaudioazul,50,525,this);
        imgAudioBlack = new Imagen3(R.drawable.imgaudioblack,50,995,this);
        imgAudioPink = new Imagen3(R.drawable.imgaudiopink,550,60,this);
        imgAudioRojo = new Imagen3(R.drawable.imgaudiorojo,550,525,this);
        imgAudioVerde = new Imagen3(R.drawable.imgaudioverde,550,995,this);

        puntero = null;
        sonidito=(Main3Activity)context;
    }

    public void onDraw(Canvas c)
    {
        super.onDraw(c);
        Paint p = new Paint();

        imgAudioAmarillo.pintar(c,p);
        imgAudioAzul.pintar(c,p);
        imgAudioBlack.pintar(c,p);
        imgAudioPink.pintar(c,p);
        imgAudioRojo.pintar(c,p);
        imgAudioVerde.pintar(c,p);
    }

    public boolean onTouchEvent(MotionEvent e)
    {
        float xp = e.getX();
        float yp = e.getY();

        switch (e.getAction())
        {
            case MotionEvent.ACTION_DOWN:
                if (imgAudioAmarillo.estaEnArea(xp,yp))
                {
                    puntero = imgAudioAmarillo;
                    sonidito.audioAmarillo();
                }
                if (imgAudioAzul.estaEnArea(xp,yp))
                {
                    puntero = imgAudioAzul;
                    sonidito.audioAzul();
                }
                if (imgAudioBlack.estaEnArea(xp,yp))
                {
                    puntero = imgAudioBlack;
                    sonidito.audioBlack();
                }
                if (imgAudioPink.estaEnArea(xp,yp))
                {
                    puntero = imgAudioPink;
                    sonidito.audioPink();
                }
                if (imgAudioRojo.estaEnArea(xp,yp))
                {
                    puntero = imgAudioRojo;
                    sonidito.audioRojo();
                }
                if (imgAudioVerde.estaEnArea(xp,yp))
                {
                    puntero = imgAudioVerde;
                    sonidito.audioVerde();
                }
                break;

            case MotionEvent.ACTION_MOVE:
                break;
            case MotionEvent.ACTION_UP:
                puntero = null;
                break;
        }
        invalidate();
        return true;
    }

}
