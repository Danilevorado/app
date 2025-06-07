package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.io.IOException;

/* loaded from: classes.dex */
final class i84 implements rh4, ge4 {

    /* renamed from: a, reason: collision with root package name */
    private final k84 f9617a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ m84 f9618b;

    public i84(m84 m84Var, k84 k84Var) {
        this.f9618b = m84Var;
        this.f9617a = k84Var;
    }

    private final Pair a(int i10, hh4 hh4Var) {
        hh4 hh4VarC;
        hh4 hh4Var2 = null;
        if (hh4Var != null) {
            k84 k84Var = this.f9617a;
            int i11 = 0;
            while (true) {
                if (i11 >= k84Var.f10870c.size()) {
                    hh4VarC = null;
                    break;
                }
                if (((hh4) k84Var.f10870c.get(i11)).f10404d == hh4Var.f10404d) {
                    hh4VarC = hh4Var.c(Pair.create(k84Var.f10869b, hh4Var.f10401a));
                    break;
                }
                i11++;
            }
            if (hh4VarC == null) {
                return null;
            }
            hh4Var2 = hh4VarC;
        }
        return Pair.create(Integer.valueOf(this.f9617a.f10871d), hh4Var2);
    }

    @Override // com.google.android.gms.internal.ads.rh4
    public final void b(int i10, hh4 hh4Var, final dh4 dh4Var) {
        final Pair pairA = a(0, hh4Var);
        if (pairA != null) {
            this.f9618b.f12011i.H(new Runnable() { // from class: com.google.android.gms.internal.ads.g84
                @Override // java.lang.Runnable
                public final void run() {
                    i84 i84Var = this.f8641m;
                    Pair pair = pairA;
                    i84Var.f9618b.f12010h.b(((Integer) pair.first).intValue(), (hh4) pair.second, dh4Var);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.rh4
    public final void c(int i10, hh4 hh4Var, final xg4 xg4Var, final dh4 dh4Var) {
        final Pair pairA = a(0, hh4Var);
        if (pairA != null) {
            this.f9618b.f12011i.H(new Runnable() { // from class: com.google.android.gms.internal.ads.f84
                @Override // java.lang.Runnable
                public final void run() {
                    i84 i84Var = this.f8177m;
                    Pair pair = pairA;
                    i84Var.f9618b.f12010h.c(((Integer) pair.first).intValue(), (hh4) pair.second, xg4Var, dh4Var);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.rh4
    public final void d(int i10, hh4 hh4Var, final xg4 xg4Var, final dh4 dh4Var) {
        final Pair pairA = a(0, hh4Var);
        if (pairA != null) {
            this.f9618b.f12011i.H(new Runnable() { // from class: com.google.android.gms.internal.ads.e84
                @Override // java.lang.Runnable
                public final void run() {
                    i84 i84Var = this.f7678m;
                    Pair pair = pairA;
                    i84Var.f9618b.f12010h.d(((Integer) pair.first).intValue(), (hh4) pair.second, xg4Var, dh4Var);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.rh4
    public final void f(int i10, hh4 hh4Var, final xg4 xg4Var, final dh4 dh4Var) {
        final Pair pairA = a(0, hh4Var);
        if (pairA != null) {
            this.f9618b.f12011i.H(new Runnable() { // from class: com.google.android.gms.internal.ads.h84
                @Override // java.lang.Runnable
                public final void run() {
                    i84 i84Var = this.f9059m;
                    Pair pair = pairA;
                    i84Var.f9618b.f12010h.f(((Integer) pair.first).intValue(), (hh4) pair.second, xg4Var, dh4Var);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.rh4
    public final void g(int i10, hh4 hh4Var, final xg4 xg4Var, final dh4 dh4Var, final IOException iOException, final boolean z10) {
        final Pair pairA = a(0, hh4Var);
        if (pairA != null) {
            this.f9618b.f12011i.H(new Runnable() { // from class: com.google.android.gms.internal.ads.d84
                @Override // java.lang.Runnable
                public final void run() {
                    i84 i84Var = this.f7223m;
                    Pair pair = pairA;
                    i84Var.f9618b.f12010h.g(((Integer) pair.first).intValue(), (hh4) pair.second, xg4Var, dh4Var, iOException, z10);
                }
            });
        }
    }
}
