package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class lt2 implements o81, b21, s81 {

    /* renamed from: m, reason: collision with root package name */
    private final au2 f11846m;

    /* renamed from: n, reason: collision with root package name */
    private final ot2 f11847n;

    lt2(Context context, au2 au2Var) {
        this.f11846m = au2Var;
        this.f11847n = nt2.a(context, 13);
    }

    @Override // com.google.android.gms.internal.ads.s81
    public final void a() {
    }

    @Override // com.google.android.gms.internal.ads.s81
    public final void b() {
        if (((Boolean) vs.f16843d.e()).booleanValue()) {
            au2 au2Var = this.f11846m;
            ot2 ot2Var = this.f11847n;
            ot2Var.B0(true);
            au2Var.a(ot2Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.o81
    public final void e() {
    }

    @Override // com.google.android.gms.internal.ads.o81
    public final void h() {
        if (((Boolean) vs.f16843d.e()).booleanValue()) {
            this.f11847n.g();
        }
    }

    @Override // com.google.android.gms.internal.ads.b21
    public final void v0(k3.w2 w2Var) {
        if (((Boolean) vs.f16843d.e()).booleanValue()) {
            au2 au2Var = this.f11846m;
            ot2 ot2Var = this.f11847n;
            ot2Var.Y(w2Var.f().toString());
            ot2Var.B0(false);
            au2Var.a(ot2Var);
        }
    }
}
