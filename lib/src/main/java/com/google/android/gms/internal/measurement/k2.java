package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
abstract class k2 implements Runnable {

    /* renamed from: m, reason: collision with root package name */
    final long f19043m;

    /* renamed from: n, reason: collision with root package name */
    final long f19044n;

    /* renamed from: o, reason: collision with root package name */
    final boolean f19045o;

    /* renamed from: p, reason: collision with root package name */
    final /* synthetic */ u2 f19046p;

    k2(u2 u2Var, boolean z10) {
        this.f19046p = u2Var;
        this.f19043m = u2Var.f19333b.a();
        this.f19044n = u2Var.f19333b.b();
        this.f19045o = z10;
    }

    abstract void a();

    protected void b() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f19046p.f19338g) {
            b();
            return;
        }
        try {
            a();
        } catch (Exception e5) {
            this.f19046p.i(e5, false, this.f19045o);
            b();
        }
    }
}
