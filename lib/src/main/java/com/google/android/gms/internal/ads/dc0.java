package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class dc0 {

    /* renamed from: a, reason: collision with root package name */
    private final i4.e f7254a;

    /* renamed from: b, reason: collision with root package name */
    private final m3.p1 f7255b;

    /* renamed from: c, reason: collision with root package name */
    private final ed0 f7256c;

    dc0(i4.e eVar, m3.p1 p1Var, ed0 ed0Var) {
        this.f7254a = eVar;
        this.f7255b = p1Var;
        this.f7256c = ed0Var;
    }

    public final void a() {
        if (((Boolean) k3.w.c().b(ir.f10055q0)).booleanValue()) {
            this.f7256c.y();
        }
    }

    public final void b(int i10, long j10) {
        if (((Boolean) k3.w.c().b(ir.f10044p0)).booleanValue()) {
            return;
        }
        if (j10 - this.f7255b.e() < 0) {
            m3.n1.k("Receiving npa decision in the past, ignoring.");
            return;
        }
        if (((Boolean) k3.w.c().b(ir.f10055q0)).booleanValue()) {
            this.f7255b.s(i10);
        } else {
            this.f7255b.s(-1);
        }
        this.f7255b.y(j10);
        a();
    }
}
