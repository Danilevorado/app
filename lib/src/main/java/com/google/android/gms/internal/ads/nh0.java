package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class nh0 implements Runnable {

    /* renamed from: m, reason: collision with root package name */
    private final zg0 f12625m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f12626n = false;

    nh0(zg0 zg0Var) {
        this.f12625m = zg0Var;
    }

    private final void c() {
        b03 b03Var = m3.b2.f25197i;
        b03Var.removeCallbacks(this);
        b03Var.postDelayed(this, 250L);
    }

    public final void a() {
        this.f12626n = true;
        this.f12625m.D();
    }

    public final void b() {
        this.f12626n = false;
        c();
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f12626n) {
            return;
        }
        this.f12625m.D();
        c();
    }
}
