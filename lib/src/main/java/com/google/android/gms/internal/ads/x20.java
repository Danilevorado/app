package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class x20 {

    /* renamed from: a, reason: collision with root package name */
    private final z10 f17351a;

    /* renamed from: b, reason: collision with root package name */
    private ab3 f17352b;

    x20(z10 z10Var) {
        this.f17351a = z10Var;
    }

    private final void d() {
        if (this.f17352b == null) {
            final tf0 tf0Var = new tf0();
            this.f17352b = tf0Var;
            this.f17351a.b(null).e(new xf0() { // from class: com.google.android.gms.internal.ads.v20
                @Override // com.google.android.gms.internal.ads.xf0
                public final void a(Object obj) {
                    tf0Var.e((a20) obj);
                }
            }, new vf0() { // from class: com.google.android.gms.internal.ads.w20
                @Override // com.google.android.gms.internal.ads.vf0
                public final void a() {
                    tf0Var.f(new c20("Cannot get Javascript Engine"));
                }
            });
        }
    }

    public final a30 a(String str, g20 g20Var, f20 f20Var) {
        d();
        return new a30(this.f17352b, "google.afma.activeView.handleUpdate", g20Var, f20Var);
    }

    public final void b(final String str, final gy gyVar) {
        d();
        this.f17352b = qa3.m(this.f17352b, new w93() { // from class: com.google.android.gms.internal.ads.s20
            @Override // com.google.android.gms.internal.ads.w93
            public final ab3 a(Object obj) {
                a20 a20Var = (a20) obj;
                a20Var.b0(str, gyVar);
                return qa3.h(a20Var);
            }
        }, of0.f13191f);
    }

    public final void c(final String str, final gy gyVar) {
        this.f17352b = qa3.l(this.f17352b, new w23() { // from class: com.google.android.gms.internal.ads.t20
            @Override // com.google.android.gms.internal.ads.w23
            public final Object a(Object obj) {
                a20 a20Var = (a20) obj;
                a20Var.C(str, gyVar);
                return a20Var;
            }
        }, of0.f13191f);
    }
}
