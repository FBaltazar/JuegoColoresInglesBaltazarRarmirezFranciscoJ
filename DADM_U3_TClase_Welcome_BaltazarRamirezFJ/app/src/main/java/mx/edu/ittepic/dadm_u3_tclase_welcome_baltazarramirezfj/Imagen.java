package mx.edu.ittepic.dadm_u3_tclase_welcome_baltazarramirezfj;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;

public class Imagen
{
   private Bitmap imagen;
    private float x,y;
     private  boolean visible;

    public Imagen(int recurso, float _x,float _y,Lorienzo l)
    {
        x = _x;
        y = _y;
        imagen = BitmapFactory.decodeResource(l.getResources(),recurso);
        visible=true;
    }

    public void pintar(Canvas c, Paint p)
    {
        if (visible) c.drawBitmap(imagen,x,y,p);
    }

    public boolean estaEnArea(float xp,float yp)
    {
        float x2,y2;

        if (!visible) return false;

        x2 = x + imagen.getWidth();
        y2 = y + imagen.getHeight();

        if(xp >= x && xp <= x2)
        {
            if (yp >= y && yp <= y2) return true;
        }

        return false;
    }


}
