package mx.edu.ittepic.dadm_u3_tclase_welcome_baltazarramirezfj;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;

public class Lienzo2 extends View
{
    Imagen2 imgRed,imgBlue,imgVerde,
            imgLetraBlue,imgLetraRed,imgLetraVerde,
            puntero;
    public Lienzo2(Context context)
    {
        super(context);

        imgBlue = new Imagen2(R.drawable.blue,135,140,this);
        imgRed = new Imagen2(R.drawable.red,135,620,this);
        imgVerde = new Imagen2(R.drawable.green,135,1200,this);

        imgLetraBlue = new Imagen2(R.drawable.letrablue,485,620,this);
        imgLetraRed = new Imagen2(R.drawable.letrared,485, 1200,this);
        imgLetraVerde = new Imagen2(R.drawable.letraverde,485,140,this);

        puntero = null;
    }

    public void onDraw(Canvas c)
    {
        super.onDraw(c);
        Paint p = new Paint();

        imgRed.pintar(c,p);
        imgBlue.pintar(c,p);
        imgVerde.pintar(c,p);
        imgLetraBlue.pintar(c,p);
        imgLetraRed.pintar(c,p);
        imgLetraVerde.pintar(c,p);
    }

    public boolean onTouchEvent(MotionEvent e)
    {
        float xp = e.getX();
        float yp = e.getY();

        switch (e.getAction())
        {
            case MotionEvent.ACTION_DOWN:

                if (imgLetraBlue.estaEnArea(xp,yp)) puntero=imgLetraBlue;
                if (imgLetraRed.estaEnArea(xp,yp)) puntero=imgLetraRed;
                if (imgLetraVerde.estaEnArea(xp,yp)) puntero=imgLetraVerde;
                break;
            case MotionEvent.ACTION_MOVE:
                if (puntero!=null)
                {
                    puntero.mover(xp,yp);
                    if (puntero.colision(imgBlue) && puntero == imgLetraBlue)
                    {
                        imgLetraBlue.hacerVisible(false);
                        imgBlue.hacerVisible(false);
                    }
                    if (puntero.colision(imgRed) && puntero== imgLetraRed)
                    {
                        imgLetraRed.hacerVisible(false);
                        imgRed.hacerVisible(false);
                    }
                    if (puntero.colision(imgVerde) && puntero==imgLetraVerde)
                    {
                        imgLetraVerde.hacerVisible(false);
                        imgVerde.hacerVisible(false);
                    }
                }
                break;
            case MotionEvent.ACTION_UP:
                puntero=null;
                break;
        }
        invalidate();
        return true;
    }

}
