package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zg4 extends ug4 {

    /* renamed from: i, reason: collision with root package name */
    public static final Object f18585i = new Object();

    /* renamed from: g, reason: collision with root package name */
    private final Object f18586g;

    /* renamed from: h, reason: collision with root package name */
    private final Object f18587h;

    private zg4(h11 h11Var, Object obj, Object obj2) {
        super(h11Var);
        this.f18586g = obj;
        this.f18587h = obj2;
    }

    public static zg4 q(v30 v30Var) {
        return new zg4(new ah4(v30Var), g01.f8518o, f18585i);
    }

    public static zg4 r(h11 h11Var, Object obj, Object obj2) {
        return new zg4(h11Var, obj, obj2);
    }

    @Override // com.google.android.gms.internal.ads.ug4, com.google.android.gms.internal.ads.h11
    public final int a(Object obj) {
        Object obj2;
        h11 h11Var = this.f16332f;
        if (f18585i.equals(obj) && (obj2 = this.f18587h) != null) {
            obj = obj2;
        }
        return h11Var.a(obj);
    }

    @Override // com.google.android.gms.internal.ads.h11
    public final ey0 d(int i10, ey0 ey0Var, boolean z10) {
        this.f16332f.d(i10, ey0Var, z10);
        if (sv2.b(ey0Var.f8040b, this.f18587h) && z10) {
            ey0Var.f8040b = f18585i;
        }
        return ey0Var;
    }

    @Override // com.google.android.gms.internal.ads.h11
    public final g01 e(int i10, g01 g01Var, long j10) {
        this.f16332f.e(i10, g01Var, j10);
        if (sv2.b(g01Var.f8530a, this.f18586g)) {
            g01Var.f8530a = g01.f8518o;
        }
        return g01Var;
    }

    @Override // com.google.android.gms.internal.ads.ug4, com.google.android.gms.internal.ads.h11
    public final Object f(int i10) {
        Object objF = this.f16332f.f(i10);
        return sv2.b(objF, this.f18587h) ? f18585i : objF;
    }

    public final zg4 p(h11 h11Var) {
        return new zg4(h11Var, this.f18586g, this.f18587h);
    }
}
