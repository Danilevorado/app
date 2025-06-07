package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class r8 implements k8 {

    /* renamed from: a, reason: collision with root package name */
    private final il2 f14677a = new il2(new byte[4], 4);

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ t8 f14678b;

    public r8(t8 t8Var) {
        this.f14678b = t8Var;
    }

    @Override // com.google.android.gms.internal.ads.k8
    public final void a(jm2 jm2Var) {
        if (jm2Var.s() == 0 && (jm2Var.s() & 128) != 0) {
            jm2Var.g(6);
            int i10 = jm2Var.i() / 4;
            for (int i11 = 0; i11 < i10; i11++) {
                jm2Var.a(this.f14677a, 4);
                int iD = this.f14677a.d(16);
                this.f14677a.l(3);
                if (iD == 0) {
                    this.f14677a.l(13);
                } else {
                    int iD2 = this.f14677a.d(13);
                    if (this.f14678b.f15727e.get(iD2) == null) {
                        t8 t8Var = this.f14678b;
                        t8Var.f15727e.put(iD2, new l8(new s8(t8Var, iD2)));
                        this.f14678b.f15733k++;
                    }
                }
            }
            this.f14678b.f15727e.remove(0);
        }
    }

    @Override // com.google.android.gms.internal.ads.k8
    public final void b(rt2 rt2Var, n nVar, x8 x8Var) {
    }
}
