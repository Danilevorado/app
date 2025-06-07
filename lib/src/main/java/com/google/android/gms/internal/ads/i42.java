package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class i42 implements v21 {

    /* renamed from: a, reason: collision with root package name */
    boolean f9537a = false;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ dz1 f9538b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ tf0 f9539c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ j42 f9540d;

    i42(j42 j42Var, dz1 dz1Var, tf0 tf0Var) {
        this.f9540d = j42Var;
        this.f9538b = dz1Var;
        this.f9539c = tf0Var;
    }

    private final synchronized void b(k3.w2 w2Var) {
        int i10 = 1;
        if (true == ((Boolean) k3.w.c().b(ir.f9909c5)).booleanValue()) {
            i10 = 3;
        }
        this.f9539c.f(new ez1(i10, w2Var));
    }

    @Override // com.google.android.gms.internal.ads.v21
    public final synchronized void a(int i10) {
        if (this.f9537a) {
            return;
        }
        this.f9537a = true;
        b(new k3.w2(i10, j42.e(this.f9538b.f7557a, i10), "undefined", null, null));
    }

    @Override // com.google.android.gms.internal.ads.v21
    public final synchronized void f() {
        this.f9539c.e(null);
    }

    @Override // com.google.android.gms.internal.ads.v21
    public final synchronized void q0(k3.w2 w2Var) {
        if (this.f9537a) {
            return;
        }
        this.f9537a = true;
        b(w2Var);
    }

    @Override // com.google.android.gms.internal.ads.v21
    public final synchronized void r0(int i10, String str) {
        if (this.f9537a) {
            return;
        }
        this.f9537a = true;
        if (str == null) {
            str = j42.e(this.f9538b.f7557a, i10);
        }
        b(new k3.w2(i10, str, "undefined", null, null));
    }
}
