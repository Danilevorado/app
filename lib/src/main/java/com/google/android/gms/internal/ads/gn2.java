package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class gn2 {

    /* renamed from: a, reason: collision with root package name */
    private final i4.e f8823a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f8824b = new Object();

    /* renamed from: d, reason: collision with root package name */
    private volatile int f8826d = 1;

    /* renamed from: c, reason: collision with root package name */
    private volatile long f8825c = 0;

    public gn2(i4.e eVar) {
        this.f8823a = eVar;
    }

    private final void e() {
        long jA = this.f8823a.a();
        synchronized (this.f8824b) {
            if (this.f8826d == 3) {
                if (this.f8825c + ((Long) k3.w.c().b(ir.E5)).longValue() <= jA) {
                    this.f8826d = 1;
                }
            }
        }
    }

    private final void f(int i10, int i11) {
        e();
        long jA = this.f8823a.a();
        synchronized (this.f8824b) {
            if (this.f8826d != i10) {
                return;
            }
            this.f8826d = i11;
            if (this.f8826d == 3) {
                this.f8825c = jA;
            }
        }
    }

    public final void a() {
        f(2, 3);
    }

    public final void b(boolean z10) {
        if (z10) {
            f(1, 2);
        } else {
            f(2, 1);
        }
    }

    public final boolean c() {
        boolean z10;
        synchronized (this.f8824b) {
            e();
            z10 = this.f8826d == 3;
        }
        return z10;
    }

    public final boolean d() {
        boolean z10;
        synchronized (this.f8824b) {
            e();
            z10 = this.f8826d == 2;
        }
        return z10;
    }
}
