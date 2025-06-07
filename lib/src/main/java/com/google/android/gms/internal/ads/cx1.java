package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class cx1 implements a31, o11 {

    /* renamed from: o, reason: collision with root package name */
    private static final Object f7114o = new Object();

    /* renamed from: p, reason: collision with root package name */
    private static int f7115p;

    /* renamed from: m, reason: collision with root package name */
    private final m3.p1 f7116m;

    /* renamed from: n, reason: collision with root package name */
    private final ox1 f7117n;

    public cx1(ox1 ox1Var, m3.p1 p1Var) {
        this.f7117n = ox1Var;
        this.f7116m = p1Var;
    }

    private final void a(boolean z10) {
        int i10;
        int iIntValue;
        if (((Boolean) k3.w.c().b(ir.Q5)).booleanValue() && !this.f7116m.S()) {
            Object obj = f7114o;
            synchronized (obj) {
                i10 = f7115p;
                iIntValue = ((Integer) k3.w.c().b(ir.R5)).intValue();
            }
            if (i10 >= iIntValue) {
                return;
            }
            this.f7117n.e(z10);
            synchronized (obj) {
                f7115p++;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.a31
    public final void m() {
        a(true);
    }

    @Override // com.google.android.gms.internal.ads.o11
    public final void u(k3.w2 w2Var) {
        a(false);
    }
}
