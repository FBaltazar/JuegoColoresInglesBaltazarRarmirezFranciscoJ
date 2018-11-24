package mx.edu.ittepic.dadm_u3_tclase_welcome_baltazarramirezfj;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.media.Image;
import android.view.MotionEvent;
import android.view.View;

public class Lorienzo extends View
{
    MainActivity p;
    Imagen btnJuego,btnSonidos,btnTitulo;
    public Lorienzo(Context context)
    {
        super(context);
        p = (MainActivity) context;
        btnJuego = new  Imagen(R.drawable.btnjuegochido,10,745,this);
        btnSonidos = new Imagen(R.drawable.btnsonidochido,580,745,this);
        btnTitulo = new Imagen(R.drawable.titulox,1,90,this);
    }

    public void onDraw(Canvas c)
    {
        super.onDraw(c);
        Paint p = new Paint();

        btnJuego.pintar(c,p);
        btnSonidos.pintar(c,p);
        btnTitulo.pintar(c,p);
    }

    public boolean onTouchEvent(MotionEvent e)
    {
        float xp = e.getX();
        float yp = e.getY();
        switch (e.getAction())
        {
            case MotionEvent.ACTION_DOWN:
                if (btnJuego.estaEnArea(xp,yp))
                {
                    p.v1();
                }
                if (btnSonidos.estaEnArea(xp,yp))
                {
                    p.v2();
                }
                break;
        }
        invalidate();
        return true;
    }


}
