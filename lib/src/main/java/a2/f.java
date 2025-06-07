package a2;

import android.content.Context;
import android.graphics.Bitmap;

/* loaded from: classes.dex */
public abstract class f implements r1.l {
    @Override // r1.l
    public final t1.v a(Context context, t1.v vVar, int i10, int i11) {
        if (!n2.l.s(i10, i11)) {
            throw new IllegalArgumentException("Cannot apply transformation on width: " + i10 + " or height: " + i11 + " less than or equal to zero and not Target.SIZE_ORIGINAL");
        }
        u1.d dVarF = com.bumptech.glide.b.c(context).f();
        Bitmap bitmap = (Bitmap) vVar.get();
        if (i10 == Integer.MIN_VALUE) {
            i10 = bitmap.getWidth();
        }
        if (i11 == Integer.MIN_VALUE) {
            i11 = bitmap.getHeight();
        }
        Bitmap bitmapC = c(dVarF, bitmap, i10, i11);
        return bitmap.equals(bitmapC) ? vVar : e.e(bitmapC, dVarF);
    }

    protected abstract Bitmap c(u1.d dVar, Bitmap bitmap, int i10, int i11);
}
