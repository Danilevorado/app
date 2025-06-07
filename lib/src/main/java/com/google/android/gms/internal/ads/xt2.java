package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class xt2 implements ma3 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ au2 f17810a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ot2 f17811b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ boolean f17812c;

    xt2(au2 au2Var, ot2 ot2Var, boolean z10) {
        this.f17810a = au2Var;
        this.f17811b = ot2Var;
        this.f17812c = z10;
    }

    @Override // com.google.android.gms.internal.ads.ma3
    public final void a(Throwable th) {
        ot2 ot2Var = this.f17811b;
        if (ot2Var.j()) {
            au2 au2Var = this.f17810a;
            ot2Var.D0(th);
            ot2Var.B0(false);
            au2Var.a(ot2Var);
            if (this.f17812c) {
                this.f17810a.g();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.ma3
    public final void b(Object obj) {
        au2 au2Var = this.f17810a;
        ot2 ot2Var = this.f17811b;
        ot2Var.B0(true);
        au2Var.a(ot2Var);
        if (this.f17812c) {
            this.f17810a.g();
        }
    }
}
