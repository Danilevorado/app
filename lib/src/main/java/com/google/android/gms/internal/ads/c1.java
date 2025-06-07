package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class c1 implements o0 {

    /* renamed from: a, reason: collision with root package name */
    private final long f6754a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ g1 f6755b;

    public c1(g1 g1Var, long j10) {
        this.f6755b = g1Var;
        this.f6754a = j10;
    }

    @Override // com.google.android.gms.internal.ads.o0
    public final long c() {
        return this.f6754a;
    }

    @Override // com.google.android.gms.internal.ads.o0
    public final boolean g() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.o0
    public final m0 h(long j10) {
        m0 m0VarA = this.f6755b.f8554g[0].a(j10);
        int i10 = 1;
        while (true) {
            g1 g1Var = this.f6755b;
            if (i10 >= g1Var.f8554g.length) {
                return m0VarA;
            }
            m0 m0VarA2 = g1Var.f8554g[i10].a(j10);
            if (m0VarA2.f11886a.f13491b < m0VarA.f11886a.f13491b) {
                m0VarA = m0VarA2;
            }
            i10++;
        }
    }
}
