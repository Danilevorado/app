package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class ie0 {

    /* renamed from: a, reason: collision with root package name */
    private final Object f9697a = new Object();

    /* renamed from: c, reason: collision with root package name */
    private volatile int f9699c = 1;

    /* renamed from: b, reason: collision with root package name */
    private volatile long f9698b = 0;

    /* synthetic */ ie0(he0 he0Var) {
    }

    public final void a() {
        long jA = j3.t.b().a();
        synchronized (this.f9697a) {
            if (this.f9699c == 3) {
                if (this.f9698b + ((Long) k3.w.c().b(ir.E5)).longValue() <= jA) {
                    this.f9699c = 1;
                }
            }
        }
        long jA2 = j3.t.b().a();
        synchronized (this.f9697a) {
            if (this.f9699c != 2) {
                return;
            }
            this.f9699c = 3;
            if (this.f9699c == 3) {
                this.f9698b = jA2;
            }
        }
    }
}
