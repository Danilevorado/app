package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class xm2 implements g72 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ym2 f17636a;

    xm2(ym2 ym2Var) {
        this.f17636a = ym2Var;
    }

    @Override // com.google.android.gms.internal.ads.g72
    public final void a() {
        synchronized (this.f17636a) {
            this.f17636a.f18111t = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.g72
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        synchronized (this.f17636a) {
            this.f17636a.f18111t = (gj1) obj;
            if (((Boolean) k3.w.c().b(ir.f9929e3)).booleanValue()) {
                ((gj1) obj).j().f17213a = this.f17636a.f18107p;
            }
            this.f17636a.f18111t.b();
        }
    }
}
