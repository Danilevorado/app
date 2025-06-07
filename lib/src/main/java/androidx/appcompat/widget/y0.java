package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
class y0 extends r0 {

    /* renamed from: b, reason: collision with root package name */
    private final WeakReference f1405b;

    public y0(Context context, Resources resources) {
        super(resources);
        this.f1405b = new WeakReference(context);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int i10) {
        Drawable drawableA = a(i10);
        Context context = (Context) this.f1405b.get();
        if (drawableA != null && context != null) {
            q0.h().x(context, i10, drawableA);
        }
        return drawableA;
    }
}
