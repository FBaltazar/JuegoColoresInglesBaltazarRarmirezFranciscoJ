package mx.edu.ittepic.dadm_u3_tclase_welcome_baltazarramirezfj;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;

public class Imagen3
{
    private Bitmap imagen3;
    private float x,y;
    private boolean visible;

    public Imagen3(int recurso, float _x,float _y,Lienzo3 l)
    {
        x = _x;
        y = _y;
        imagen3 = BitmapFactory.decodeResource(l.getResources(),recurso);
        visible=true;
    }

    public void pintar(Canvas c, Paint p)
    {
        if (visible) c.drawBitmap(imagen3,x,y,p);
    }

    public boolean estaEnArea(float xp,float yp)
    {
        float x2,y2;

        if (!visible)
            return false;

        x2 = x + imagen3.getWidth();
        y2 = y + imagen3.getHeight();

        if (xp>=x && xp<=x2)
        {
            if (yp >= y && yp <=y2) return true;

        }
        return false;
    }
}
