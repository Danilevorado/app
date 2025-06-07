package k2;

import android.graphics.drawable.Drawable;
import n2.l;

/* loaded from: classes.dex */
public abstract class c implements h {

    /* renamed from: m, reason: collision with root package name */
    private final int f24584m;

    /* renamed from: n, reason: collision with root package name */
    private final int f24585n;

    /* renamed from: o, reason: collision with root package name */
    private j2.c f24586o;

    public c() {
        this(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    public c(int i10, int i11) {
        if (l.s(i10, i11)) {
            this.f24584m = i10;
            this.f24585n = i11;
            return;
        }
        throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: " + i10 + " and height: " + i11);
    }

    @Override // k2.h
    public void a(Drawable drawable) {
    }

    @Override // k2.h
    public final void b(g gVar) {
        gVar.f(this.f24584m, this.f24585n);
    }

    @Override // k2.h
    public final void c(g gVar) {
    }

    @Override // k2.h
    public void d(Drawable drawable) {
    }

    @Override // k2.h
    public final j2.c e() {
        return this.f24586o;
    }

    @Override // k2.h
    public final void h(j2.c cVar) {
        this.f24586o = cVar;
    }

    @Override // g2.m
    public void onDestroy() {
    }

    @Override // g2.m
    public void onStart() {
    }

    @Override // g2.m
    public void onStop() {
    }
}
