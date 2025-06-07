package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class v52 implements g72 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ w52 f16593a;

    v52(w52 w52Var) {
        this.f16593a = w52Var;
    }

    @Override // com.google.android.gms.internal.ads.g72
    public final void a() {
        synchronized (this.f16593a) {
            this.f16593a.f16993t = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.g72
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        zu0 zu0Var = (zu0) obj;
        synchronized (this.f16593a) {
            w52 w52Var = this.f16593a;
            if (w52Var.f16993t != null) {
                w52Var.f16993t.a();
            }
            this.f16593a.f16993t = zu0Var;
            this.f16593a.f16993t.b();
        }
    }
}
