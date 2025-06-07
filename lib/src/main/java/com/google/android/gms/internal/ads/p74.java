package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class p74 {

    /* renamed from: a, reason: collision with root package name */
    private boolean f13621a;

    /* renamed from: b, reason: collision with root package name */
    public n84 f13622b;

    /* renamed from: c, reason: collision with root package name */
    public int f13623c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f13624d;

    /* renamed from: e, reason: collision with root package name */
    public int f13625e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f13626f;

    /* renamed from: g, reason: collision with root package name */
    public int f13627g;

    public p74(n84 n84Var) {
        this.f13622b = n84Var;
    }

    public final void a(int i10) {
        this.f13621a = 1 == ((this.f13621a ? 1 : 0) | i10);
        this.f13623c += i10;
    }

    public final void b(int i10) {
        this.f13621a = true;
        this.f13626f = true;
        this.f13627g = i10;
    }

    public final void c(n84 n84Var) {
        this.f13621a |= this.f13622b != n84Var;
        this.f13622b = n84Var;
    }

    public final void d(int i10) {
        if (this.f13624d && this.f13625e != 5) {
            gt1.d(i10 == 5);
            return;
        }
        this.f13621a = true;
        this.f13624d = true;
        this.f13625e = i10;
    }
}
