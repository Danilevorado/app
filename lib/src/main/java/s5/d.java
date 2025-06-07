package s5;

import android.graphics.RectF;

/* loaded from: classes.dex */
public abstract class d {
    public abstract void a(m mVar, float f5, float f10, float f11);

    public void b(m mVar, float f5, float f10, RectF rectF, c cVar) {
        a(mVar, f5, f10, cVar.a(rectF));
    }
}
