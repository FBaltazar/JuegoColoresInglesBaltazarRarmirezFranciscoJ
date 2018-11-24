package mx.edu.ittepic.dadm_u3_tclase_welcome_baltazarramirezfj;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;

public class Imagen2
{
    private Bitmap imagen2;
    private float x,y;
    private boolean visible;

    public Imagen2(int recurso, float _x,float _y,Lienzo2 l)
    {
        x = _x;
        y = _y;
        imagen2 = BitmapFactory.decodeResource(l.getResources(),recurso);
        visible=true;
    }

    public void pintar(Canvas c, Paint p)
    {
        if (visible) c.drawBitmap(imagen2,x,y,p);
    }

    public void hacerVisible(boolean v)
    {
        visible=v;
    }

    public boolean estaEnArea(float xp,float yp)
    {
        float x2,y2;

        if (!visible) return false;

        x2 = x + imagen2.getWidth();
        y2 = y + imagen2.getHeight();

        if (xp>=x && xp<=x2)
        {
            if (yp >= y && yp <=y2) return true;

        }
        return false;
    }

    public void mover(float xp,float yp)
    {
        x = xp - (imagen2.getWidth()/2);
        y = yp - (imagen2.getHeight()/2);
    }

    public boolean colision(Imagen2 objetoB)
    {
        float x2,y2;

        x2 = x + imagen2.getWidth();
        y2 = y + imagen2.getHeight();

        if (objetoB.estaEnArea(x2,y)) return true;
        if (objetoB.estaEnArea(x,y))return true;
        if (objetoB.estaEnArea(x2,y2))return true;
        if (objetoB.estaEnArea(x,y2))return true;

        return false;
    }

}
