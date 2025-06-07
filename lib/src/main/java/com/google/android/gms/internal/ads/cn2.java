package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class cn2 implements g72 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ en2 f6995a;

    cn2(en2 en2Var) {
        this.f6995a = en2Var;
    }

    @Override // com.google.android.gms.internal.ads.g72
    public final void a() {
        synchronized (this.f6995a) {
            this.f6995a.f7912p = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.g72
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        synchronized (this.f6995a) {
            this.f6995a.f7912p = (gj1) obj;
            if (((Boolean) k3.w.c().b(ir.f9929e3)).booleanValue()) {
                ((gj1) obj).j().f17213a = this.f6995a.f7911o;
            }
            this.f6995a.f7912p.b();
        }
    }
}
