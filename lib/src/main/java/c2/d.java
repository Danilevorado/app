package c2;

import android.graphics.drawable.Drawable;
import t1.v;

/* loaded from: classes.dex */
final class d extends c {
    private d(Drawable drawable) {
        super(drawable);
    }

    static v e(Drawable drawable) {
        if (drawable != null) {
            return new d(drawable);
        }
        return null;
    }

    @Override // t1.v
    public int a() {
        return Math.max(1, this.f4665m.getIntrinsicWidth() * this.f4665m.getIntrinsicHeight() * 4);
    }

    @Override // t1.v
    public Class b() {
        return this.f4665m.getClass();
    }

    @Override // t1.v
    public void c() {
    }
}
