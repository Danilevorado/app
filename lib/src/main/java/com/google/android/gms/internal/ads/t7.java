package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class t7 implements k7 {

    /* renamed from: a, reason: collision with root package name */
    private final m8 f15705a;

    /* renamed from: e, reason: collision with root package name */
    private long f15709e;

    /* renamed from: g, reason: collision with root package name */
    private String f15711g;

    /* renamed from: h, reason: collision with root package name */
    private s0 f15712h;

    /* renamed from: i, reason: collision with root package name */
    private s7 f15713i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f15714j;

    /* renamed from: l, reason: collision with root package name */
    private boolean f15716l;

    /* renamed from: f, reason: collision with root package name */
    private final boolean[] f15710f = new boolean[3];

    /* renamed from: b, reason: collision with root package name */
    private final z7 f15706b = new z7(7, 128);

    /* renamed from: c, reason: collision with root package name */
    private final z7 f15707c = new z7(8, 128);

    /* renamed from: d, reason: collision with root package name */
    private final z7 f15708d = new z7(6, 128);

    /* renamed from: k, reason: collision with root package name */
    private long f15715k = -9223372036854775807L;

    /* renamed from: m, reason: collision with root package name */
    private final jm2 f15717m = new jm2();

    public t7(m8 m8Var, boolean z10, boolean z11) {
        this.f15705a = m8Var;
    }

    private final void f(byte[] bArr, int i10, int i11) {
        if (!this.f15714j) {
            this.f15706b.a(bArr, i10, i11);
            this.f15707c.a(bArr, i10, i11);
        }
        this.f15708d.a(bArr, i10, i11);
    }

    @Override // com.google.android.gms.internal.ads.k7
    public final void a(jm2 jm2Var) {
        int i10;
        int i11;
        z7 z7Var;
        gt1.b(this.f15712h);
        int i12 = sv2.f15560a;
        int iK = jm2Var.k();
        int iL = jm2Var.l();
        byte[] bArrH = jm2Var.h();
        this.f15709e += jm2Var.i();
        this.f15712h.a(jm2Var, jm2Var.i());
        while (true) {
            int iA = i0.a(bArrH, iK, iL, this.f15710f);
            if (iA == iL) {
                f(bArrH, iK, iL);
                return;
            }
            int i13 = iA + 3;
            int i14 = bArrH[i13] & 31;
            int i15 = iA - iK;
            if (i15 > 0) {
                f(bArrH, iK, iA);
            }
            int i16 = iL - iA;
            long j10 = this.f15709e - i16;
            int i17 = i15 < 0 ? -i15 : 0;
            long j11 = this.f15715k;
            if (this.f15714j) {
                i10 = iL;
                i11 = i13;
            } else {
                this.f15706b.d(i17);
                this.f15707c.d(i17);
                if (this.f15714j) {
                    i10 = iL;
                    i11 = i13;
                    z7 z7Var2 = this.f15706b;
                    if (z7Var2.e()) {
                        this.f15713i.b(i0.d(z7Var2.f18461d, 4, z7Var2.f18462e));
                        z7Var = this.f15706b;
                        z7Var.b();
                    } else {
                        z7 z7Var3 = this.f15707c;
                        if (z7Var3.e()) {
                            this.f15713i.a(i0.c(z7Var3.f18461d, 4, z7Var3.f18462e));
                        }
                    }
                } else {
                    if (this.f15706b.e() && this.f15707c.e()) {
                        ArrayList arrayList = new ArrayList();
                        z7 z7Var4 = this.f15706b;
                        arrayList.add(Arrays.copyOf(z7Var4.f18461d, z7Var4.f18462e));
                        z7 z7Var5 = this.f15707c;
                        arrayList.add(Arrays.copyOf(z7Var5.f18461d, z7Var5.f18462e));
                        z7 z7Var6 = this.f15706b;
                        h0 h0VarD = i0.d(z7Var6.f18461d, 4, z7Var6.f18462e);
                        z7 z7Var7 = this.f15707c;
                        g0 g0VarC = i0.c(z7Var7.f18461d, 4, z7Var7.f18462e);
                        i11 = i13;
                        String strA = iv1.a(h0VarD.f8920a, h0VarD.f8921b, h0VarD.f8922c);
                        s0 s0Var = this.f15712h;
                        i7 i7Var = new i7();
                        i10 = iL;
                        i7Var.h(this.f15711g);
                        i7Var.s("video/avc");
                        i7Var.f0(strA);
                        i7Var.x(h0VarD.f8924e);
                        i7Var.f(h0VarD.f8925f);
                        i7Var.p(h0VarD.f8926g);
                        i7Var.i(arrayList);
                        s0Var.b(i7Var.y());
                        this.f15714j = true;
                        this.f15713i.b(h0VarD);
                        this.f15713i.a(g0VarC);
                        this.f15706b.b();
                    }
                    i10 = iL;
                    i11 = i13;
                }
                z7Var = this.f15707c;
                z7Var.b();
            }
            if (this.f15708d.d(i17)) {
                z7 z7Var8 = this.f15708d;
                this.f15717m.d(this.f15708d.f18461d, i0.b(z7Var8.f18461d, z7Var8.f18462e));
                this.f15717m.f(4);
                this.f15705a.a(j11, this.f15717m);
            }
            if (this.f15713i.e(j10, i16, this.f15714j, this.f15716l)) {
                this.f15716l = false;
            }
            long j12 = this.f15715k;
            if (!this.f15714j) {
                this.f15706b.c(i14);
                this.f15707c.c(i14);
            }
            this.f15708d.c(i14);
            this.f15713i.d(j10, i14, j12);
            iK = i11;
            iL = i10;
        }
    }

    @Override // com.google.android.gms.internal.ads.k7
    public final void b(n nVar, x8 x8Var) {
        x8Var.c();
        this.f15711g = x8Var.b();
        s0 s0VarS = nVar.S(x8Var.a(), 2);
        this.f15712h = s0VarS;
        this.f15713i = new s7(s0VarS, false, false);
        this.f15705a.b(nVar, x8Var);
    }

    @Override // com.google.android.gms.internal.ads.k7
    public final void c() {
        this.f15709e = 0L;
        this.f15716l = false;
        this.f15715k = -9223372036854775807L;
        i0.e(this.f15710f);
        this.f15706b.b();
        this.f15707c.b();
        this.f15708d.b();
        s7 s7Var = this.f15713i;
        if (s7Var != null) {
            s7Var.c();
        }
    }

    @Override // com.google.android.gms.internal.ads.k7
    public final void d() {
    }

    @Override // com.google.android.gms.internal.ads.k7
    public final void e(long j10, int i10) {
        if (j10 != -9223372036854775807L) {
            this.f15715k = j10;
        }
        this.f15716l |= (i10 & 2) != 0;
    }
}
