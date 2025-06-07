package androidx.emoji2.text;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;

/* loaded from: classes.dex */
public class g {

    /* renamed from: d, reason: collision with root package name */
    private static final ThreadLocal f2609d = new ThreadLocal();

    /* renamed from: a, reason: collision with root package name */
    private final int f2610a;

    /* renamed from: b, reason: collision with root package name */
    private final m f2611b;

    /* renamed from: c, reason: collision with root package name */
    private volatile int f2612c = 0;

    g(m mVar, int i10) {
        this.f2611b = mVar;
        this.f2610a = i10;
    }

    private g0.a g() {
        ThreadLocal threadLocal = f2609d;
        g0.a aVar = (g0.a) threadLocal.get();
        if (aVar == null) {
            aVar = new g0.a();
            threadLocal.set(aVar);
        }
        this.f2611b.d().j(aVar, this.f2610a);
        return aVar;
    }

    public void a(Canvas canvas, float f5, float f10, Paint paint) {
        Typeface typefaceG = this.f2611b.g();
        Typeface typeface = paint.getTypeface();
        paint.setTypeface(typefaceG);
        canvas.drawText(this.f2611b.c(), this.f2610a * 2, 2, f5, f10, paint);
        paint.setTypeface(typeface);
    }

    public int b(int i10) {
        return g().h(i10);
    }

    public int c() {
        return g().i();
    }

    public int d() {
        return this.f2612c;
    }

    public short e() {
        return g().k();
    }

    public int f() {
        return g().l();
    }

    public short h() {
        return g().m();
    }

    public short i() {
        return g().n();
    }

    public boolean j() {
        return g().j();
    }

    public void k(boolean z10) {
        this.f2612c = z10 ? 2 : 1;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append(", id:");
        sb2.append(Integer.toHexString(f()));
        sb2.append(", codepoints:");
        int iC = c();
        for (int i10 = 0; i10 < iC; i10++) {
            sb2.append(Integer.toHexString(b(i10)));
            sb2.append(" ");
        }
        return sb2.toString();
    }
}
