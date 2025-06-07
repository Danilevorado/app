package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class a8 implements k8 {

    /* renamed from: a, reason: collision with root package name */
    private k9 f5982a;

    /* renamed from: b, reason: collision with root package name */
    private rt2 f5983b;

    /* renamed from: c, reason: collision with root package name */
    private s0 f5984c;

    public a8(String str) {
        i7 i7Var = new i7();
        i7Var.s(str);
        this.f5982a = i7Var.y();
    }

    @Override // com.google.android.gms.internal.ads.k8
    public final void a(jm2 jm2Var) {
        gt1.b(this.f5983b);
        int i10 = sv2.f15560a;
        long jD = this.f5983b.d();
        long jE = this.f5983b.e();
        if (jD == -9223372036854775807L || jE == -9223372036854775807L) {
            return;
        }
        k9 k9Var = this.f5982a;
        if (jE != k9Var.f10902p) {
            i7 i7VarB = k9Var.b();
            i7VarB.w(jE);
            k9 k9VarY = i7VarB.y();
            this.f5982a = k9VarY;
            this.f5984c.b(k9VarY);
        }
        int i11 = jm2Var.i();
        this.f5984c.a(jm2Var, i11);
        this.f5984c.e(jD, 1, i11, 0, null);
    }

    @Override // com.google.android.gms.internal.ads.k8
    public final void b(rt2 rt2Var, n nVar, x8 x8Var) {
        this.f5983b = rt2Var;
        x8Var.c();
        s0 s0VarS = nVar.S(x8Var.a(), 5);
        this.f5984c = s0VarS;
        s0VarS.b(this.f5982a);
    }
}
