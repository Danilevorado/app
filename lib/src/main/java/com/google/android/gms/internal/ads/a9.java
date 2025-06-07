package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes.dex */
final class a9 {

    /* renamed from: a, reason: collision with root package name */
    private final List f6004a;

    /* renamed from: b, reason: collision with root package name */
    private final s0[] f6005b;

    public a9(List list) {
        this.f6004a = list;
        this.f6005b = new s0[list.size()];
    }

    public final void a(long j10, jm2 jm2Var) {
        if (jm2Var.i() < 9) {
            return;
        }
        int iM = jm2Var.m();
        int iM2 = jm2Var.m();
        int iS = jm2Var.s();
        if (iM == 434 && iM2 == 1195456820 && iS == 3) {
            yn4.b(j10, jm2Var, this.f6005b);
        }
    }

    public final void b(n nVar, x8 x8Var) {
        for (int i10 = 0; i10 < this.f6005b.length; i10++) {
            x8Var.c();
            s0 s0VarS = nVar.S(x8Var.a(), 3);
            k9 k9Var = (k9) this.f6004a.get(i10);
            String str = k9Var.f10898l;
            boolean z10 = true;
            if (!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) {
                z10 = false;
            }
            gt1.e(z10, "Invalid closed caption mime type provided: ".concat(String.valueOf(str)));
            i7 i7Var = new i7();
            i7Var.h(x8Var.b());
            i7Var.s(str);
            i7Var.u(k9Var.f10890d);
            i7Var.k(k9Var.f10889c);
            i7Var.c0(k9Var.D);
            i7Var.i(k9Var.f10900n);
            s0VarS.b(i7Var.y());
            this.f6005b[i10] = s0VarS;
        }
    }
}
