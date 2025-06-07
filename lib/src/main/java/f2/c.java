package f2;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import r1.h;
import t1.v;

/* loaded from: classes.dex */
public final class c implements e {

    /* renamed from: a, reason: collision with root package name */
    private final u1.d f23623a;

    /* renamed from: b, reason: collision with root package name */
    private final e f23624b;

    /* renamed from: c, reason: collision with root package name */
    private final e f23625c;

    public c(u1.d dVar, e eVar, e eVar2) {
        this.f23623a = dVar;
        this.f23624b = eVar;
        this.f23625c = eVar2;
    }

    private static v b(v vVar) {
        return vVar;
    }

    @Override // f2.e
    public v a(v vVar, h hVar) {
        Drawable drawable = (Drawable) vVar.get();
        if (drawable instanceof BitmapDrawable) {
            return this.f23624b.a(a2.e.e(((BitmapDrawable) drawable).getBitmap(), this.f23623a), hVar);
        }
        if (drawable instanceof e2.c) {
            return this.f23625c.a(b(vVar), hVar);
        }
        return null;
    }
}
