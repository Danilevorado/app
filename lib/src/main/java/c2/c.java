package c2;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import n2.k;
import t1.r;
import t1.v;

/* loaded from: classes.dex */
public abstract class c implements v, r {

    /* renamed from: m, reason: collision with root package name */
    protected final Drawable f4665m;

    public c(Drawable drawable) {
        this.f4665m = (Drawable) k.d(drawable);
    }

    @Override // t1.v
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final Drawable get() {
        Drawable.ConstantState constantState = this.f4665m.getConstantState();
        return constantState == null ? this.f4665m : constantState.newDrawable();
    }

    @Override // t1.r
    public void initialize() {
        Bitmap bitmapE;
        Drawable drawable = this.f4665m;
        if (drawable instanceof BitmapDrawable) {
            bitmapE = ((BitmapDrawable) drawable).getBitmap();
        } else if (!(drawable instanceof e2.c)) {
            return;
        } else {
            bitmapE = ((e2.c) drawable).e();
        }
        bitmapE.prepareToDraw();
    }
}
