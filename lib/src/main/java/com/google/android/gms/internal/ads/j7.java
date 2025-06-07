package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class j7 implements k7 {

    /* renamed from: a, reason: collision with root package name */
    private final List f10329a;

    /* renamed from: b, reason: collision with root package name */
    private final s0[] f10330b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f10331c;

    /* renamed from: d, reason: collision with root package name */
    private int f10332d;

    /* renamed from: e, reason: collision with root package name */
    private int f10333e;

    /* renamed from: f, reason: collision with root package name */
    private long f10334f = -9223372036854775807L;

    public j7(List list) {
        this.f10329a = list;
        this.f10330b = new s0[list.size()];
    }

    private final boolean f(jm2 jm2Var, int i10) {
        if (jm2Var.i() == 0) {
            return false;
        }
        if (jm2Var.s() != i10) {
            this.f10331c = false;
        }
        this.f10332d--;
        return this.f10331c;
    }

    @Override // com.google.android.gms.internal.ads.k7
    public final void a(jm2 jm2Var) {
        if (this.f10331c) {
            if (this.f10332d != 2 || f(jm2Var, 32)) {
                if (this.f10332d != 1 || f(jm2Var, 0)) {
                    int iK = jm2Var.k();
                    int i10 = jm2Var.i();
                    for (s0 s0Var : this.f10330b) {
                        jm2Var.f(iK);
                        s0Var.a(jm2Var, i10);
                    }
                    this.f10333e += i10;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.k7
    public final void b(n nVar, x8 x8Var) {
        for (int i10 = 0; i10 < this.f10330b.length; i10++) {
            u8 u8Var = (u8) this.f10329a.get(i10);
            x8Var.c();
            s0 s0VarS = nVar.S(x8Var.a(), 3);
            i7 i7Var = new i7();
            i7Var.h(x8Var.b());
            i7Var.s("application/dvbsubs");
            i7Var.i(Collections.singletonList(u8Var.f16225b));
            i7Var.k(u8Var.f16224a);
            s0VarS.b(i7Var.y());
            this.f10330b[i10] = s0VarS;
        }
    }

    @Override // com.google.android.gms.internal.ads.k7
    public final void c() {
        this.f10331c = false;
        this.f10334f = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.k7
    public final void d() {
        if (this.f10331c) {
            if (this.f10334f != -9223372036854775807L) {
                for (s0 s0Var : this.f10330b) {
                    s0Var.e(this.f10334f, 1, this.f10333e, 0, null);
                }
            }
            this.f10331c = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.k7
    public final void e(long j10, int i10) {
        if ((i10 & 4) == 0) {
            return;
        }
        this.f10331c = true;
        if (j10 != -9223372036854775807L) {
            this.f10334f = j10;
        }
        this.f10333e = 0;
        this.f10332d = 2;
    }
}
